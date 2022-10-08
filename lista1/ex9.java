//package lista1;

import java.util.Scanner;

public class ex9 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 9");
		System.out.println("\nresultado: \n");
		System.out.print("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		
		//print pedida
		System.out.println("\nSoma: " +(num1+num2));
		//print adequada
		System.out.println("A soma dos numeros digitados é: " +(num1+num2));
	}
}
