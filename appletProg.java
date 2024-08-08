package com.example.npteljavaexercise;

import javax.swing.*;
import java.awt.*;

public class appletProg extends JPanel {

    public void init(JFrame frame){
        frame.setSize(300, 300);
        this.setBackground(Color.CYAN);

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello World", 150, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppletPractice");
        appletProg panel = new appletProg();

        panel.init(frame);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}