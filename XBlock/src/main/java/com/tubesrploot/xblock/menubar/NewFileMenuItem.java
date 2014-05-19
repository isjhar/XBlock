/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.menubar;

import com.tubesrploot.xblock.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author Isjhar-pc
 */
public class NewFileMenuItem extends JMenuItem implements ActionListener{
    public NewFileMenuItem(){
        setText("New Canvas");
        setIcon(new ImageIcon("docs.png"));
        setMnemonic(KeyEvent.VK_N);
    }
    //set action listener
    public void setActionListener(){
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final GUI gui = new GUI();
                gui.initGUI();
            }
        });
    }
    
}
