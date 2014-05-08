/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock;

import com.tubesrploot.xblock.button.CursorButton;
import com.tubesrploot.xblock.button.EraserButton;
import com.tubesrploot.xblock.button.LineButton;
import com.tubesrploot.xblock.button.ShapeButton;
import com.tubesrploot.xblock.toolbar.CursorToolBar;
import com.tubesrploot.xblock.toolbar.EraserToolBar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SpringLayout;

/**
 *
 * @author Isjhar-pc
 */
public class GUI {
    private final int HEIGHT = 600;
    private final int ROOT_WIDTH = 800;
    private final int TOOLBAR_1_WIDTH = 100;
    private final int TOOLBAR_2_WIDTH = 100;
    private final int TOOLBAR_BUTTON_WIDTH = 40;
    private final int TOOLBAR_BUTTON_HEIGHT = 40;
    
    public void initGUI(){
        Dimension dimensionRootPanel = new Dimension(ROOT_WIDTH, HEIGHT);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimensionToolbarPanel1 = new Dimension(TOOLBAR_1_WIDTH, HEIGHT);
        Dimension dimensionToolbarPanel2 = new Dimension(TOOLBAR_2_WIDTH, HEIGHT);
        Dimension dimensionCanvasPanel = new Dimension(ROOT_WIDTH - TOOLBAR_1_WIDTH - TOOLBAR_2_WIDTH, HEIGHT);
        Dimension dimensionButtonToolBar = new Dimension(TOOLBAR_BUTTON_WIDTH, TOOLBAR_BUTTON_HEIGHT);
        Dimension dimensionToolbarRowPanel1 = new Dimension(TOOLBAR_1_WIDTH, TOOLBAR_BUTTON_HEIGHT);
        
        FlowLayout layout = new FlowLayout();
        FlowLayout layoutButtonToolbar = new FlowLayout();
        
        
        
        JFrame frame = new JFrame("XBlock");
        JPanel rootPanel = new JPanel();
        JPanel toolbarPanel1 = new JPanel();
        JPanel toolbarPanel2 = new JPanel();
        JPanel canvasPanel = new JPanel();
        JPanel toolbarRowPanel1 = new JPanel();
        JPanel toolbarRowPanel2 = new JPanel();
        JPanel toolbarRowPanel3 = new JPanel();
        JPanel toolbarRowPanel4 = new JPanel();
        JPanel toolbarRowPanel5 = new JPanel();
        JPanel toolbarRowPanel6 = new JPanel();
        JPanel toolbarRowPanel7= new JPanel();
        JPanel toolbarRowPanel8 = new JPanel();
        JPanel toolbarRowPanel9 = new JPanel();
        JPanel toolbarRowPanel10 = new JPanel();
        JPanel toolbarRowPanel11 = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JToolBar toolbar1 = new JToolBar();
        CursorToolBar cursorToolBar = new CursorToolBar();
        EraserToolBar eraserToolBar = new EraserToolBar();
        CursorButton cursorButton = new CursorButton(toolbarPanel2, cursorToolBar);
        EraserButton eraserButton = new EraserButton(toolbarPanel2, eraserToolBar);
        LineButton lineButton = new LineButton();
        ShapeButton shapeButton = new ShapeButton();
        
        // set layout
        layout.setHgap(0);
        layout.setVgap(0);
        
        layoutButtonToolbar.setHgap(5);
        layoutButtonToolbar.setVgap(5);
        
        
        //set menu
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFile.getAccessibleContext().setAccessibleDescription("file menu");
        
        menuBar.add(menuFile);
        
        // set button
        cursorButton.setToolTipText("cursor button");
        cursorButton.setPreferredSize(dimensionButtonToolBar);
        cursorButton.setActionListener();
        
        
        eraserButton.setToolTipText("eraser button");
        eraserButton.setPreferredSize(dimensionButtonToolBar);
        eraserButton.setActionListener();
        
        shapeButton.setToolTipText("shape button");
        shapeButton.setPreferredSize(dimensionButtonToolBar);
        
        lineButton.setToolTipText("line button");
        lineButton.setPreferredSize(dimensionButtonToolBar);
        
        // set toolbar row panel
        toolbarRowPanel1.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel1.setLayout(layoutButtonToolbar);
        toolbarRowPanel1.add(cursorButton);
        toolbarRowPanel1.add(eraserButton);
        
        toolbarRowPanel2.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel2.setLayout(layoutButtonToolbar);
        toolbarRowPanel2.add(lineButton);
        toolbarRowPanel2.add(shapeButton);
        
        toolbarRowPanel3.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel3.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel3.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel4.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel4.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel4.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel5.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel5.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel5.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel6.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel6.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel6.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel7.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel7.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel8.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel8.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel8.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel9.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel9.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel9.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel10.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel10.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel10.setLayout(layoutButtonToolbar);
        
        toolbarRowPanel11.setPreferredSize(dimensionToolbarRowPanel1);
        toolbarRowPanel11.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarRowPanel11.setLayout(layoutButtonToolbar);
        
        // set toolbar
        toolbar1.setPreferredSize(dimensionToolbarPanel1);
        toolbar1.setOrientation(JToolBar.VERTICAL);
        
        toolbar1.add(toolbarRowPanel1);
        toolbar1.add(toolbarRowPanel2);
        toolbar1.add(toolbarRowPanel3);
        toolbar1.add(toolbarRowPanel4);
        toolbar1.add(toolbarRowPanel5);
        toolbar1.add(toolbarRowPanel6);
        toolbar1.add(toolbarRowPanel7);
        toolbar1.add(toolbarRowPanel8);
        toolbar1.add(toolbarRowPanel9);
        toolbar1.add(toolbarRowPanel10);
        toolbar1.add(toolbarRowPanel11);
        
        
        
//        toolbarPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarPanel1.setPreferredSize(dimensionToolbarPanel1);
        toolbarPanel1.setLayout(layout);
        toolbarPanel1.add(toolbar1);
        
        canvasPanel.setPreferredSize(dimensionCanvasPanel);
        canvasPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        // init all toolbar
        cursorToolBar.setPreferredSize(dimensionToolbarPanel2);
        cursorToolBar.setOrientation(JToolBar.VERTICAL);
        cursorToolBar.setToolTipText("cursor toolbar");
        
        eraserToolBar.setPreferredSize(dimensionToolbarPanel2);
        eraserToolBar.setOrientation(JToolBar.VERTICAL);
        eraserToolBar.setToolTipText("eraser toolbar");
        
        toolbarPanel2.setPreferredSize(dimensionToolbarPanel2);
//        toolbarPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
        toolbarPanel2.add(cursorToolBar);
        toolbarPanel2.setLayout(layout);
        
        
        
        
        rootPanel.setPreferredSize(dimensionRootPanel);
        rootPanel.setLayout(layout);
        rootPanel.add(toolbarPanel1);
        rootPanel.add(canvasPanel);
        rootPanel.add(toolbarPanel2);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(dim.width/2-rootPanel.getPreferredSize().width/2, (dim.height/2-rootPanel.getPreferredSize().height/2)-20);
        frame.getContentPane().add(rootPanel);
        frame.setResizable(false);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);        
    }
}
