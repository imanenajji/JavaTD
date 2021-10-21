package fr.dauphine.javaavance.td1.model;

import java.util.Objects;

public class PolyLine2 {
	
	Point[] listeDePoints; //= new Point[3];
	
	public PolyLine2(Point[] l) {
		
		this.listeDePoints = l;
		
	}
	
	public void add(Point pointToAdd) {
		Objects.requireNonNull(pointToAdd, "valeur null interdite");
		for(int i=0; i<this.listeDePoints.length;i++) {
			if(this.listeDePoints[i] == null) {
				System.out.println("test" + i);
				this.listeDePoints[i] = pointToAdd;
				break;

			} 
					}
		if (this.listeDePoints[this.listeDePoints.length-1] != null) {
			System.out.println("erreur d'index");
		}		
		
	}
	
	//CORRECTION
	/*public void add(Point p) {
		if(list.size()==nbmax) {
			throw new IllegalStateExpression("full");
		}
		list[nb++]=Object.requirednonnull(P)
	}
	*/
	
	public int pointCapacity() {
		
		return listeDePoints.length;
	}
	
	public int nbPoints() {
		int nbPoints=0;
		for (int i = 0; i<this.listeDePoints.length; i++) {
			if(this.listeDePoints[i] != null) {
				nbPoints ++;
			}			
		}
		return nbPoints;
	}
	
	public boolean contains(Point p) {
		
		for(Point z:this.listeDePoints) {
			if(z.equals(p)) {
				return true;
			}
		}
		return false;
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
