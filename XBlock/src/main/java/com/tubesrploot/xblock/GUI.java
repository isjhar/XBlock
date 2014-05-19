/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock;


import com.tubesrploot.xblock.menubar.MainMenuBar;
import com.tubesrploot.xblock.button.CanvasPanel;
import com.tubesrploot.xblock.button.ToolBarExtensionPanel;
import com.tubesrploot.xblock.panel.ToolBarPanel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingView;

/**
 *
 * @author Isjhar-pc
 */
public class GUI {
    private static final int HEIGHT = 600;
    private static final int ROOT_WIDTH = 800;
    private int marginTop = 20;
    
    public void initGUI(){
        Dimension dimensionRootPanel = new Dimension(ROOT_WIDTH, HEIGHT);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        FlowLayout layout = new FlowLayout();
        DrawingView canvas = new DefaultDrawingView();
        JFrame frame = new JFrame("XBlock");
        ToolBarPanel toolbarPanel1 = new ToolBarPanel();
        ToolBarExtensionPanel toolbarPanel2 = new ToolBarExtensionPanel();
        CanvasPanel canvasPanel = new CanvasPanel(canvas);
        MainMenuBar menuBar = new MainMenuBar();
        
        // set layout
        layout.setHgap(0);
        layout.setVgap(0);
       
        frame.setLayout(layout);
        frame.setSize(dimensionRootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(dim.width/2-frame.getSize().width/2, (dim.height/2-frame.getSize().height/2)-marginTop);
        frame.getContentPane().add(toolbarPanel1);
        frame.getContentPane().add(canvasPanel);
        frame.getContentPane().add(toolbarPanel2);
        frame.setResizable(false);
        frame.setJMenuBar(menuBar);
        frame.pack();
        
        frame.setVisible(true);        
    }
}
