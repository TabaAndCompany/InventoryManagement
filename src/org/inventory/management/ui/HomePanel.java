package org.inventory.management.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HomePanel {
    private JFrame frame;
    private JLabel headerLabel;
    private JPanel controlPanel;

    private AddDevicePanel addDevicePanel;
    private ReturnDevicePanel returnDevicePanel;

    public HomePanel() {
        prepareGUI();
    }

    private void prepareGUI() {
        frame = new JFrame("Mataba");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 1));
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("ako ay mataba", JLabel.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        frame.add(headerLabel);
        frame.add(controlPanel);
        frame.setVisible(true);
    }

    public void showButtonAddDevice() {
        headerLabel.setText("Konza Inventory");
        JButton AddDeviceButton = new JButton("Add Device");
        AddDeviceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddDevicePanel(frame);
            }


        });


        controlPanel.add(AddDeviceButton);
        frame.setVisible(true);
    }

    public void showButtonReturnDevice() {
        headerLabel.setText("Konza Inventory");
        JButton ReturnDeviceButton = new JButton("Return Device");
        ReturnDeviceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReturnDevicePanel(frame);
            }
        });

        controlPanel.add(ReturnDeviceButton);
        frame.setVisible(true);
    }

    public void showButtonPreviewList() {
        headerLabel.setText("Konza Inventory");
        JButton PreviewListButton = new JButton("Preview List");
        PreviewListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PreviewListPanel(frame);
            }
        });

        controlPanel.add(PreviewListButton);
        frame.setVisible(true);
    }
}



