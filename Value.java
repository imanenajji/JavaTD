package fr.dauphine.javaavance.td2;

public class Value implements Expr{
	
	final private double val;
	
	public Value(double v) {
		val = v;
	}
	
	public double eval() {
		
		return val;
		
	}
	
	public String toString() {
		return String.valueOf(val);
	}
	
	

}
