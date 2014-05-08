/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Isjhar-pc
 */
public class LineButton extends JButton implements ActionListener{
    public LineButton(){
        super();
    }
    
    public void setActionListener(){
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("line button");
    }
    
}
