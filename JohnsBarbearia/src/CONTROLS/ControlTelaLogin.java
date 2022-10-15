package CONTROLS;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import HELPERS.Cliptografia;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlTelaLogin {

    public static void entrarSistema(String email_usuario,
            String senha_usuario) {

        try {
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setEmail_usuario(email_usuario);
            objusuariodto.setSenha_usuario( //verificar se está chamAndo senha criptografada
                    Cliptografia.criptografiaDaSenha(senha_usuario));

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet usuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);

            if (usuariodao.next()) {
                // chama tela que eu quero abrir    
                JFrameTelaAgendamento objJframeTelaAgendamento = new JFrameTelaAgendamento();
                objJframeTelaAgendamento.setVisible(true);

            } else {
                // enviar mensagem dizendo incorreto   
                JOptionPane.showMessageDialog(null,
                        //criar um metodo que diferncie o usario inválido da senha inválida
                        "usuario ou senha inválido");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "erro ao entrar" + erro);
        }
    }

    public static void criarcontaJButtonActionPerformed() {
        JFrameTelaCadastro janelaJframeTelaCadastro = new JFrameTelaCadastro();
        janelaJframeTelaCadastro.setVisible(true);
    }
}