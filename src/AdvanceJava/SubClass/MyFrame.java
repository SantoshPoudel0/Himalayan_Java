package AdvanceJava.SubClass;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {

        this.setTitle("YouTube");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500, 500);

        // Set icon
        ImageIcon image = new ImageIcon("src/AdvanceJava/assets/yt_logo.png");
        this.setIconImage(image.getImage());

        // Set background
        this.getContentPane().setBackground(Color.GRAY);

        // Optional: Add a label
        JLabel label = new JLabel("Hello World");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(label);

        // Always call at end
        this.setVisible(true);
    }
}
