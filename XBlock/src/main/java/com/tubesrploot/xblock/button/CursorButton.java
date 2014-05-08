/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author Isjhar-pc
 */
public class CursorButton extends JButton implements ActionListener{
    private JToolBar toolbar;
    private JPanel root;
    public CursorButton(JPanel root, JToolBar toolbar){
        super();
        this.root = root;
        this.toolbar = toolbar;
    }
    
    public void setActionListener(){
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("cursor button");
        root.removeAll();
        root.add(toolbar);
        root.validate();
        root.repaint();
        
    }
}
