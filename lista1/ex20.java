//package lista1;

import java.util.Scanner;

public class ex20 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 20");
		System.out.println("\nresultado: \n");
		System.out.print("Informe o lado A: ");
		double ladoA = scan.nextDouble();
		System.out.print("Informe o lado B: ");
		double ladoB = scan.nextDouble();
		System.out.print("Informe o lado C: ");
		double ladoC = scan.nextDouble();
		//prints bonitinhas
		
		System.out.println();
		System.out.printf("Diagonal: %.2f", Math.sqrt(Math.pow(ladoA, 2)+Math.pow(ladoB, 2)+Math.pow(ladoC, 2)));
	}
}
