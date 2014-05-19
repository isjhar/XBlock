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
import org.jhotdraw.draw.DiamondFigure;
import org.jhotdraw.draw.tool.CreationTool;
/**
 *
 * @author USER
 */
public class DiamondButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40;
    private static final int N_WIDTH = 40;
    private DiamondToolBar toolbar;
    //mengatur tampilan button
    public DiamondButton(){
        super();
        this.toolbar = new DiamondToolBar();
        setToolTipText("diamond button");
        setIcon(new ImageIcon("diamond.png"));
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
        canvas.getEditor().setTool(new CreationTool(new DiamondFigure()));
    }

    /**
     * @return the toolbar
     */
    public DiamondToolBar getToolbar() {
        return toolbar;
    }
    
    
}
