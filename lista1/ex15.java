//package lista1;

import java.util.Scanner;

public class ex15 {
	Scanner scan = new Scanner(System.in);
	public void resultado() {
		System.out.println("Algoritmo 15");
		System.out.println("\nresultado: \n");
		System.out.print("Digite o valor do salário mínimo: ");
		double salario = scan.nextDouble();
		System.out.print("Digite a quantidade de QuiloWatts: ");
		double qtdw = scan.nextDouble();
		//calculo preco do kw
		double preco = (salario/7)/100;
		//calculo do valor da conta
		double vp = preco*qtdw;
		//calculo do valor da conta com desconto
		double vpd = vp-(vp*0.1);
		//prints
		System.out.printf("\nValor em reais de cada quiloWatts: %.2f", preco);
		System.out.printf("\nValor em reais a ser pago: %.2f\n", vp);
		System.out.println("Valor do desconto a ser aplicado na conta"+(vp*0.1));
		System.out.printf("O novo valor a ser pago por essa residência com um desconto de 10 por cento: %.2f", vpd);
	}
}
