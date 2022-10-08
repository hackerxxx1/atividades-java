//package lista1;

import java.util.Scanner;

public class ex10 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 10");
		System.out.println("\nresultado: \n");
		System.out.print("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		//print bonitinha
		System.out.println("\nO produto entre os numeros digitados é:");
		System.out.println(num1*num2);
	}
}
