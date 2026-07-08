package Java.Advanced.Swing;

//import the required packages
import javax.swing.*;
import java.awt.*;
/* create a frame by extending a class with Frame
    create panel
    create components and add to the panel
    add panel to the frame
    setVisibility to true
*/

public class FrameExample {
    public static void main(String[] args) {
        FrameSwing f = new FrameSwing();
    }
}

class FrameSwing extends JFrame {
    JButton id, password, submit;
    JPanel p1, p2;

    public FrameSwing() { // for frame and border layout
        super("Login Form");
        id = new JButton("Id");
        password = new JButton("Password");
        submit = new JButton("submit");

        p1 = new JPanel(); // by default, FlowLayout
        p1.add(id);
        p1.add(password);
        add(p1, "North");
        p2 = new JPanel();
        p2.add(submit);
        add(p2, "South");

        setVisible(true);
        setSize(300, 400);
    }
}
