package fr.dauphine.javaavance.td1.controller;

import fr.dauphine.javaavance.td1.model.Rectangle;

public class RectangleController {

	private Rectangle r;
	
	RectangleController(Rectangle r){
		this.r=r;
	}
	
	public void setP(int x, int y){
		this.r.setP1(x, y);
	}
}
