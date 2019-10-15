import javax.swing.*;
import java.awt.*;

public class Loader {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Form form = new Form();

        frame.setContentPane(form.getRootPanel());
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("My first application");
        centerFrame(frame);
        frame.setVisible(true);
        System.out.println("Hi!");

    }

    public static void centerFrame(Window frame) {

        frame.setLocationRelativeTo(null);
    }
}
