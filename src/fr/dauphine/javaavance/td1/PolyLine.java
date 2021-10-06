package fr.dauphine.javaavance.td1;

import java.util.LinkedList;
import java.util.Objects;

public class PolyLine {
	
	LinkedList<Point> listeDePoints = new LinkedList<Point>();
	
	public PolyLine(LinkedList<Point> l) {
		
		this.listeDePoints = l;
		
	}
	
	public void add(Point pointToAdd) {
		Objects.requireNonNull(pointToAdd, "valeur null interdite");
		this.listeDePoints.add(pointToAdd);
		
	}
	
	public int pointCapacity() {
		
		return listeDePoints.size();
	}
	
	public int nbPoints() {
		
		return this.pointCapacity();
		
	}
	
	public boolean contains(Point p) {
		
		return this.listeDePoints.contains(p);
	}



	@Override
	public String toString() {
		String message = "";
		for(Point p : listeDePoints) {
			message+=p + " ---- ";
		}
		return "[" + message + "]";
	}

	

	

}
