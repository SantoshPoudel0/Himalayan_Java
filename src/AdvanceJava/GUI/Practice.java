package AdvanceJava.GUI;

//import javax.swing.JLabel;  --> individual import as what needed.
//import javax.swing.JFrame;

import javax.swing.*;           // all in one AdvanceJava.AdvanceJava.assets.assets.GUI import

public class Practice {

    public static void main(String[] args){

      JFrame frame  = new  JFrame();

      JButton button = new  JButton("click");
        button.setBounds(200,200,200,200);
        frame.setTitle("AdvanceJava practice");


        // image set ------------ //
        ImageIcon icon = new ImageIcon("src/AdvanceJava/assets/icon.jpg");
        frame.setIconImage(icon.getImage());


        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
