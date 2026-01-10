package AdvanceJava.GUI.TwoDShapes;

import javax.swing.*;

public class LineG extends JFrame {
    MyPanel panel;

    LineG() {

        panel = new MyPanel();
        this.setTitle("This is a 2D Line");
        this.setResizable(false);

        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
