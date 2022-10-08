//package lista1;

import java.util.Scanner;

public class ex19 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 19");
		System.out.println("\nresultado: \n");
		double lado;
		System.out.print("Informe o valor do lado: ");
		lado = scan.nextDouble();
	    //prints bonitinhas
		System.out.println();
		System.out.println("Perímetro: " + 4 * lado);
		System.out.println("Area: " + Math.pow(lado, 2));
		System.out.printf("Diagonal: %.2f", Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2)));
	}
}
