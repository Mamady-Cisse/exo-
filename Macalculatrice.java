package formation;

public class Macalculatrice {
	
	//création de la d'addition
	
	public int additionner(int a, int b) {
		int c=a+b;
		
		return c;
	}

	public int soustraire(int a, int b) {
		int c=a-b;
		
            return c;
	}
	
	public int mitiplier(int a,int b) {
		int c=a*b;
		
		return c;
	}
	
	public int diviser(int a,int b) {
		int c=a/b;
		return c;
		
	}
	
public static void main(String[] args) {
	Calcul c =new Calcul();
int resultat=   c.additionner(10, 2);
System.out.println(resultat);
}

}


