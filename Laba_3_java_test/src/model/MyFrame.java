package model;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public Container pane=getContentPane();
	public MyFrame()
    {
    }
	public void MyFrame1()
    {
    	setTitle("Graphis addTotalTime Add");
    	setSize(500,500);
    	MyPanel panel=new MyPanel();
    	Container pane=getContentPane();
    	pane.add(panel);
    }
	public void MyFrame2()
    {
    	setTitle("Graphis addMedianTime Add");
    	setSize(500,500);
    	MyPanel2 panel2=new MyPanel2();
    	pane.add(panel2);
    }
	public void MyFrame3()
    {
    	setTitle("Graphis addTotalTime Remove");
    	setSize(500,500);
    	MyPanel3 panel3=new MyPanel3();
    	Container pane=getContentPane();
    	pane.add(panel3);
    }
	public void MyFrame4()
    {
    	setTitle("Graphis addMedianTime Remove");
    	setSize(500,500);
    	MyPanel4 panel4=new MyPanel4();
    	Container pane=getContentPane();
    	pane.add(panel4);
    }
    
}
