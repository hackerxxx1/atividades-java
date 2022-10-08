//package lista1;

import java.util.Scanner;

public class ex21 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 21");
		System.out.println("\nresultado: \n");
		System.out.print("Informe a base: ");
		double base = scan.nextDouble();
		System.out.print("Informe a Altura: ");
		double altura = scan.nextDouble();
		//prints bonitinhas
		System.out.println();
		System.out.printf("Area: %.2f", (base * altura) / 2);
	}
}
