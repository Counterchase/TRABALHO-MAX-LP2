package projeto;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Teste {

    public Teste() {
        
        JFrame frame = new JFrame();
        JGradientPanel painel = new JGradientPanel(Color.WHITE, Color.BLUE);
        frame.setContentPane(painel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JButton b1 = new JButton("Mudar Cor 1");
        frame.add(b1);
        b1.setBounds(500, 340, 100, 20);

        JButton b2 = new JButton("Mudar Cor 2");
        frame.add(b2);
        b1.setBounds(500, 500, 100, 20);
       
    }
    
    
    
    

    public static void main(String[] args) {
        
        Teste a = new Teste();
    }
}
