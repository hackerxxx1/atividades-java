//package lista1;

import java.util.Scanner;

public class ex18 {
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo 18");
		
		System.out.println("\nresultado: \n");
		System.out.print("Informe o raio: ");
		double r = scan.nextDouble();
		//prints bonitinhas
		System.out.println();
		System.out.printf("Perímetro: %.3f", 2*Math.PI*r);
		System.out.printf("\nÁrea: %.3f", Math.PI*Math.pow(r, 2));
	}
}
