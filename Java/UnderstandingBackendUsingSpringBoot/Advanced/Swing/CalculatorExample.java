package Java.Advanced.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}

class Calculator extends JFrame implements ActionListener {
    JButton add, mul, div, mod, sub;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JPanel p1, p2, p3;

    public Calculator() {
        super("Calculator GUI");

        p1 = new JPanel();

        l1 = new JLabel("Enter Number 1 : ");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter Number 2 : ");
        t2 = new JTextField(10);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);

        add(p1, "North");

        p2 = new JPanel();
        add = new JButton("ADD (+) ");
        sub = new JButton("Subtraction (-) ");
        mul = new JButton("Multiply (*) ");
        div = new JButton("Division (/) ");
        mod = new JButton("Modulus (%) ");
        p2.add(add);
        p2.add(sub);
        p2.add(mul);
        p2.add(div);
        p2.add(mod);

        add(p2, "Center");

        p3 = new JPanel();
        l3 = new JLabel("Result Of the Operation : ");
        l4 = new JLabel();
        p3.add(l3);
        p3.add(l4);

        add(p3, "South");

        setVisible(true);
        setSize(600, 150);

        add.addActionListener(this); // connecting the button to actionPerformed
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        if (e.getSource().equals(add)) {
            int sum = num1 + num2;
            l4.setText("Addition is : " + sum);
        } else if (e.getSource().equals(sub)) {
            int minus = num1 - num2;
            l4.setText("Subtraction is : " + minus);
        } else if (e.getSource().equals(mul)) {
            int prod = num1 * num2;
            l4.setText("Product is : " + prod);
        } else if (e.getSource().equals(div)) {
            int division = num1 / num2;
            l4.setText("Division is : " + division);
        } else if (e.getSource().equals(mod)) {
            int modulus = num1 % num2;
            l4.setText("Modulus is : " + modulus);
        } else {
            l4.setText("Come on Dude, Invalid Option");
        }
    }
}