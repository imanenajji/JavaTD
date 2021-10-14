package fr.dauphine.javaavance.td2;

public class Add implements Expr{
	
	Expr left;
	Expr right;
	
	public Add(Expr a, Expr b) {
		this.left=a;
		this.right=b;
		
	}
	
	public double eval() {
		return this.left.eval() + this.right.eval();
		
	}
	
	public String toString(){
		
		return (left.toString()+ "+" + right.toString());
	}
}
