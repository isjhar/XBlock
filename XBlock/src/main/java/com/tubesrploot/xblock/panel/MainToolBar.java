/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.panel;

import com.tubesrploot.xblock.button.MainToolBarRowPanel;
import com.tubesrploot.xblock.button.ArrowButton;
import com.tubesrploot.xblock.button.CursorButton;
import com.tubesrploot.xblock.button.DiamondButton;
import com.tubesrploot.xblock.button.EllipseButton;
import com.tubesrploot.xblock.button.LineButton;
import com.tubesrploot.xblock.button.PencilButton;
import com.tubesrploot.xblock.button.PolygonButton;
import com.tubesrploot.xblock.button.RectangleButton;
import com.tubesrploot.xblock.button.TextButton;
import com.tubesrploot.xblock.button.TriangleButton;
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
    private LineButton lineButton; 
    private EllipseButton ellipseButton;
    private RectangleButton rectangleButton;
    private TriangleButton triangleButton;
    private TextButton textButton;
    private ArrowButton arrowButton;
    private DiamondButton diamondButton;
    private PencilButton pencilButton;
    private PolygonButton polygonButton;
    
    
    public MainToolBar(int width, int height){
        nHeight = height;
        nWidth = width;
        initDimension();
        setOrientation(JToolBar.VERTICAL);
        initComponent();
    }
    //pengaturan ukuran dalam maintoolbar
    private void initDimension(){
        Dimension dimension = new Dimension(nWidth, nHeight);
        setPreferredSize(dimension);
    }
    
    private void initComponent(){
        // pembentukan instances button
        cursorButton = new CursorButton();
        lineButton = new LineButton();
        ellipseButton = new EllipseButton();
        rectangleButton = new RectangleButton();
        triangleButton = new TriangleButton();
        textButton = new TextButton();
        arrowButton = new ArrowButton();
        diamondButton = new DiamondButton();
        pencilButton = new PencilButton();
        polygonButton = new PolygonButton();
        
        // set action listener button
        cursorButton.setActionListener();
        lineButton.setActionListener();
        ellipseButton.setActionListener();
        rectangleButton.setActionListener();
        triangleButton.setActionListener();
        textButton.setActionListener();
        arrowButton.setActionListener();
        diamondButton.setActionListener();
        pencilButton.setActionListener();
        polygonButton.setActionListener();
        
        // insert button ke dalam panel
        rowPanel1 = new MainToolBarRowPanel(nWidth);
        rowPanel1.add(cursorButton);
        rowPanel1.add(textButton);
        
        rowPanel2 = new MainToolBarRowPanel(nWidth);
        rowPanel2.add(rectangleButton);
        rowPanel2.add(ellipseButton);
        
        rowPanel3 = new MainToolBarRowPanel(nWidth);
        rowPanel3.add(triangleButton);
        rowPanel3.add(diamondButton);
        
        rowPanel4 = new MainToolBarRowPanel(nWidth);
        rowPanel4.add(polygonButton);
        rowPanel4.add(pencilButton);
        
        rowPanel5 = new MainToolBarRowPanel(nWidth);
        rowPanel5.add(arrowButton);
        rowPanel5.add(lineButton);
        
        
        rowPanel6 = new MainToolBarRowPanel(nWidth);
        rowPanel7 = new MainToolBarRowPanel(nWidth);
        rowPanel8 = new MainToolBarRowPanel(nWidth);
        rowPanel9 = new MainToolBarRowPanel(nWidth);
        rowPanel10 = new MainToolBarRowPanel(nWidth);
        rowPanel11 = new MainToolBarRowPanel(nWidth);
        
        // memasukkan panel ke dalam toolbar
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

