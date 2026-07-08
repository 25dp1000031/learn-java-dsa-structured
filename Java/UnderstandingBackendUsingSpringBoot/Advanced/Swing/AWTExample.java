package Java.Advanced.Swing;

import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        TestAWT t = new TestAWT();
    }
}

class TestAWT extends Frame {
    Button id;
    Button password;
    Button submit;
    Frame frame;

    // or we could have just done like Button id, pass, submit :)
    public TestAWT() {
        // frame will follow border layout by default
        frame = new Frame("Login Form");
        frame.setLayout(new FlowLayout());
        // setLayout(new FlowLayout());
        id = new Button("ID");
        password = new Button("Password");
        submit = new Button("Submit");

        frame.add(id);
        frame.add(password);
        frame.add(submit);

        frame.setVisible(true);
        frame.setSize(300, 400);
    }
}