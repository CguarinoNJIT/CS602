/******
 * Program Name : FlowLayoutDemo.java
 * Description  : Swing FlowLayout Demo
 ******/

import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
     
    public FlowLayoutDemo() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
   
        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("2"));
        contentPane.add(new JButton("Button 3"));
        contentPane.add(new JButton("Long-Named Button 4"));
        contentPane.add(new JButton("Button 5"));
    }

    public static void main(String args[]) {
        FlowLayoutDemo mainFrame = new FlowLayoutDemo();

        mainFrame.setTitle("FlowLayout");
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
