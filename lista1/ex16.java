//package lista1;

import java.util.Scanner;

public class ex16 {
	Scanner scan = new Scanner(System.in);

	public void resultado() {
		String nome;
		
		System.out.println("Algoritmo 16");
		
		System.out.println("\nresultado: \n");
	
		System.out.print("Informe um nome: ");
		nome = scan.nextLine();
		
		
		
		//mostra todo o nome
		System.out.println("Todo nome: " + nome);
		//mostra o primeiro caracter
		System.out.println("Primeiro caractere: " + nome.charAt(0));
		//mostra o ultimo cacater
		System.out.println("Ultimo caractere: " + nome.charAt(nome.length() - 1));
        //checa se a string e maior que 4 para poder mostrar do primeiro ate o terceiro e o quarto caracter 
		if (nome.length() >= 4) {
			//mostra do primeiro ate o terceiro se tiver
			System.out.print("Do primeiro até o terceiro: "+nome.substring(0, 3));
			//mostra o quarto caracter se tiver
			System.out.println("\nQuarto caractere: " + nome.charAt(3));
		}
		//mostra mensagem de erro caso a string seja menor que 4 caracteres
		else{System.out.println("\n Seu nome é menor que quatro caracteres não é possivel mostrar do primeiro ate o terceiro nem o quarto caractere"); }
		//mostra todos menos o primeiro
		System.out.print("Todos menos o primeiro: "+nome.substring(1));
        //checa se a string e maior que 2 caracteres caso for mostra os dois ultimos e se nao mostra mensagem de erro
		if (nome.length()>=2) 
			System.out.println("\nOs dois últimos caracteres são: " + nome.substring(nome.length()-2));
		else
			System.out.println("\nSeu nome é menor que 2 caracteres nao foi possivel mostra os dois ultimos caracteres");	
	}	
}
