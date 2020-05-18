package org.inventory.management.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AddDevicePanel {
    private JFrame homePanel;
    private JFrame frame;
    private JLabel headerLabel;
    private JPanel controlPanel;
    private JLabel computerNameLabel, serialNumberLabel, departmentLabel, osLabel, categoryLabel, ownerLabel;
    private JTextField computerName, description, owner, serialNumber;
    private JComboBox categoryName, osName, department;
    private JTextArea result;

    public AddDevicePanel(JFrame homePanel) {
        this.homePanel = homePanel;
        prepareGUI();
    }

    private void prepareGUI(){
        computerNameLabel = new JLabel ("Computer Name: ");
        result = new JTextArea (10, 30);
        JScrollPane scrollResult = new JScrollPane(result, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        categoryLabel = new JLabel (" Category: ");
        categoryName = new JComboBox();
        categoryName.addItem("Laptop");
        categoryName.addItem("Desktop");
        categoryName.addItem("Printer");
        categoryName.addItem("Ipad");
        computerNameLabel = new JLabel("Computer Name: ");
        computerName = new JTextField (10);
        ownerLabel = new JLabel("Owner: ");
        owner = new JTextField (10);
        osLabel = new JLabel("OS: ");
        osName = new JComboBox();
        osName.addItem("N/A");
        osName.addItem("Windows 10");
        osName.addItem("Windows 7");
        departmentLabel =new JLabel("Department: ");
        department = new JComboBox();
        department.addItem("Spares");
        department.addItem("Admin");
        department.addItem("Finance");
        department.addItem("IT");
        department.addItem("Risk Management");
        department.addItem("Referral");
        department.addItem("WIC");
        department.addItem("Medical");
        department.addItem("Dental");
        department.addItem("Medical Front Desk");
        department.addItem("Dental Front Desk");
        department.addItem("Dental Billers");
        department.addItem("Medical Billers");
        department.addItem("MHK");
        serialNumberLabel = new JLabel("Serial Number: ");
        serialNumber = new JTextField(10);
        frame = new JFrame("Add Device");
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
        controlPanel.add(categoryLabel);
        controlPanel.add(categoryName);
        controlPanel.add(computerNameLabel);
        controlPanel.add(computerName);
        controlPanel.add(departmentLabel);
        controlPanel.add(department);
        controlPanel.add(osLabel);
        controlPanel.add(osName);
        controlPanel.add(serialNumberLabel);
        controlPanel.add(serialNumber);
        controlPanel.add(result);
        frame.add(headerLabel);
        frame.add(controlPanel);

        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("Computer Name: " + computerName.getText() );
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
