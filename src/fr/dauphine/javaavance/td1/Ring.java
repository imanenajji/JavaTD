package fr.dauphine.javaavance.td1;

public class Ring extends Circle{
	
	int radius2;
	

	public Ring(Point centre, int radius1, int radius2) {
		super(centre, radius1);
		
		if(radius2<radius1) {
			this.radius2 = radius2;			
		}
	}
	
	
	public boolean equals(Ring r1) {
		
		return centre.equals(r1.centre) && this.radius == r1.radius && this.radius2 == r1.radius2;
		
	}
	
	public boolean contains(Point p) {
		
		
		Circle[] circles = new Circle[2];
		
		Circle c1 = new Circle (this.centre, this.radius);
		Circle c2 = new Circle (this.centre, this.radius2);
		
		circles[0]=c1;
		circles[1]=c2;
		
		return super.contains(p, circles);
		
	}
	
	public boolean contains(Point p, Ring[] rings) {
		
		for(Ring ring:rings) {
			if(ring.contains(p)) {
				return true;
			}
		}
		return false;
	}

}
