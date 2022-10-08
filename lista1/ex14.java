//package lista1;

import java.util.Scanner;

public class ex14 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 14");
		System.out.println("\nresultado: \n");
		System.out.print("Digite o valor que deseja aplicar: ");
		double saldo = scan.nextDouble();
		
		//print extra com informação de quanto vc lucro
		System.out.println("O valor do lucro da aplicação foi de: "+(saldo*0.01));
		System.out.println("O valor do saldo atualizado é: "+(saldo+(saldo*0.01)));
	}
}
