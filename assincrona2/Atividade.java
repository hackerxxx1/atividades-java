


import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
    
        
        
        
        System.out.println("bem vindo ao programa de herois e viloes que nao servem de nada");
        ArrayList<Heroi> h = new ArrayList<Heroi>();
        ArrayList<Vilao> v = new ArrayList<Vilao>();
        ArrayList<Super> aux = new ArrayList<Super>();
        Super poder = new Super();
        poder.nome = "raio lazer";
        poder.descrição = "atira um raio que corta as coisas ate o seu alcance maximo muito top";
        poder.tipo = "projetil";
        aux.add(poder);
        Super poder2 = new Super();
        poder2.nome = "Super força";
        poder2.descrição = "Por causa da gravidade fraca o superman tem o poder de super força podendo ate voar com a propria força";
        poder2.tipo = "habilidade";
        aux.add(poder2);
        Heroi superman = new Heroi("superman o pika das galaxias", "planeta onde a gravidade e 40x mais forte que a terra", "tao tao distante", "liga da justiça",true, 200, "dc comicas", aux);
        int op = 0;
    while (op != 5) {
        if (op == 1 || op ==2 || op==3|| op==4) {
            System.out.println("\nBem vindo de volta ao programa de herois e viloes que nao servem pra nada o que e que vc quer fazer agora?");
        }
        System.out.println("1-Ver herois");
        System.out.println("2-Colocar herois");
        System.out.println("3-Ver viloes");
        System.out.println("4-Colocar viloes");
        System.out.println("5-sair desse programa ruim");
        System.out.println("selecione o que quer fazer ai: ");

        Scanner ler = new Scanner(System.in);
        op = ler.nextInt();
        switch (op) {
            case 1:
               
                break;
            case 2 : 
                
                break;
            case 3 : 
                
                break;
            case 4 : 
                
                break;
            case 5:
                System.out.println("ate nunca mais");
                break;    
            default:
                System.out.println("voce tem que digitar essa porra direito");
                break;
        }
        ler.close();
    }
    } 

   

}