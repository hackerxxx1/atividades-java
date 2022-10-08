//package lista1;

import java.util.Scanner;

public class ex24 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 24");
		System.out.println("\nresultado: \n");
		System.out.println("Informa a temperatura em graus Celsius: ");
		double celsius = scan.nextDouble();
		//prints bonitinhas
		System.out.println();
		System.out.printf("A temperatura convertida para Fahrenheit é: %.1fºF", (9 * celsius + 160) / 5);
	}
}
