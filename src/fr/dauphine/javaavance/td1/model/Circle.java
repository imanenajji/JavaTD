package fr.dauphine.javaavance.td1.model;

public class Circle  {
	
	Point centre;
	int radius;
	
	public Circle(Point centre, int radius) {
		
		this.centre=centre;
		this.radius=radius;
		
	}
	//CORRECTION- COPIE DEFENSIVE
	/*private final Point c;
	private final int r;
	public Circle(Point c, int r) {
		this.c=new Point(c.getX(),c.getY());
		this.r=r;
	}
	*/
	
	public void translate(int dx, int dy) {
		this.centre.translate(dx, dy);
		
	}
	
	public float area() {
	
		return (float) (Math.PI*this.radius*this.radius);
	}
	
	public boolean contains(Point p) {
		if (Math.pow(p.getX()-this.centre.getX(),2) + Math.pow(p.getY()-this.centre.getY(),2)== Math.pow(this.radius,2)) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Circle[] circles) {
		for (Circle circle:circles) {
			 if(circle.contains(p)) {
				 return true;
			 }
		}
		return false;	
	}
	//Correction
	/*public static boolean contains(Point p, Circle...circles) {
		for (Circle circle:circles) {
			 if(circle.contains(p)) {
				 return true;
			 }
		}
		return false;	
	}
	*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Cercle = " + this.centre+ ","+ this.radius + " Area:" + this.area() ;
	}
	
	public Point getCentre() {
		return centre;
	}
	
	
	
	
	
}
