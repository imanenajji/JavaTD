package fr.dauphine.javaavance.td2;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		 Mere mere=new Mere();
		 Mere mereFille=new Fille();
		 Fille fille=new Fille();
		 
		 fille.miage();
		 ((Fille)mereFille).miage();

		 mere.a();
		 System.out.println(mereFille.getClass());
		 mereFille.a();
		 fille.a();
		 ((Mere)mereFille).a();
		 mereFille.b(null);

		 mereFille.c();
		 mereFille.c(mere);
		 mereFille.c(mereFille);
		 mereFille.c(fille);
		 fille.c(fille);

		 mere.d();
		 mereFille.d();

		 mere.printF();
		 mereFille.printF();

		 mereFille.j();
		 mereFille.k();
		 mereFille.l();
		 mereFille.m();

	}

}
