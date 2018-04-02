/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jhotdraw.draw.TriangleFigure;
import org.jhotdraw.draw.tool.CreationTool;
import org.jhotdraw.draw.tool.SelectionTool;

/**
 *
 * @author Isjhar-pc
 */
public class TriangleButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40;
    private static final int N_WIDTH = 40;
    private TriangleToolBar toolbar;
    //mengatur tampilan button
    public TriangleButton(){
        super();
        this.toolbar = new TriangleToolBar();
        setToolTipText("triangle button");
        setIcon(new ImageIcon("triangle.png"));
        initDimension();
    }
    //pengimplementasian listener
    public void setActionListener(){
        this.addActionListener(this);
    }
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension);
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
        //pemasangan objek dalam canvas
        CanvasPanel canvas = (CanvasPanel) getParent().getParent().getParent().getParent().getComponent(1);
        canvas.getEditor().setTool(new CreationTool(new TriangleFigure()));
    }

    /**
     * @return the toolbar
     */
    public TriangleToolBar getToolbar() {
        return toolbar;
    }
    
    
}
