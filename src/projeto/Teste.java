package projeto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Teste {

    Color cor1 = Color.BLACK;
    Color cor2 = Color.BLUE;

    JButton b1 = new JButton("Mudar Cor 1");
    JButton b2 = new JButton("Mudar Cor 2");
    JFrame frame = new JFrame();
    JGradientPanel painel = new JGradientPanel(cor1, cor2);

    public Teste() {

        frame.setContentPane(painel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.add(b1);
        b1.setBounds(500, 340, 100, 20);

        frame.add(b2);
        b1.setBounds(500, 500, 100, 20);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cor1 =  JColorChooser.showDialog(frame, "escolha sua cor", cor1);              
                painel.setInitialColor(cor1);
                painel.repaint();
                
            }
        });
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cor2 =  JColorChooser.showDialog(null, "escolha sua cor", cor2);
                 painel.setFinalColor(cor2);
                 painel.repaint();
            }
        });

    }

    public static void main(String[] args) {

        Teste a = new Teste();
    }
}
