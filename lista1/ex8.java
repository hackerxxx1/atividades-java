//package lista1;

import java.util.Scanner;

public class ex8 {
	
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.println("Algoritmo 8");
		System.out.println("\nresultado: \n");
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite seu endereço: ");
		String endereco = scan.nextLine();
		System.out.print("Digite seu telefone: ");
		String telefone = scan.nextLine();
		//print bonitinha
		System.out.println("\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
	}
}
