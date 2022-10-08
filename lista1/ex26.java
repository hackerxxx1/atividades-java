//package lista1;

import java.util.Scanner;

public class ex26 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 26");
		System.out.println("\nresultado: \n");
		System.out.print("Informe o valor: ");
		double valor = scan.nextDouble();
		System.out.print("Informe a taxa de encargos: ");
		double taxa = scan.nextDouble();
		System.out.print("Informe o tempo de atraso: ");
		double tempo = scan.nextDouble();
		//prints bonitinhas
		System.out.println();
		System.out.printf("O valor da prestação é R$: %.2f", valor+(valor*(taxa/100)*tempo));
	}
}
