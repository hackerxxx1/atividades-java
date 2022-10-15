import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cadastroc implements ActionListener{
    //criar rotulo
    JLabel rotulo,user,pass,label;
    //horas
    long start;
    //botoes
   
    JButton btnconf = new JButton("cadastrar");  
    //criando tela
    JFrame tela = new JFrame("tela de login");
    //criando campos de escrita
    JTextField use= new JTextField();
    JPasswordField pas = new JPasswordField();
  
    public Cadastroc() {
        
        
       
         //criando o rotulos da janela
         pass=new JLabel("Senha:");    
         user=new JLabel("Usuario:");    
         rotulo = new JLabel("Por favor digite as informações de login");
         //ajustando tamanhos
         user.setBounds(20,30, 80,30);    
         pass.setBounds(20,80, 80,30);    
         btnconf.setBounds(100,120, 120,30);    
         pas.setBounds(100,80,100,30);   
         use.setBounds(100,30,100,30);   
         rotulo.setBounds(50,0,400,30);   
         //adicionar evento 
         btnconf.addActionListener(this);
        
         //layout flow
         tela.setLayout(new FlowLayout());
         //adicionando no container todos os componentes
         tela.add(user);
         tela.add(pas);
         tela.add(pass);
         tela.add(btnconf);
         tela.add(use);
         tela.add(rotulo);
         //colocando tamanho do swing
         tela.setSize(400,250);
        tela.setLayout(null);
        //seta condição de saida da janela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //liberando para visualização'
       // tela.setVisible(true);
    }

    public void nav(Boolean b) {
        tela.setVisible(b);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("cadastrar") && use.getText() !="") {
            switch (JOptionPane.showConfirmDialog(null, "Deseja cadastrar o usuario: "+use.getText())) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Usuario "+use.getText()+" cadastrado com sucesso");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario "+use.getText()+" não cadastrado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Cancelado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro indefinido");
                    break;
            }
                
           
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar aeronave");
        }
        
      
    }
}
