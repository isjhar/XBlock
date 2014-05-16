/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock;


import com.tubesrploot.xblock.menubar.MainMenuBar;
import com.tubesrploot.xblock.panel.ToolBarExtensionPanel;
import com.tubesrploot.xblock.panel.ToolBarPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
public class GUI {
    private static final int HEIGHT = 600;
    private static final int ROOT_WIDTH = 800;
    private static final int TOOLBAR_1_WIDTH = 100;
    private static final int TOOLBAR_2_WIDTH = 100;
    private int marginTop = 20;
    
    public void initGUI(){
        Dimension dimensionRootPanel = new Dimension(ROOT_WIDTH, HEIGHT);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimensionCanvasPanel = new Dimension(ROOT_WIDTH - TOOLBAR_1_WIDTH - TOOLBAR_2_WIDTH, HEIGHT);
        
        FlowLayout layout = new FlowLayout();
        
        JFrame frame = new JFrame("XBlock");
        JPanel rootPanel = new JPanel();
        ToolBarPanel toolbarPanel1 = new ToolBarPanel();
        ToolBarExtensionPanel toolbarPanel2 = new ToolBarExtensionPanel();
        JPanel canvasPanel = new JPanel();
        MainMenuBar menuBar = new MainMenuBar();
        
        
        // set layout
        layout.setHgap(0);
        layout.setVgap(0);
        
       
        
        canvasPanel.setPreferredSize(dimensionCanvasPanel);
        canvasPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        rootPanel.setPreferredSize(dimensionRootPanel);
        rootPanel.setLayout(layout);
        rootPanel.add(toolbarPanel1);
        rootPanel.add(canvasPanel);
        rootPanel.add(toolbarPanel2);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(dim.width/2-rootPanel.getPreferredSize().width/2, (dim.height/2-rootPanel.getPreferredSize().height/2)-marginTop);
        frame.getContentPane().add(rootPanel);
        frame.setResizable(false);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);        
    }
}
