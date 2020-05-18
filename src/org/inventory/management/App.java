package org.inventory.management;

import org.inventory.management.ui.HomePanel;

public class App {
    public static void main(String[] args){
        HomePanel homePanel = new HomePanel();
        homePanel.showButtonAddDevice();
        homePanel.showButtonReturnDevice();
        homePanel.showButtonPreviewList();

    }
}
