/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock;
import javax.swing.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.draw.layouter.HorizontalLayouter;


/**
 *
 * @author kokon
 */
public class RPL_HOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                GraphicalCompositeFigure komposit = new GraphicalCompositeFigure();
                komposit.add(new TextFigure("JHotDraws"));
                komposit.add(new EllipseFigure(5, 50, 250, 100));
                Drawing gambar = new DefaultDrawing();
                gambar.add(komposit);
                
                komposit.setLayouter(new HorizontalLayouter());
                komposit.layout();
                JFrame f = new JFrame("Tugas RPL");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(500, 250);
                DrawingView view = new DefaultDrawingView();
                view.setDrawing(gambar);
                f.getContentPane().add(view.getComponent());
                f.setVisible(true);
                
//                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }
}
