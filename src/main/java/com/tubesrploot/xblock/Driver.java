/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock;

import javax.swing.SwingUtilities;



/**
 *
 * @author Isjhar-pc
 */
class Driver {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                final GUI gui = new GUI();
                gui.initGUI();
            }
        });
    }
    
    
}
