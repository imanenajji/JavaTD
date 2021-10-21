package fr.dauphine.javaavance.td1.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.javaavance.td1.model.Rectangle;
import fr.dauphine.javaavance.td1.view.MyDisplay;

public class MouseController implements MouseMotionListener {
	
	Rectangle r;
	MyDisplay m;

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e  ) {
		// TODO Auto-generated method stub
		
		RectangleController rctrl = new RectangleController(r);
		
		int new_x = e.getX();
		int new_y = e.getY();
		
		rctrl.setP(new_x, new_y);
		
	}

	
}
