package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class Point {
	
	private static int count=0;
	private int x;
	private int y;
	 
	
	public Point(int x, int y) {
		this.x = x;
		this.y=y;
		count++; 
		
	}
	
	public Point(Point p2) {
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point:("+this.x+","+this.y+")";
	}
	
	public static boolean isSameAs(Point point1, Point point2){//Exercice 3 - question 2
		if(point1.x==point2.x && point1.y==point2.y) {
			return true;
		}
		return false; 
		
	}
	
	public boolean equals(Point p) {
		if(p.getX() == this.x && p.getY()==this.y) {
			return true;
		}
		return false;
	}
	
	public void translate(int dx,int dy) {
		this.x+=dx;
		this.y+=dy;
	}

	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}
	
	public static void main(String[] args) {
		//Exercice 2
		Point p = new Point(0,0);
		System.out.println("("+p.getX()+","+p.getY()+")");
		
		System.out.println(" Number of points created: "+count+"\n\n");
		
		
		//Exercice 3 - question 1
		Point p1 =  new Point(1,2);
		Point p2 =  p1;
		Point p3 =  new Point(1,4);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println("\n\n");
		
		//Exercice 3 - question 2
		Point a = new Point(5,10);
		Point b = new Point(5,10);
		System.out.println(isSameAs(a,b));
		
		//Exercice 4 - question 1
		
		LinkedList<Point> list_points = new LinkedList<Point>();
		PolyLine poly = new PolyLine(list_points);

		poly.add(p1);
		poly.add(p2);
		poly.add(p3);
	
		//Exercice 4 - question 2
		
		poly.add(p3);
		poly.add(p3);
		
		System.out.println(poly);
		
		//Exercice 4 - question 4
		System.out.println(poly.contains(null));
		//Exercice 4 - question 5
	
		//poly.add(null);
		
		//Exercice 5- question 5
		
		Point p6 =new Point(1,2); 
		Circle c=new Circle(p6,1);
		Circle c2=new Circle(p6,2); 
		c2.translate(1,1);
		
		System.out.println(c+" "+c2);
		System.out.println(p6);
		
		//Exercice 5- question 6
		Circle cercle = new Circle(p= new Point(1,2),1);
		cercle.getCentre().translate(1,1);
		System.out.println(cercle);
		

	}
	
	
	
	
	

}
