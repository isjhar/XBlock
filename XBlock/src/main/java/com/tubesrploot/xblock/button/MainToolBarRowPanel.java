/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
public class MainToolBarRowPanel extends JPanel{
    private final int nWidth;
    private final int nHeight = 40;
    private final int padding = 5;
    private FlowLayout layout;
    
    public MainToolBarRowPanel(int width){
        nWidth = width;
        initDimension();
        initLayout();
    }
    
    private void initDimension(){
        Dimension dimension = new Dimension(nWidth, nHeight);
        setPreferredSize(dimension);
    }
    
    private void initLayout(){
        layout = new FlowLayout();
        layout.setHgap(padding);
        layout.setVgap(padding);
        setLayout(layout);
    }
    
}
