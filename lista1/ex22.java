//package lista1;

import java.util.Scanner;

public class ex22 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 22");
		System.out.println("\nresultado: \n");
		System.out.println("Informe a primeira medida: ");
		double medida1 = scan.nextDouble();
		System.out.println("Informe a outra medida: ");
		double medida2 = scan.nextDouble();
		//prints bonitinhas
		System.out.println();
		System.out.printf("Area: %.2f", medida1*medida2/2);
	}
}
