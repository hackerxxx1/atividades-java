//package lista1;

import java.util.Scanner;

public class ex6 {
	
	Scanner scan = new Scanner(System.in);

	public void resultado() {
		System.out.println("Algoritmo 6");
		System.out.println("\nresultado: \n");
		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		//printa mensagem bonitinha
		System.out.println("primeiro numero é: "+num1 + " e o segundo numero é: " + num2);
	}
}
