/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.xblock;

import com.tubesrploot.xblock.button.ArrowButton;
import com.tubesrploot.xblock.button.CursorButton;
import com.tubesrploot.xblock.button.DiamondButton;
import com.tubesrploot.xblock.button.EllipseButton;
import com.tubesrploot.xblock.button.LineButton;
import com.tubesrploot.xblock.button.PencilButton;
import com.tubesrploot.xblock.button.PolygonButton;
import com.tubesrploot.xblock.button.RectangleButton;
import com.tubesrploot.xblock.button.TextButton;
import com.tubesrploot.xblock.button.TriangleButton;
import com.tubesrploot.xblock.panel.MainToolBar;
import java.awt.event.ActionEvent;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Isjhar-pc
 */
public class TestDimension extends TestCase {
    
    public TestDimension(String testName) {
        super(testName);
    }
    
    public void testDimensionButton(){
        int height = 40;
        int width = 40;
        ArrowButton arrow = new ArrowButton();
        assertEquals(arrow.getPreferredSize().height, height);
        assertEquals(arrow.getPreferredSize().width, width);
        
        CursorButton cursor = new CursorButton();
        assertEquals(cursor.getPreferredSize().height, height);
        assertEquals(cursor.getPreferredSize().width, width);
        
        DiamondButton diamond = new DiamondButton();
        assertEquals(diamond.getPreferredSize().height, height);
        assertEquals(diamond.getPreferredSize().width, width);
        
        EllipseButton ellipse = new EllipseButton();
        assertEquals(ellipse.getPreferredSize().height, height);
        assertEquals(ellipse.getPreferredSize().width, width);
        
        LineButton line = new LineButton();
        assertEquals(line.getPreferredSize().height, height);
        assertEquals(line.getPreferredSize().width, width);
        
        PencilButton pencil = new PencilButton();
        assertEquals(pencil.getPreferredSize().height, height);
        assertEquals(pencil.getPreferredSize().width, width);
        
        PolygonButton polygon = new PolygonButton();
        assertEquals(polygon.getPreferredSize().height, height);
        assertEquals(polygon.getPreferredSize().width, width);
        
        RectangleButton rectangle = new RectangleButton();
        assertEquals(rectangle.getPreferredSize().height, height);
        assertEquals(rectangle.getPreferredSize().width, width);
        
        TextButton text = new TextButton();
        assertEquals(text.getPreferredSize().height, height);
        assertEquals(text.getPreferredSize().width, width);
        
        TriangleButton triangle = new TriangleButton();
        assertEquals(triangle.getPreferredSize().height, height);
        assertEquals(triangle.getPreferredSize().width, width);   
    }
    
    public void testToolBarDimension(){
        int height = 600;
        int width = 100;
        
        MainToolBar tb = new MainToolBar(width, height);
       
    }
}
