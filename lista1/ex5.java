//package lista1;

import java.util.Scanner;

public class ex5 {
	
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo 5");
		System.out.println("\nresultado: \n");
		System.out.print("Digite um numero: ");
		//ler diretamente no print um numero double para economia de memoria
		System.out.println(scan.nextDouble());
	}
}
