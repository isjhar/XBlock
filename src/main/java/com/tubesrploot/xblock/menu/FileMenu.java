/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.menu;

import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;

/**
 *
 * @author Isjhar-pc
 */
public class FileMenu extends JMenuItem{
    public FileMenu(){
        super();
        setLabel("File");
        setMnemonic(KeyEvent.VK_F);
        getAccessibleContext().setAccessibleDescription("file menu");
    }
}
