//package lista1;

import java.util.Scanner;

public class ex25 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 25");
		
		System.out.println("\nresultado: \n");
		System.out.println("Informe a altura da lata: ");
		double altura = scan.nextDouble();
		System.out.println("Informe o raio da lata: ");
		double raio = scan.nextDouble();
		//prints bonitinhas
		System.out.println();
		System.out.printf("Volume: %.3f", 3.14159 * Math.pow(raio, 2) * altura);
	}
}
