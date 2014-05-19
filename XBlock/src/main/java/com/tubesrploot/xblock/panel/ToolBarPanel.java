/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
 //pembuatan panel untuk button sebelah kiri
public class ToolBarPanel extends JPanel{
    private static final int N_HEIGHT = 600;
    private static final int N_WIDTH = 100;
    
    public ToolBarPanel(){
        super();
        initDimension();
        initLayout();
        initComponent();
    }
    //pengaturan ukuran panel sebelah kiri
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension);
    }
    //mengatur tata letak panel agar lebih rapi
    private void initLayout(){
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
    }
    
    private void initComponent(){
        MainToolBar toolbar = new MainToolBar(N_WIDTH, N_HEIGHT);
        add(toolbar);
    }
}
