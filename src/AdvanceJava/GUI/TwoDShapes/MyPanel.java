package AdvanceJava.GUI.TwoDShapes;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel() {
        image = new ImageIcon("./src/AdvanceJava/assets/yt_logo.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(5));
//            g2d.drawLine(0,0, 500,500);   // drawing the line
//            g2d.drawRect(0,0,200,100);    // drawing the rectangle
//            g2d.fillRect(0,0,200,100);
//            g2d.drawOval(0,0,200,100);
//            g2d.fillOval(0,0,200,100);
//
//            g2d.drawArc(0,0,100,100,180,180);
//            g2d.fillArc(0,0,100,100,0,180);
//            g2d.setPaint(Color.white);
//            g2d.fillArc(0,0,100,100,180,180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        g2d.setPaint(Color.yellow);
        g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.fillPolygon(xPoints, yPoints, 3);

        g2d.setPaint(Color.magenta);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2d.drawString("This is a 2D Line", 50, 50);


        g2d.drawImage(image,0,0,null);


    }

}
