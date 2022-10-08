//package lista1;

import java.util.Scanner;

public class ex13 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 13");
		System.out.println("\nresultado: \n");
		System.out.print("Digite um valor: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double num2 = scan.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		double num3 = scan.nextDouble();
		System.out.print("Digite o quarto valor: ");
		double num4 = scan.nextDouble();
	
		//print pedida
		System.out.println("\nMedia: " + ((num1*1)+(num2*2)+(num3*3)+(num4*4)/10));
		//print adequada bonitinha
		System.out.println("\nA média ponderada com os pesos 1 2 3 4 dos numeros digitados respectivamente foi de: " + ((num1*1)+(num2*2)+(num3*3)+(num4*4)/10));
	}
}
