/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.panel;


import com.tubesrploot.xblock.button.MainToolBarRowPanel;
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
import java.awt.Dimension;
import javax.swing.JToolBar;

/**
 *
 * @author Isjhar-pc
 */
public class MainToolBar extends JToolBar{
    private final int nHeight;
    private final int nWidth;
    private MainToolBarRowPanel rowPanel1, rowPanel2, rowPanel3, rowPanel4, rowPanel5, rowPanel6, rowPanel7,
            rowPanel8, rowPanel9, rowPanel10, rowPanel11;
    private CursorButton cursorButton;
    private LineButton lineButton; 
    private EllipseButton ellipseButton;
    private RectangleButton rectangleButton;
    private TriangleButton triangleButton;
    private TextButton textButton;
    private ArrowButton arrowButton;
    private DiamondButton diamondButton;
    private PencilButton pencilButton;
    private PolygonButton polygonButton;
    
    
    public MainToolBar(int width, int height){
        nHeight = height;
        nWidth = width;
        initDimension();
        setOrientation(JToolBar.VERTICAL);
        initComponent();
    }
    //pengaturan ukuran dalam maintoolbar
    private void initDimension(){
        Dimension dimension = new Dimension(getnWidth(), getnHeight());
        setPreferredSize(dimension);
    }
    
    private void initComponent(){
        // pembentukan instances button
        cursorButton = new CursorButton();
        lineButton = new LineButton();
        ellipseButton = new EllipseButton();
        rectangleButton = new RectangleButton();
        triangleButton = new TriangleButton();
        textButton = new TextButton();
        arrowButton = new ArrowButton();
        diamondButton = new DiamondButton();
        pencilButton = new PencilButton();
        polygonButton = new PolygonButton();
        
        // set action listener button
        getCursorButton().setActionListener();
        getLineButton().setActionListener();
        getEllipseButton().setActionListener();
        getRectangleButton().setActionListener();
        getTriangleButton().setActionListener();
        getTextButton().setActionListener();
        getArrowButton().setActionListener();
        getDiamondButton().setActionListener();
        getPencilButton().setActionListener();
        getPolygonButton().setActionListener();
        
        // insert button ke dalam panel
        rowPanel1 = new MainToolBarRowPanel(getnWidth());
        getRowPanel1().add(getCursorButton());
        getRowPanel1().add(getTextButton());
        
        rowPanel2 = new MainToolBarRowPanel(getnWidth());
        getRowPanel2().add(getRectangleButton());
        getRowPanel2().add(getEllipseButton());
        
        rowPanel3 = new MainToolBarRowPanel(getnWidth());
        getRowPanel3().add(getTriangleButton());
        getRowPanel3().add(getDiamondButton());
        
        rowPanel4 = new MainToolBarRowPanel(getnWidth());
        getRowPanel4().add(getPolygonButton());
        getRowPanel4().add(getPencilButton());
        
        rowPanel5 = new MainToolBarRowPanel(getnWidth());
        getRowPanel5().add(getArrowButton());
        getRowPanel5().add(getLineButton());
        
        
        rowPanel6 = new MainToolBarRowPanel(getnWidth());
        rowPanel7 = new MainToolBarRowPanel(getnWidth());
        rowPanel8 = new MainToolBarRowPanel(getnWidth());
        rowPanel9 = new MainToolBarRowPanel(getnWidth());
        rowPanel10 = new MainToolBarRowPanel(getnWidth());
        rowPanel11 = new MainToolBarRowPanel(getnWidth());
        
        // memasukkan panel ke dalam toolbar
        add(getRowPanel1());
        add(getRowPanel2());
        add(getRowPanel3());
        add(getRowPanel4());
        add(getRowPanel5());
        add(getRowPanel6());
        add(getRowPanel7());
        add(getRowPanel8());
        add(getRowPanel9());
        add(getRowPanel10());
        add(getRowPanel11());
        
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

    /**
     * @return the cursorButton
     */
    public CursorButton getCursorButton() {
        return cursorButton;
    }

    /**
     * @return the lineButton
     */
    public LineButton getLineButton() {
        return lineButton;
    }

    /**
     * @return the ellipseButton
     */
    public EllipseButton getEllipseButton() {
        return ellipseButton;
    }

    /**
     * @return the rectangleButton
     */
    public RectangleButton getRectangleButton() {
        return rectangleButton;
    }

    /**
     * @return the triangleButton
     */
    public TriangleButton getTriangleButton() {
        return triangleButton;
    }

    /**
     * @return the textButton
     */
    public TextButton getTextButton() {
        return textButton;
    }

    /**
     * @return the arrowButton
     */
    public ArrowButton getArrowButton() {
        return arrowButton;
    }

    /**
     * @return the diamondButton
     */
    public DiamondButton getDiamondButton() {
        return diamondButton;
    }

    /**
     * @return the pencilButton
     */
    public PencilButton getPencilButton() {
        return pencilButton;
    }

    /**
     * @return the polygonButton
     */
    public PolygonButton getPolygonButton() {
        return polygonButton;
    }

    /**
     * @return the rowPanel1
     */
    public MainToolBarRowPanel getRowPanel1() {
        return rowPanel1;
    }

    /**
     * @return the rowPanel2
     */
    public MainToolBarRowPanel getRowPanel2() {
        return rowPanel2;
    }

    /**
     * @return the rowPanel3
     */
    public MainToolBarRowPanel getRowPanel3() {
        return rowPanel3;
    }

    /**
     * @return the rowPanel4
     */
    public MainToolBarRowPanel getRowPanel4() {
        return rowPanel4;
    }

    /**
     * @return the rowPanel5
     */
    public MainToolBarRowPanel getRowPanel5() {
        return rowPanel5;
    }

    /**
     * @return the rowPanel6
     */
    public MainToolBarRowPanel getRowPanel6() {
        return rowPanel6;
    }

    /**
     * @return the rowPanel7
     */
    public MainToolBarRowPanel getRowPanel7() {
        return rowPanel7;
    }

    /**
     * @return the rowPanel8
     */
    public MainToolBarRowPanel getRowPanel8() {
        return rowPanel8;
    }

    /**
     * @return the rowPanel9
     */
    public MainToolBarRowPanel getRowPanel9() {
        return rowPanel9;
    }

    /**
     * @return the rowPanel10
     */
    public MainToolBarRowPanel getRowPanel10() {
        return rowPanel10;
    }

    /**
     * @return the rowPanel11
     */
    public MainToolBarRowPanel getRowPanel11() {
        return rowPanel11;
    }
    
    
    
    
}

