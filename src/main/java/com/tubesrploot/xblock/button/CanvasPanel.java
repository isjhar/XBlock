/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import com.tubesrploot.xblock.button.CursorButton;
import com.tubesrploot.xblock.button.LineButton;
import com.tubesrploot.xblock.button.RectangleButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;

/**
 *
 * @author Isjhar-pc
 */
public class CanvasPanel extends JScrollPane{
    private static final int N_HEIGHT = 600;
    private static final int N_WIDTH = 600;
    private DrawingView canvas;
    private DrawingEditor editor;
    
    public CanvasPanel(DrawingView canvas){
        super(canvas.getComponent());
        this.canvas = canvas;
        initDimension();
        setBorder(BorderFactory.createLineBorder(Color.black));
        Drawing gambar = new DefaultDrawing();
        canvas.setDrawing(gambar);
        editor = new DefaultDrawingEditor();
        editor.add(canvas); 
    }
    
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension);
    }

    public DrawingEditor getEditor(){
        return editor;
    }
   

   
}
