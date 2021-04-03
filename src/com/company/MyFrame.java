package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyFrame extends JFrame{
    JPanel[] panel = new JPanel[5];
    JFrame frame = new JFrame();

   MyFrame() {
       JPanelSetter jPanelSetter = new JPanelSetter();
        ImageIcon icon = new ImageIcon("src\\com\\company\\images\\Image_icon.jpg");
        frame.setTitle("Laba 1");
        frame.setSize(2000, 700);
        frame.setIconImage(icon.getImage());

        for (int i = 0; i < 5; i++) {
            panel[i] = new JPanel();
            panel[i].setBounds(300 * i, 0, 300, 600);
            panel[i].setLayout(null);
            frame.add(panel[i]);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        jPanelSetter.setFirstPanel(panel[0]);
        jPanelSetter.setSecondPanel(panel[1]);
        jPanelSetter.setThirdPanel(panel[2]);
        jPanelSetter.setFourthPanel(panel[3]);
        jPanelSetter.setFifthPanel(panel[4]);

        frame.setVisible(true);

    }

}
