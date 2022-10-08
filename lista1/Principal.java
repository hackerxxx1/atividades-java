//package lista1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int op=28, ctd = 0;
		do {
		if (ctd>0)
			System.out.println("\nBem vindo de volta voce visitou recentemente o exercicio: ("+op+") Voce ja entrou em "+ctd+" exercicio(s)");
		System.out.println("\npara vizualizar as questoes entre na classe ex27 e vizualize os comentarios da classe respostas ");
		System.out.print("\nescolha um número de 1 a 26 para executar os algoritmos se quiser sair digite 0: ");
		op = scan.nextInt();
		System.out.println();
		
		switch(op) {
			case 1:
				new ex1().resultado();
				ctd++;		
				break;
			case 2:
				new ex2().resultado();
				ctd++;
				break;
			case 3:
				new ex3().resultado();
				ctd++;
				break;
			case 4:
				new ex4().resultado();
				ctd++;
				break;
			case 5:
				new ex5().resultado();
				ctd++;
				break;	
			case 6:
				new ex6().resultado();
				ctd++;
				break;
			case 7:
				new ex7().resultado();
				ctd++;
				break;
			case 8:
				new ex8().resultado();
				ctd++;
				break;
			case 9:
				new ex9().resultado();
				ctd++;
				break;	
			case 10:
				new ex10().resultado();
				ctd++;
				break;
			case 11:
				new ex11().resultado();
				ctd++;		
				break;
			case 12:
				new ex12().resultado();
				ctd++;
				break;
			case 13:
				new ex13().resultado();
				ctd++;
				break;
			case 14:
				new ex14().resultado();
				ctd++;
				break;
			case 15:
				new ex15().resultado();
				ctd++;
				break;	
			case 16:
				new ex16().resultado();
				ctd++;
				break;
			case 17:
				new ex17().resultado();
				ctd++;
				break;
			case 18:
				new ex18().resultado();
				ctd++;
				break;
			case 19:
				new ex19().resultado();
				ctd++;
				break;	
			case 20:
				new ex20().resultado();
				ctd++;
				break;
			case 21:
				new ex21().resultado();
				ctd++;
				break;
			case 22:
				new ex22().resultado();
				ctd++;
				break;
			case 23:
				new ex23().resultado();
				ctd++;
				break;
			case 24:
				new ex24().resultado();
				ctd++;
				break;
			case 25:
				new ex25().resultado();
				ctd++;
				break;
			case 26:
				new ex26().resultado();
				ctd++;
				break;
			case 27:
				new ex27().respostas();
				ctd++;
				break;
			case 0:
				System.out.println("Programa encerrado!!!");
				System.out.println("Tenha um bom dia!!!");
				break;
			default :
				System.out.println("Opção invalida!!!");
			}
		
		}while(op != 0);
			
		scan.close();
	}

}