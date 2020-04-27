package surface_Périmétre;

import java.util.Scanner;

public class Calculer {

	/**
	 * $param args
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
double la,lo,s,p;
Scanner lire=new Scanner(System.in);
System.out.print("entrer la longueur");
lo=lire.nextDouble();
System.out.print("entrer la largeur");
la=lire.nextDouble();
p=(la+lo)*2;
s=la*lo;
System.out.println("la surface est:"+ s);
System.out.println("le perimetre est:"+ p);

	}
}
