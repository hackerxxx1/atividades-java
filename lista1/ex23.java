//package lista1;

import java.util.Scanner;

public class ex23 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 23");
		
		System.out.println("\nresultado: \n");
		System.out.print("Informe seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = scan.nextInt();
		//prints bonitinhas
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}
}
