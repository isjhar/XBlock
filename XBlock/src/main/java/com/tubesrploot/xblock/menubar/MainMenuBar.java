/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.menubar;

import com.tubesrploot.xblock.menu.FileMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author Isjhar-pc
 */
public class MainMenuBar extends JMenuBar{
    private FileMenu fileMenu;
    public MainMenuBar(){
        super();
        fileMenu = new FileMenu();
        add(fileMenu);
    }
}
