package fr.dauphine.javaavance.td2;

public class Multiply implements Expr{

	Expr left;
	Expr right;
	
	public Multiply(Expr a, Expr b) {
		this.left=a;
		this.right=b;
		
	}
	
	public double eval() {
		return this.left.eval() + this.right.eval();
		
	}
	
	public String toString(){
		
		return (left.toString() + "x" + right.toString());
	}
}
