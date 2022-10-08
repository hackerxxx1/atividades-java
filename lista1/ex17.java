//package lista1;

import java.util.Scanner;

public class ex17 {
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo 17");
		System.out.println("\nresultado: \n");
		double base, altura;
		System.out.print("Informe a base: ");
		base = scan.nextDouble();
		System.out.print("Informe a Altura: ");
		altura = scan.nextDouble();
		
		
		//prints bonitas
		System.out.println();
		System.out.println("Perímetro: " + 2*(base+altura));
		System.out.println("Area: " + base*altura);
		System.out.println("Diagonal: " + Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2)));
	}
}
