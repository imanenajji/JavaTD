package fr.dauphine.javaavance.td1.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.javaavance.td1.controller.RectangleController;
import fr.dauphine.javaavance.td1.model.Point;
import fr.dauphine.javaavance.td1.model.Rectangle;

public class RectangleView extends JPanel {
	
	RectangleController rctrl;
	Rectangle r;
	
	public RectangleView(RectangleController rctrl, Rectangle r) {
		this.rctrl=rctrl;
		this.r=r;
	}


	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
		Point p = new Point(100,100);
		
		Rectangle r = new Rectangle(p,5,10);
		


		g.drawRect(r.getP1().getX(), r.getP1().getY(), r.getLongeur(), r.getLargeur());
	}

}
