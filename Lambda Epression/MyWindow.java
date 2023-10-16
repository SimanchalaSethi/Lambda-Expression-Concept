import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {
        //window : object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());


        // create button and Jframe
        JButton button = new JButton("Click Me !!");
        button.addActionListener(( e)->{
            System.out.println("Button Click");
            JOptionPane.showConfirmDialog(null,"hey button click" );
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
