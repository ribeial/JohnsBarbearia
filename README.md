<h1 align="center">John's Barbearia</h1>

<p align ="center">
 <a href="https://github.com/ribeial/JohnsBarbearia#projeto">Projeto</a> •
 <a href="https://github.com/ribeial/JohnsBarbearia#tecnologias">Tecnologias</a> •
 <a href="https://github.com/ribeial/JohnsBarbearia#dependencias">Dependencias</a> •
 <a href="https://github.com/ribeial/JohnsBarbearia#executando-o-projeto">Executando o Projeto</a> •
 <a href="https://github.com/ribeial/JohnsBarbearia/graphs/contributors">Contrinbuidores</a>
</p><br>

##  Projeto
<p align="center">
Esse projeto tem como intuito facilitar o agendamento de horários de uma barbearia, fazendo com que o barbeiro deixe de lado o caderno e a caneta e passe a usar as tecnologias que estão ao seu dispor.
</p>
<br>
 
##  Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

<div style="display inline_blok"> 
<img align="center" alt="logojava" heigth"70" width="65" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" title="Java" /> 
<img align="center" alt="logonetbeans" heigth"40" width="40"src="https://netbeans.apache.org/images/apache-netbeans.svg" title="Netbeans"/> &nbsp;&nbsp;&nbsp;
<img align="center" alt="simbolosql" heigth"50" width="45"src="https://cdn-icons-png.flaticon.com/512/4248/4248443.png" title="SQL"/> 
<img align="center" alt="logophpmyadmin" heigth"120" width="110" src="https://www.logo.wine/a/logo/PhpMyAdmin/PhpMyAdmin-Logo.wine.svg" title="PhpMyAdmin"/> 
<img align="center" alt="logoWampServer" heigth"50" width="45"src="https://upload.wikimedia.org/wikipedia/commons/f/f4/WampServer-logo.svg" title="WampServer"/> &nbsp;&nbsp;
<img align="center" alt="logojunit" heigth"70" width="90" src="https://avatars1.githubusercontent.com/u/874086?v=3&s=400" title="JUnit"/> 
<img align="center" alt="logomockito" heigth"110" width="120" src="https://raw.githubusercontent.com/mockito/mockito.github.io/master/img/logo%402x.png" title="Mockito"/> 
</div>
<br>   


## Dependencias 
Para a instalação do projeto no sistema operacional **`Windows`** é necessário seguir os seguintes passos:

 - Para execução desse projeto em seu computador é necessário instalar o Kit de Desenvolvimento Java - **[JDK 11](https://www.oracle.com/java/technologies/downloads/#java11)**.

 - Com o JDK instalado faça o download do **[Apache NetBeans IDE 15](https://dlcdn.apache.org/netbeans/netbeans-installers/15/Apache-NetBeans-15-bin-windows-x64.exe)**.

    - Na aba **`windows`** clique no link **`jdk-11.0.17_windows-x64_bin.exe`**.

> Ao clicar no link será aberta uma janela onde você precisa aceitar os termos do Contrato de Licença Oracle para Oracle Java SE, depois  você vai ser redirecionado novamente, para Acessar ou Cliar uma conta Oracle para seu dowload começar.

 - O projeto tem uma conexão com o banco de dados que utliza a linguagem SQL e para executar esse banco de dados é nessessario fazer download do **[WampServer](https://sourceforge.net/projects/wampserver/files/WampServer%203/WampServer%203.0.0/wampserver3.2.6_x64.exe/download)**.
    - Para que o **`WampServer`** funcione normalmente no seu computador é necessário a instalação do **[Microsoft Visual C++ 2012](https://download.microsoft.com/download/1/6/B/16B06F60-3B20-4FF2-B699-5E9B7962F9AE/VSU_4/vcredist_x64.exe)**. 
    
    - Ao instalar WampServer na aba **`Select Components`**, você precisará mudar do padrão **`(MySQL 5.7.36)`** para **`(MySQL 8.0.27)`**.

 - Não definimos uma chave SSH para esse progeto, então indicamos que você faça o clone desse repositório via HTTPS, mas para isso será necessário instalar o **[GIT](https://github.com/git-for-windows/git/releases/download/v2.38.1.windows.1/Git-2.38.1-64-bit.exe)**.

<br>

## Executando o Projeto
Agora que você ja instalou todas as **<a href="https://github.com/ribeial/JohnsBarbearia#dependencias">Dependencias</a>** siga os passos abaixo para executar o projeto:

#### Clonado o repositório

   1. Em seu computardor selecione uma pasta para armazenar o Projeto.

   2. Dentro desta pasta clique com o botão direito do mouse, clique em mostrar mais opções se você utliza o Windows11 depois selecione o **`GIT Bash Here`**.

   3. Quando o Prompt de Comando do GIT Bash abrir, digite o comando abaixo:
   ```
   git clone https://github.com/ribeial/JohnsBarbearia
   ```

#### Abrindo o Projeto no Netbeans
   
   1. Abra o NetBeans e localize o menu **`File`**, selecione a opção **`Open Project`** **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/OpenProject.png?raw=true" target="_blank" >Imagen Ilustrativa</a>**.

   2. Localize a pasta onde você clonou o repositório e selecione o projeto JohnsBarbearia **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/OpenProject2.png?raw=true" target="_blank">Imagen Ilustrativa</a>**.

   3. Depois de fazer os passos acima, seu projeto salvo ira apresentar aguns alertas de erro, por conta que esta faltando adicionar algumas Bibliotecas. Para resolver você irá clicar com o botão direito em cima da pasta **`Libraries`** e selecionar a opção **`Add Jar/Folder`** **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/AdicionarBibiotecas.png?raw=true" target="_blank">Imagen Ilustrativa (1)</a>**, **<a target="_blank" href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/AddJar.folder.png?raw=true">Imagen Ilustrativa (2)</a>**,  Em **`Libraries`** você irá adcionar os arquivos **`junit-4.13.2`** e **`mysql-connector-java-8.0.21`** arquivos da pasta Bibliotecas que está junto do projeto **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/Blibliotecas.png?raw=true" target="_blank">Imagen Ilustrativa (3)</a>**.

   4. Para a pasta **`Test Libraries`** você precisará fazer os mesmos passos do intem aterior, mas os arquivos que precisam ser adicionados são **`junit-4.13.2`** e **`mockito-all-1.8.5`**.

#### Conectando o Projeto Com o Banco de Dados

   1. Para que o projeto rode com o banco de dados é necessário que você execute o **`WampServer`**, anteriomente instalado na etapa **<a href="https://github.com/ribeial/JohnsBarbearia#dependencias">Dependencias</a>**. Quando você executar ele ficará ativo em seu computador **<a href="https://raw.githubusercontent.com/ribeial/JohnsBarbearia/main/JohnsBarbearia/nbproject/example/WampServerBarra.png" target="_blank">Imagen Ilustrativa</a>**. 
> Ao exexutar o WampServer é possível que ele não apareça como na imagem, mas sim no menu escondido  de icones ocultos (**˄**).

   2. Agora é preciso executar o Banco de dados no **`PhpMyAdmin`**, para isso você precisa clicar no icone do **`WampServer`** e depois selecionar PhpMyAdmin e depois phpMyAdmin 5.1.1 **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/WampServerMenu.png?raw=true" target="_blank">Imagen Ilustrativa</a>**.

   3. Ao clicar na opção phpMyAdmin 5.1.1 você sera redirecionado para o link **`http://localhost/phpmyadmin/`** será preciso fazer login na paigina, deixe tudo padrão depois clique em executar

   >Utilizador: root

   >Palavra-passe: não precisa preencher

   >Escolha de servidor: MySql 
   
   - **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/PhpMyAdminHome.png?raw=true" target="_blank">Imagen Ilustrativa</a>**
   
   4. Assim que você entrar será nessário importar o Banco de Dados **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/PhpMyAdminImportar.png" target="_blank">Imagen Ilustrativa (1)</a>**, clicando em **`Escolher Arquivo`** você vai precisar localizar dentro do projeto clonado a pasta **`Banco de Dados`** e selecionar o arquivo SQL **<a href="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/PastaBD.png?raw=true" target="_blank">Imagen Ilustrativa (2)</a>**, depois de escolher o arquivo no final da pagina você clica em executar.

#### Colocando o Projeto para Rodar

- Pronto! Se você executou todo o passo a passo com exito, esse projeto irá executar perfeitamente em seu computador mostrando as telas a seguir ao executar.
 
<p align="center">
<img align="center" alt="Tela De Login" heigth"300" width="300" src="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/TelaLogin.png?raw=true" title="Tela De Login" /> &nbsp;&nbsp;
<img align="center" alt="Tela De Cadastro" heigth"300" width="300"src="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/TelaCadastro.png?raw=true" title="Tela De Cadastro"/> 

<br>

<p align="center">
<img align="center" alt="Tela De agendamento" heigth"300" width="300"src="https://github.com/ribeial/JohnsBarbearia/blob/main/JohnsBarbearia/nbproject/example/TelaAgendamento.png?raw=true" title="Tela De agendamento"/> 
</p>
<br> 


---
#### • Inicio do Projeto: 21/09/2022 • Entrega Final: 02/11/2022
