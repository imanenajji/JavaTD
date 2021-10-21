package fr.dauphine.javaavance.td1.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.javaavance.td1.model.Point;
import fr.dauphine.javaavance.td1.model.Rectangle;

public class MyDisplay extends JPanel {



	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display"); 
		frame.setSize(new Dimension(500,500)); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d); 
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
		

		Point p = new Point(100,100);
		
		Rectangle r = new Rectangle(p,100,100);

		g.drawRect(r.getP1().getX(), r.getP1().getY(),  r.getLargeur(), r.getLongeur());
	}
	
	
}