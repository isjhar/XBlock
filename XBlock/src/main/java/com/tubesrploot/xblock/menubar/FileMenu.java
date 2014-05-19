/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.menubar;

import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Isjhar-pc
 */
public class FileMenu extends JMenu{
    private NewFileMenuItem newFile;
    public FileMenu(){
        super();
        setLabel("File");
        setMnemonic(KeyEvent.VK_F);
        getAccessibleContext().setAccessibleDescription("file menu");
        
        newFile = new NewFileMenuItem();
        newFile.setActionListener();
        add(newFile);
    }
}
