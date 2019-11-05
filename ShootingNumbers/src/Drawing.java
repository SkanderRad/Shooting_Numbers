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

public class Drawing extends JPanel
{    
    public void draw ()
    {
        repaint();
    }
    
    public void paintComponent (Graphics g)
    {   
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(150, 300, 200, 250);
    }   
}
