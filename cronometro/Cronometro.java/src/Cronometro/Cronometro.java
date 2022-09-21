package Cronometro;
/**
 * Cronometro
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class Cronometro implements ActionListener {
  
   
   
        //criar rotulo
        JLabel rotulo;
        //horas
        long start;
        //botoes
        private JButton btnStart = new JButton("começar");
        private JButton btnStop = new JButton("parar");
        
        public Cronometro() {
            //criando tela
            JFrame tela = new JFrame("tela top demais");
            //criando o rotulo da janela
            rotulo = new JLabel("aperta ai pra começar");
            //adicionar evento 
            btnStart.addActionListener(this);
            btnStop.addActionListener(this);
            //layout flow
            tela.setLayout(new FlowLayout());
            //adicionando no container todos os componentes
            tela.add(btnStart);
            tela.add(btnStop);
            tela.add(rotulo);
            //colocando tamanho do swing
            tela.setSize(400,400);
            //seta condição de saida da janela
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //liberando para visualização'
            tela.setVisible(true);
        }

    
        public void actionPerformed(ActionEvent e) {
            
            //obter hora sistema
            Calendar cal = Calendar.getInstance();
            // armazenar hora
            if (e.getActionCommand().equals("começar")) {
                start = cal.getTimeInMillis();
                rotulo.setText("cronometro esta rodando");
            }else{
                rotulo.setText("o tempo contado foi de:"+(double)(cal.getTimeInMillis()-start)/1000);
            }
        }
     
   
}