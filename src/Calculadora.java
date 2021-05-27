import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    static JFrame tela;

    public static void main(String args[]){

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Calculadora c = new Calculadora();
        JFrame tela = new JFrame("Calculator");
        JPanel preenchimento = new JPanel();
        tela.setSize(260, 350);
        tela.getContentPane().add(preenchimento);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField display = new JTextField();
        preenchimento.add(display);
        display.setColumns(20);


        JButton b7 = new JButton("7");
        preenchimento.add(b7);
        b7.setFont(new Font("Tahoma", Font.BOLD, 20));
        b7.setSize(50,50);


        JButton b8 = new JButton("8");
        preenchimento.add(b8);
        b8.setFont(new Font("Tahoma", Font.BOLD, 20));
        b8.setSize(50,50);

        JButton b9 = new JButton("9");
        preenchimento.add(b9);
        b9.setFont(new Font("Tahoma", Font.BOLD, 20));
        b9.setSize(50,50);

        JButton bmais = new JButton("+");
        preenchimento.add(bmais);
        bmais.setFont(new Font("Tahoma", Font.BOLD, 20));
        bmais.setSize(50,50);


        JButton b4 = new JButton("4");
        preenchimento.add(b4);
        b4.setFont(new Font("Tahoma", Font.BOLD, 20));
        b4.setSize(50,50);

        JButton b5 = new JButton("5");
        preenchimento.add(b5);
        b5.setFont(new Font("Tahoma", Font.BOLD, 20));
        b5.setSize(50,50);


        JButton b6 = new JButton("6");
        preenchimento.add(b6);
        b6.setFont(new Font("Tahoma", Font.BOLD, 20));
        b6.setSize(50,50);


        JButton bmenos = new JButton("-");
        preenchimento.add(bmenos);
        bmenos.setFont(new Font("Tahoma", Font.BOLD, 20));
        bmenos.setSize(50, 50);

        JButton b1 = new JButton("1");
        preenchimento.add(b1);
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));
        b1.setSize(50, 50);

        JButton b2 = new JButton("2");
        preenchimento.add(b2);
        b2.setFont(new Font("Tahoma", Font.BOLD, 20));
        b2.setSize(50, 50);

        JButton b3 = new JButton("3");
        preenchimento.add(b3);
        b3.setFont(new Font("Tahoma", Font.BOLD, 20));
        b3.setSize(50, 50);

        JButton bvezes = new JButton("X");
        preenchimento.add(bvezes);
        bvezes.setFont(new Font("Tahoma", Font.BOLD, 20));
        bvezes.setSize(50, 50);

        JButton bmaismenos = new JButton("+/-");
        preenchimento.add(bmaismenos);
        bmaismenos.setFont(new Font("Tahoma", Font.BOLD, 20));
        bmaismenos.setSize(50, 50);

        JButton b0 = new JButton("0");
        preenchimento.add(b0);
        b0.setFont(new Font("Tahoma", Font.BOLD, 20));
        b0.setSize(50, 50);

        JButton bvirgula = new JButton(",");
        preenchimento.add(bvirgula);
        bvirgula.setFont(new Font("Tahoma", Font.BOLD, 20));
        bvirgula.setSize(50, 50);

        JButton bigual = new JButton("=");
        preenchimento.add(bigual);
        bigual.setFont(new Font("Tahoma", Font.BOLD, 20));
        bigual.setSize(50, 50);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
