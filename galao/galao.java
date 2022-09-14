package galao;

import java.util.Scanner;

public class galao {
    public static void main(String[] args) {
        Double galao;
        Double litro;
        int op = 0;
        while (op != 3) {
            if (op == 1 || op ==2) {
                System.out.println("\nBem vindo de volta ao programa ruim o que e que vc quer fazer agora?");
            }
            System.out.println("1-converter galões em litros");
            System.out.println("2-converter litros em galões");
            System.out.println("3-sair desse programa ruim");
            System.out.println("selecione o que quer fazer ai: ");
    
            Scanner ler = new Scanner(System.in);
            
            op = ler.nextInt();
          
            switch (op) {
                case 1:
                    System.out.println("digite o numero de galoes ai: ");
                    Scanner ler2 = new Scanner(System.in);
                    galao = ler2.nextDouble();
                   
                    litro = galao * 3.7854;
                    System.out.println("o numero de galoes foi: "+galao+" e o numero de litros foi: "+litro);    
                    break;
                case 2:
                    System.out.println("digite o numero de litros ai: ");
                    Scanner ler3 = new Scanner(System.in);
                    litro = ler3.nextDouble();
                    
                    galao = litro / 3.7854;
                    System.out.println("o numero de galoes foi: "+galao+" e o numero de litros foi: "+litro);    
                        break;
                default:
                    break;
                  
            }
            ler.close();
        }
        
        }
}
