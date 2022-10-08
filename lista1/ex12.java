//package lista1;

import java.util.Scanner;

public class ex12 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 12");
		System.out.println("\nresultado: \n");
		System.out.print("Digite o primeiro valor: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double num2 = scan.nextDouble();

		//print pedida
		System.out.println("\nMédia: " + ((num1 + num2) / 2));
		//print adequada bonitinha
		System.out.println("\nA média aritimetica dos numeros digitados foi de: " + ((num1 + num2) / 2));
	}
}
