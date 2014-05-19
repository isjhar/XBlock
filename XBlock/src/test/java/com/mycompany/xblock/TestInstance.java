/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xblock;

import com.tubesrploot.xblock.menubar.FileMenu;
import com.tubesrploot.xblock.menubar.MainMenuBar;
import com.tubesrploot.xblock.panel.MainToolBar;
import static junit.framework.Assert.assertNotNull;
import junit.framework.TestCase;

/**
 *
 * @author Isjhar-pc
 */
public class TestInstance extends TestCase {
    
    public TestInstance(String testName) {
        super(testName);
    }
    
    public void testFileMenu(){
        FileMenu file = new FileMenu();
        assertNotNull(file.getNewFile());
    }
    
    public void testMainToolBar(){
        int width = 100;
        int height = 600;
        MainToolBar tb = new MainToolBar(width, height);
        
        assertNotNull(tb.getArrowButton());
        assertNotNull(tb.getCursorButton());
        assertNotNull(tb.getDiamondButton());
        assertNotNull(tb.getEllipseButton());
        assertNotNull(tb.getLineButton());
        assertNotNull(tb.getPencilButton());
        assertNotNull(tb.getPolygonButton());
        assertNotNull(tb.getRectangleButton());
        assertNotNull(tb.getTextButton());
        assertNotNull(tb.getTriangleButton());
        
        assertNotNull(tb.getRowPanel1());
        assertNotNull(tb.getRowPanel2());
        assertNotNull(tb.getRowPanel3());
        assertNotNull(tb.getRowPanel4());
        assertNotNull(tb.getRowPanel5());
        assertNotNull(tb.getRowPanel6());
        assertNotNull(tb.getRowPanel7());
        assertNotNull(tb.getRowPanel8());
        assertNotNull(tb.getRowPanel9());
        assertNotNull(tb.getRowPanel10());
        assertNotNull(tb.getRowPanel11());

    }
    
    public void testMainMenuBar(){
        MainMenuBar m = new MainMenuBar();
        assertNotNull(m.getFileMenu());
    }
}
