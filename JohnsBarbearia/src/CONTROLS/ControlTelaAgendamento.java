package CONTROLS;

import DAO.AgendamentoDAO;
import DTO.AgendamentoDTO;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import EXCEPTIONS.NaoFoiPossivelRealizarAgendamento;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlTelaAgendamento {

    public static boolean CriarAgendamento(String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento,
            String CPF_usuario)
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento,
            SQLException {

        AgendamentoDTO objAgendamentoDTO = new AgendamentoDTO();
        objAgendamentoDTO.setNome_cliente(nome_cliente);
        objAgendamentoDTO.setServico(servico);
        objAgendamentoDTO.setValor_servico(valor_servico);
        objAgendamentoDTO.setData_agendamento(data_agendamento);
        objAgendamentoDTO.setHora_agendamento(hora_agendamento);
        objAgendamentoDTO.setObservacao_agendamento(observacao_agendamento);

        AgendamentoDAO objAgendamentoDAO = new AgendamentoDAO();
        objAgendamentoDAO.Agendar(objAgendamentoDTO);
        return true;

    }

    public static String Agendar(String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento,
            String CPF_usuario)
            throws NaoFoiPossivelEstabelecerConexaoComBD,
            NaoFoiPossivelRealizarAgendamento,
            SQLException {

        String response = null;
        if (nome_cliente.equals("")
                || valor_servico.equals("")
                || data_agendamento.equals("")
                || hora_agendamento.equals("")
                || observacao_agendamento.equals("")) {
            response = " CAMPOS VAZIOS!\n Por favor insira os dados ";

        } else if (ControlTelaAgendamento.CriarAgendamento(nome_cliente,
                servico,
                valor_servico,
                data_agendamento,
                hora_agendamento,
                observacao_agendamento,
                CPF_usuario)) {
            response = null;
        }
        return response;
    }

    public static JTable LerTabela(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        DefaultTableModel modelo
                = (DefaultTableModel) TabelaAgendamentoJTable.getModel();
        modelo.setNumRows(0);
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        for (AgendamentoDTO agendar : agendamentoDAO.Horarios()) {
            modelo.addRow(new Object[]{
                agendar.getNome_cliente(),
                agendar.getServico(),
                agendar.getValor_servico(),
                agendar.getData_agendamento(),
                agendar.getHora_agendamento(),
                agendar.getObservacao_agendamento()});
        }
        return TabelaAgendamentoJTable;

    }

    public static void ExcluirAgendamento(JTable TabelaAgendamentoJTable)
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        if (TabelaAgendamentoJTable.getSelectedRow() != -1) {
            AgendamentoDTO agendar = new AgendamentoDTO();
            AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
            agendar.setNome_cliente((String) TabelaAgendamentoJTable.getValueAt(
                    TabelaAgendamentoJTable.getSelectedRow(), 0));
            agendamentoDAO.Excluir(agendar);
        }
    }

    public static boolean EditarAgendamento(JTable TabelaAgendamentoJTable,
            String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        AgendamentoDTO agendar = new AgendamentoDTO();
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();

        agendar.setNome_cliente(nome_cliente);
        agendar.setServico(servico);
        agendar.setValor_servico(valor_servico);
        agendar.setData_agendamento(data_agendamento);
        agendar.setHora_agendamento(hora_agendamento);
        agendar.setObservacao_agendamento(observacao_agendamento);
        agendamentoDAO.Editar(agendar);

        return true;

    }

    public static String Editar(JTable TabelaAgendamentoJTable,
            String nome_cliente,
            String servico,
            String valor_servico,
            String data_agendamento,
            String hora_agendamento,
            String observacao_agendamento)
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        String response = null;
        if (nome_cliente.equals("")
                || servico.equals("")
                || valor_servico.equals("")
                || data_agendamento.equals("")
                || hora_agendamento.equals("")
                || observacao_agendamento.equals("")) {
            response = " CAMPOS VAZIOS!\n Por favor insira os dados ";

        } else if (ControlTelaAgendamento.EditarAgendamento(TabelaAgendamentoJTable,
                nome_cliente,
                servico,
                valor_servico,
                data_agendamento,
                hora_agendamento,
                observacao_agendamento)) {
            response = null;
        }
        return response;
    }
}
