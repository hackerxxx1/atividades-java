package Cronometro;
/**
 * Cronometro
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
            //adicionar evento 
            btnStart.addActionListener(this);
            btnStop.addActionListener(this);
            //layout flow
            tela.setLayout(new FlowLayout());
            //adicionando no container
            tela.add(btnStart);
            tela.add(btnStop);
            //colocando tamanho do swing
            tela.setSize(400,400);
            //seta condição de saida da janela
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    
        public void actionPerformed(ActionEvent e) {
            
            
        }
     
   
}