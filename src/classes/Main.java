package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Main {

    public static class jogo extends JFrame{

        private static final long serialVersionUID = 1l;
        int num;
        ImageIcon copo = new ImageIcon("src/classes/imagens/copo.png");
        ImageIcon copoA = new ImageIcon("src/classes/imagens/copoA.png");//copo com bola
        ImageIcon copoB = new ImageIcon("src/classes/imagens/copoB.png");//copo sem bola
        JButton botao1;
        JButton botao2;
        JButton botao3;

         public jogo(){

            super("Encontre a bola");
            setSize(800,600);
            setLocationRelativeTo( null );
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.lightGray);

            setLayout(null);

            //label titulo
            JLabel titulo = new JLabel("Encontre a bola");
            titulo.setFont(new Font("Comic Sans Ms",1,50));
            titulo.setBounds(200,1,3000,100);
            add(titulo);



            //botao1
            botao1 = new JButton("Copo 1");
            botao1.setBackground(getContentPane().getBackground());
            botao1.addActionListener(new Action_button1());
            botao1.setBounds(120,200,140,209);
            add(botao1);

            //botao2
            botao2 = new JButton("Copo 2");
            botao2.setBackground(getContentPane().getBackground());
            botao2.addActionListener(new Action_button2());
            botao2.setBounds(320,200,140,209);
            add(botao2);

            //botao3
            botao3 = new JButton("Copo 3");
            botao3.setBackground(getContentPane().getBackground());
            botao3.addActionListener(new Action_button2());
            botao3.setBounds(520,200,140,209);
            add(botao3);

             iniciaJogo();

        }


        public class Action_button1 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num == 1) {
                    ((JButton)e.getSource()).setIcon(copoA);
                    JOptionPane.showMessageDialog(null,"Você acertou, reiniciado...", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    iniciaJogo();
                }else {
                    ((JButton)e.getSource()).setIcon(copoB);
                    JOptionPane.showMessageDialog(null,"Você errou, reiniciado...", "Alerta", JOptionPane.ERROR_MESSAGE);
                    iniciaJogo();
                }
            }
        }

        public class Action_button2 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num == 2) {
                    ((JButton)e.getSource()).setIcon(copoA);
                    JOptionPane.showMessageDialog(null,"Você acertou, reiniciado...", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    iniciaJogo();
                }else {
                    ((JButton)e.getSource()).setIcon(copoB);
                    JOptionPane.showMessageDialog(null,"Você errou, reiniciado...", "Alerta", JOptionPane.ERROR_MESSAGE);
                    iniciaJogo();
                }
            }
        }

        public class Action_button3 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num == 3) {
                    ((JButton)e.getSource()).setIcon(copoA);
                    JOptionPane.showMessageDialog(null,"Você acertou, reiniciado...", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    iniciaJogo();
                }else {
                    ((JButton)e.getSource()).setIcon(copoB);
                    JOptionPane.showMessageDialog(null,"Você errou, reiniciado...", "Alerta", JOptionPane.ERROR_MESSAGE);
                    iniciaJogo();
                }
            }
        }

        private void iniciaJogo(){
            botao1.setIcon(copo);
            botao2.setIcon(copo);
            botao3.setIcon(copo);
            num = Aleatorio.Return_numero();
        }


    }

    public static class Aleatorio{
        public static int Return_numero(){
            return 1 + (int)(3*Math.random());
        }
    }


    public static void main(String[] args) {
        new jogo().setVisible(true);
    }

}
