/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import	javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Fenetre extends JFrame	
{      
    //bouttons de dessination
    JButton drawSquare = new JButton ("Square");
    JButton drawCircle = new JButton ("Circle");
    JButton drawTriangle = new JButton ("Triangle");
    
    //bouttons de coloriage
    JButton colorRed = new JButton ("Red");
    JButton colorGreen = new JButton ("Green");
    JButton colorBlue = new JButton ("Blue");
    
    
    JPanel drawPanel = new JPanel ();
    JPanel colorPanel = new JPanel ();
    JPanel upPanel = new JPanel ();
    JPanel canvasPanel = new JPanel ();
    

    public Fenetre (String titre)
    {   
        super (titre);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,600);
        
        JLabel drawLabel = new JLabel ("Shapes :", SwingConstants.LEFT);
        JLabel colorLabel = new JLabel ("Colors :", SwingConstants.LEFT);
        
        Drawing d1 = new Drawing();
        canvasPanel.add (d1);
        d1.draw();
        
        drawPanel.add(drawLabel);
        drawPanel.add(drawSquare);
        drawPanel.add(drawCircle);
        drawPanel.add(drawTriangle);
        
        colorPanel.add(colorLabel);
        colorPanel.add(colorRed);
        colorPanel.add(colorGreen);
        colorPanel.add(colorBlue);
        
        upPanel.setLayout(new BoxLayout(upPanel, BoxLayout.PAGE_AXIS));
        upPanel.add (drawPanel);
        upPanel.add (colorPanel);
        upPanel.add (canvasPanel);
        
        setLayout(new BorderLayout(10,10));
        add (upPanel,BorderLayout.NORTH);
        add (canvasPanel,BorderLayout.CENTER);
      
        setVisible(true);
        
    }
    
    public static void main (String [] args)
    {
        Fenetre f1 = new Fenetre ("test");
    }
}
