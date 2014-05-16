/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import com.tubesrploot.xblock.panel.ToolBarExtensionPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
public class EraserButton extends JButton implements ActionListener {
    private static final int N_HEIGHT = 40;
    private static final int N_WIDTH = 40;
    private EraserToolBar toolbar;
    private Dimension dimension;
    
    public EraserButton(){
        super();
        this.toolbar = new EraserToolBar();
        setToolTipText("eraser button");
        initDimension();
    }
    
    private void initDimension(){
        dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension);
    }
    
    public void setActionListener(){
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        ToolBarExtensionPanel root = (ToolBarExtensionPanel) (JPanel) getParent().getParent().getParent().getParent().getComponent(2);
        toolbar.setNWidth(root.getNWidth());
        toolbar.setNHeight(root.getNHeight());
        toolbar.initDimension();
        root.removeAll();
        root.add(toolbar);
        root.validate();
        root.repaint();
        
    }
    
}
