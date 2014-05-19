/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tubesrploot.xblock.button;
import java.awt.Dimension;
import javax.swing.JToolBar;
/**
 *
 * @author USER
 */
public class PencilToolBar extends JToolBar{
    private int nHeight;
    private int nWidth;
    
    public PencilToolBar(){
        super();
        
        setOrientation(JToolBar.VERTICAL);
        setToolTipText("pencil toolbar");
    }
    //pengaturan ukuran button
    public void initDimension(){
        Dimension dimension = new Dimension(nWidth, nHeight);
        setPreferredSize(dimension);
    }

    //pengaturan high button
    public void setNHeight(int nHeight) {
        this.nHeight = nHeight;
    }
    //pengaturan width button
    public void setNWidth(int nWidth) {
        this.nWidth = nWidth;
    }    
    
    /**
     * @return the nHeight
     */
    public int getnHeight() {
        return nHeight;
    }

    /**
     * @return the nWidth
     */
    public int getnWidth() {
        return nWidth;
    }
}
