import java.util.Scanner;

import matematica.Calcoli;

public class Home {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] lista= {3,6,8,1,9,0};
		int[] lista2= {1,1,1,1,1,1};
		Calcoli calcolo=new Calcoli();		
		int A=100;
		int B=200;
		int somma = A+B;
		System.out.println(somma);		
		calcolo.differenza();
		calcolo.calcola(somma);
		int importo=100;
		String nome="Penne";
		calcolo.leggiarray(nome, importo,lista);
		System.out.println();
		calcolo.leggiarray(nome, importo, lista2);
		int v = 130;
		String valore=""+130;
		System.out.println(valore.length());
		
		
	}

}
