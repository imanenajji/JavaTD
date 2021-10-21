package fr.dauphine.javaavance.td1.model;

public class Rectangle {
	
	private Point p1;
	private int longeur;
	private int largeur;

	public Rectangle(Point p1, int longueur, int largeur ) {
		this.p1=p1;
		this.longeur=longueur;
		this.largeur=largeur;
		
	}
	

	
	public Point getP1() {
		return p1;
	}
	

	public int getLargeur() {
		return largeur;
	}
	
	public int getLongeur() {
		return longeur;
	}
	
	
	public void setP1(int x , int y) {
		this.p1.setX(x);
		this.p1.setY(y);
	}



	
	
	
	
	
}
