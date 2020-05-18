package org.inventory.management.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ReturnDevicePanel {
    private JFrame homePanel;
    private JFrame frame;
    private JLabel headerLabel;
    private JPanel controlPanel;


    public ReturnDevicePanel(JFrame homePanel) {
        this.homePanel = homePanel;
        prepareGUI();
    }


    private void prepareGUI(){

        frame = new JFrame("Return Device");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3, 1));
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("Add Device", JLabel.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        frame.add(headerLabel);
        frame.add(controlPanel);

        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homePanel.setVisible(true);
                frame.dispose();
            }
        });
        controlPanel.add(enterButton);
        homePanel.setVisible(false);
        frame.setVisible(true);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homePanel.setVisible(true);
                frame.dispose();
            }
        });
        controlPanel.add(cancelButton);
        homePanel.setVisible(false);
        frame.setVisible(true);
    }

    public void showButtonAddDevice(){

    }

    public void showPanel() {
        frame.setVisible(true);
    }

    public void hidePanel() {
        //todo: implement clear
        frame.setVisible(false);
    }
}
