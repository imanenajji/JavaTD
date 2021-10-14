package fr.dauphine.javaavance.td2;

public class Racine implements Expr{
	Expr val;

	
	public Racine(Expr v) {
		this.val=v;
		
	}
	
	public double eval() {
		return Math.sqrt(val.eval());
		
	}
	
	public String toString(){
		
		return "\u221a"+(val.toString());
	}
}



