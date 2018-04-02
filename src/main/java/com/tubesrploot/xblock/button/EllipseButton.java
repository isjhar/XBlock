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
import org.jhotdraw.draw.EllipseFigure;
import org.jhotdraw.draw.tool.CreationTool;

/**
 *
 * @author Isjhar-pc
 */
public class EllipseButton extends JButton implements ActionListener {
    private static final int N_HEIGHT = 40;
    private static final int N_WIDTH = 40;
    private EllipseToolBar toolbar;
    //mengatur tampilan button
    public EllipseButton(){
        super();
        this.toolbar = new EllipseToolBar();
        setToolTipText("ellips button");
        setIcon(new ImageIcon("ellipse.png"));
        initDimension();
    }
    //pengimplementasian listener
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
        //pemasangan objek dalam canvas
        CanvasPanel canvas = (CanvasPanel) getParent().getParent().getParent().getParent().getComponent(1);
        canvas.getEditor().setTool(new CreationTool(new EllipseFigure()));
        
        
    }

    /**
     * @return the toolbar
     */
    public EllipseToolBar getToolbar() {
        return toolbar;
    }
 
    
}
