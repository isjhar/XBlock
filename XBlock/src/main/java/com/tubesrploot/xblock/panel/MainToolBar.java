/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.panel;

import com.tubesrploot.xblock.button.CursorButton;
import com.tubesrploot.xblock.button.EraserButton;
import com.tubesrploot.xblock.button.LineButton;
import com.tubesrploot.xblock.button.ShapeButton;
import java.awt.Dimension;
import javax.swing.JToolBar;

/**
 *
 * @author Isjhar-pc
 */
public class MainToolBar extends JToolBar{
    private final int nHeight;
    private final int nWidth;
    private MainToolBarRowPanel rowPanel1, rowPanel2, rowPanel3, rowPanel4, rowPanel5, rowPanel6, rowPanel7,
            rowPanel8, rowPanel9, rowPanel10, rowPanel11;
    private CursorButton cursorButton;
    private EraserButton eraserButton; 
    private LineButton lineButton;
    private ShapeButton shapeButton;
    
    
    public MainToolBar(int width, int height){
        nHeight = height;
        nWidth = width;
        initDimension();
        setOrientation(JToolBar.VERTICAL);
        initComponent();
    }
    
    private void initDimension(){
        Dimension dimension = new Dimension(nWidth, nHeight);
        setPreferredSize(dimension);
    }
    
    private void initComponent(){
        cursorButton = new CursorButton();
        eraserButton = new EraserButton();
        lineButton = new LineButton();
        shapeButton = new ShapeButton();
        
        cursorButton.setActionListener();
        eraserButton.setActionListener();
        lineButton.setActionListener();
        shapeButton.setActionListener();
        
        rowPanel1 = new MainToolBarRowPanel(nWidth);
        rowPanel1.add(cursorButton);
        rowPanel1.add(eraserButton);
        
        rowPanel2 = new MainToolBarRowPanel(nWidth);
        rowPanel2.add(lineButton);
        rowPanel2.add(shapeButton);
        
        rowPanel3 = new MainToolBarRowPanel(nWidth);
        rowPanel4 = new MainToolBarRowPanel(nWidth);
        rowPanel5 = new MainToolBarRowPanel(nWidth);
        rowPanel6 = new MainToolBarRowPanel(nWidth);
        rowPanel7 = new MainToolBarRowPanel(nWidth);
        rowPanel8 = new MainToolBarRowPanel(nWidth);
        rowPanel9 = new MainToolBarRowPanel(nWidth);
        rowPanel10 = new MainToolBarRowPanel(nWidth);
        rowPanel11 = new MainToolBarRowPanel(nWidth);
        
        
        
        add(rowPanel1);
        add(rowPanel2);
        add(rowPanel3);
        add(rowPanel4);
        add(rowPanel5);
        add(rowPanel6);
        add(rowPanel7);
        add(rowPanel8);
        add(rowPanel9);
        add(rowPanel10);
        add(rowPanel11);
        
    }
}
