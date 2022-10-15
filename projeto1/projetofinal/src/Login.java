
/**
 * Cronometro
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login implements ActionListener {
  
   
   
        //criar rotulo
        JLabel rotulo,user,pass,label;
        //horas
        long start;
        //botoes
        JButton btnlogin = new JButton("login");  
        //criando campos de escrita
        JTextField text = new JTextField();
        JPasswordField value = new JPasswordField();
        //criando tela
        JFrame tela = new JFrame("tela de login");
        public Login() {
           
            
            //criando o rotulos da janela
            pass=new JLabel("Senha:");    
            user=new JLabel("Usuario:");    
            rotulo = new JLabel("Por favor digite as informações de login");
            //ajustando tamanhos
            user.setBounds(20,30, 80,30);    
            pass.setBounds(20,80, 80,30);    
            btnlogin.setBounds(100,120, 80,30);    
            value.setBounds(100,80,100,30);   
            text.setBounds(100,30,100,30);   
            rotulo.setBounds(50,0,400,30);   
            //adicionar evento 
            btnlogin.addActionListener(this);
           
            //layout flow
            tela.setLayout(new FlowLayout());
            //adicionando no container todos os componentes
            tela.add(user);
            tela.add(value);
            tela.add(pass);
            tela.add(btnlogin);
            tela.add(text);
            tela.add(rotulo);
            //colocando tamanho do swing
            tela.setSize(400,250);
            tela.setLayout(null);
            //seta condição de saida da janela
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //liberando para visualização'
            // 
        }
        
        public void nav(Boolean b) {
            tela.setVisible(b);
        }
    
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "login":
                    if (text.getText().toLowerCase().equals("senai")) {
                        rotulo.setText("Bem vindo adm");
                        JOptionPane.showMessageDialog(null,"bem vindo adm" );
                    }else{
                        rotulo.setText("tente de novo");
                        JOptionPane.showMessageDialog(null,"tenta de novo ai" );
                    }
                    break;
            
                default:
                    rotulo.setText("voce esta clicando no botao: "+e.getActionCommand() );
                    break;
            } 
         
           
        }
     
   
}