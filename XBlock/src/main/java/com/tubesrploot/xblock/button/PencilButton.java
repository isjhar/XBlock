/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tubesrploot.xblock.button;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.tool.BezierTool;

/**
 *
 * @author USER
 */
public class PencilButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40;
    private static final int N_WIDTH = 40;
    private LineToolBar toolbar;
    public PencilButton(){
        super();
        this.toolbar = new LineToolBar();
        setToolTipText("pencil button");
        setIcon(new ImageIcon("pencil.png"));
        initDimension();
        
    }
    
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension);
    }
    
    public void setActionListener(){
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        ToolBarExtensionPanel root = (ToolBarExtensionPanel) getParent().getParent().getParent().getParent().getComponent(2);
        getToolbar().setNWidth(root.getNWidth());
        getToolbar().setNHeight(root.getNHeight());
        getToolbar().initDimension();
        root.removeAll();
        root.add(getToolbar());
        root.validate();
        root.repaint();
        
        CanvasPanel canvas = (CanvasPanel) getParent().getParent().getParent().getParent().getComponent(1);
        canvas.getEditor().setTool(new BezierTool(new BezierFigure()));
    }    

    /**
     * @return the toolbar
     */
    public LineToolBar getToolbar() {
        return toolbar;
    }
    
    
}
