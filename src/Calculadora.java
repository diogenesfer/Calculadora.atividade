import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {



    public static void main(String[] args) {
        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }



        Calculadora c = new Calculadora();
        JFrame tela = new JFrame("Calculator");
        tela.setSize(250,330);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);




        JTextField display = new JTextField();
        tela.getContentPane().add(display);
        display.setBounds(10,11,211,32);
        display.setColumns(10);


        JButton b7 = new JButton("7");
        b7.setFont(new Font("Tahoma", Font.BOLD, 20));
        b7.setBounds(10,54,50,50);
        tela.getContentPane().add(b7);




        JButton b8 = new JButton("8");
        b8.setBounds(66,54,50,50);
        b8.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b8);


        JButton b9 = new JButton("9");
        b9.setBounds(122,54,50,50);
        b9.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b9);

        JButton bmais = new JButton("+");
        bmais.setBounds(178,54,50,50);
        bmais.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(bmais);



        JButton b4 = new JButton("4");
        b4.setBounds(10,110,50,50);
        b4.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(66,110,50,50);
        b5.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b5);


        JButton b6 = new JButton("6");
        b6.setBounds(122,110,50,50);
        b6.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b6);


        JButton bmenos = new JButton("-");
        bmenos.setBounds(178,110,50,50);
        bmenos.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(bmenos);

        JButton b1 = new JButton("1");
        b1.setBounds(10,166,50,50);
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(66,166,50,50);
        b2.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b2);


        JButton b3 = new JButton("3");
        b3.setBounds(122,166,50,50);
        b3.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b3);

        JButton bvezes = new JButton("X");
        bvezes.setBounds(178,166,50,50);
        bvezes.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(bvezes);


        JButton bmaismenos = new JButton("+/-");
        bmaismenos.setBounds(10,222,50,50);
        bmaismenos.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(bmaismenos);


        JButton b0 = new JButton("0");
        b0.setBounds(66,222,50,50);
        b0.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(b0);

        JButton bvirgula = new JButton(",");
        bvirgula.setBounds(122,222,50,50);
        bvirgula.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(bvirgula);

        JButton bigual = new JButton("=");
        bigual.setBounds(178,222,50,50);
        bigual.setFont(new Font("Tahoma", Font.BOLD, 20));
        tela.getContentPane().add(bigual);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
