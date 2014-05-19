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
import org.jhotdraw.draw.AbstractAttributedFigure;
import static org.jhotdraw.draw.AttributeKeys.END_DECORATION;
import org.jhotdraw.draw.LineFigure;
import org.jhotdraw.draw.decoration.ArrowTip;
import org.jhotdraw.draw.tool.CreationTool;

/**
 *
 * @author USER
 */
public class ArrowButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40;
    private static final int N_WIDTH = 40;
    private ArrowToolBar toolbar;
    public ArrowButton(){
        super();
        this.toolbar = new ArrowToolBar();
        setToolTipText("arrow button");
        setIcon(new ImageIcon("arrow.png"));
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
        CreationTool ct = new CreationTool(new LineFigure());
        AbstractAttributedFigure af = (AbstractAttributedFigure) ct.getPrototype();
        af.set(END_DECORATION, new ArrowTip(0.35, 12, 11.3));
        canvas.getEditor().setTool(ct);
    }

    /**
     * @return the toolbar
     */
    public ArrowToolBar getToolbar() {
        return toolbar;
    }
    
    
}
