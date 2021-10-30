package matematica;

import java.util.Scanner;

public class Calcoli {
	private Scanner in = new Scanner(System.in);
	private int valore;
	
	public void differenza() { // senza argomenti, parametri (arg1,arg2 .....)
		int C=100;
		int val=600;
		int diff=val-C;
		System.out.println("diff: "+diff);
	}
	
	public void calcola(int s) {
		System.out.println("somma:"+s);
	}
	
	public void leggiarray(String s,int v, int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public void calcolo2() {
		int sss=valore+20;
		System.out.println(sss);
	}
	
	public void calcolo2(int a) {
		int sss=valore+20+a;
		System.out.println(sss);
	}
}
