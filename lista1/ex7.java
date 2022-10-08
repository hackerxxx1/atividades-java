//package lista1;

import java.util.Scanner;

public class ex7 {
	
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 7");
		System.out.println("\nresultado: \n");
		System.out.print("Digite um numero: ");
		double num = scan.nextDouble();
		System.out.println("\nNumero digitado: " + num);
		System.out.println("Numero sucessor: " + (num+1));
		System.out.println("Numero antecessor: " + (num-1));
	}
}
