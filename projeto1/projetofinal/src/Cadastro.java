import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cadastro implements ActionListener{
    //criar rotulo
    JLabel rotulo,fab,model,cod,label;
    //horas
    long start;
    //botoes
   
    JButton btnconf = new JButton("cadastrar");  
    //criando tela
    JFrame tela = new JFrame("tela de login");
    //criando campos de escrita
    JTextField fabri= new JTextField();
    JTextField mode= new JTextField();
    JTextField code= new JTextField();
    public Cadastro() {
        
        
       
        //criando o rotulos da janela
        cod=new JLabel("Codigo:");    
        model=new JLabel("Modelo:");    
        fab=new JLabel("fabricante:");    
        rotulo = new JLabel("Por favor digite as informações de login");
        //ajustando tamanhos
        fab.setBounds(20,20, 80,30);    
        model.setBounds(20,70, 80,30);    
        cod.setBounds(20,120, 100,30);    
        btnconf.setBounds(100,200, 120,30);    
        code.setBounds(100,120,100,30);   
        mode.setBounds(100,70,100,30);   
        fabri.setBounds(100,20,100,30);   
        //adicionar evento 
     
        btnconf.addActionListener(this);
        //layout flow
        tela.setLayout(new FlowLayout());
        //adicionando no container todos os componentes
       
        tela.add(fab);
        tela.add(cod);
        tela.add(fabri);
        tela.add(model);
        tela.add(btnconf);
        tela.add(mode);
        tela.add(code);
        tela.add(rotulo);
        //colocando tamanho do swing
        tela.setSize(400,400);
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
        if (e.getActionCommand().equals("cadastrar") && fabri.getText() !=""&& mode.getText() !=""&& code.getText() !="") {
            JOptionPane.showMessageDialog(null, "Aeronave cadastrada com sucesso "+fabri.getText()+" "+mode.getText()+" "+code.getText()+" ");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar aeronave");
        }
        
      
    }
}
