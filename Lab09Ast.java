

// Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {
        PineTree myTree = new PineTree();
        myTree.drawTrunk(g);
        myTree.drawLeaves(g);
        myTree.drawOrnaments(g);
    }
}

class Tree
{
    // Do NOT alter this Tree class in any way!

    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }

    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class PineTree extends Tree
{
    public void drawLeaves(Graphics g) 
    {
        Expo.setColor(g,Expo.green);
        Expo.fillPolygon(g,500,150,300,400,700,400);
        Expo.fillPolygon(g,500,100,350,300,650,300);
        Expo.fillPolygon(g,500,50,400,200,600,200);     
    }

    public void drawOrnaments (Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,500,85,15);
        Expo.fillCircle(g,480,115,15);
        Expo.fillCircle(g,530,145,15);    
        Expo.fillCircle(g,450,175,15);   
        Expo.fillCircle(g,540,205,15);   
        Expo.fillCircle(g,490,235,15);  
        Expo.fillCircle(g,580,265,15);
        Expo.fillCircle(g,430,295,15);    
        Expo.fillCircle(g,505,325,15); 
        Expo.fillCircle(g,550,355,15);
    }








}



