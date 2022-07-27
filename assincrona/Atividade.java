


import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        class Candidato { 
            //idade 
            int id;
            //nome    
            String nome;
            //sexo
            String sexo;
            //telefone
            int telefone;
            //proposta do candidato
            String proposta;
            //quantidade de votos candidato
            int votos;
            //metodos
            //metodo mostrar dados do candidato
            void mostra(){
                System.out.println("esses sao os dados do candidato: "+this.nome);
                System.out.println("nome: "+this.nome);
                System.out.println("telefone: "+this.telefone);
                System.out.println("sexo: "+this.sexo);
                System.out.println("idade: "+this.id);
                System.out.println("proposta: "+this.proposta);
                System.out.println("quantidade de votos ja computadas: "+this.votos+"\n");
            }   
        }
        Candidato lula = new Candidato();
        lula.nome = " Lula Molusco ";
        lula.id = 30;
        lula.sexo = "M";
        lula.telefone = 40028922;
        lula.proposta = "da feira do biquíni, perdeu um tentáculo em acidente da indústria que trabalha";
        Candidato bolso = new Candidato();
        bolso.nome = " Bolso Nelson ";
        bolso.id = 32;
        bolso.sexo = "M";
        bolso.telefone = 40028922;
        bolso.proposta = "dizem que cuida dos fazendeiros e muitas cabeças de gado.";
        Candidato cilouca = new Candidato();
        cilouca.nome = " Cilouca Gomes ";
        cilouca.id = 45;
        cilouca.sexo = "M";
        cilouca.telefone = 40028922;
        cilouca.proposta = "pela volta do coronelismo no brasil, O tempo do café com leite que era bom";
        Candidato bolos = new Candidato();
        bolos.nome = " Bolos Bolinho ";
        bolos.id = 30;
        bolos.sexo = "M";
        bolos.telefone = 40028922;
        bolos.proposta = "parece que confeitaria é sua profissão mas na verdade ele atua no ramo imobiliário.";
        System.out.println("bem vindo ao programa de votação feito pelo governo e bem a cara do governo mal feito");
        int op = 0;
    while (op != 3) {
        if (op == 1 || op ==2) {
            System.out.println("\nBem vindo de volta ao programa do governo idiota o que e que vc quer fazer agora?");
        }
        System.out.println("1-Ver candidatos e propostas");
        System.out.println("2-votar candidatos");
        System.out.println("3-sair desse programa ruim");
        System.out.println("selecione o que quer fazer ai: ");

        Scanner ler = new Scanner(System.in);
        op = ler.nextInt();
        switch (op) {
            case 1:
                System.out.println("Candidato:"+lula.nome+"\n");
                lula.mostra();
                System.out.println("Candidato:"+bolso.nome+"\n");
                bolso.mostra();
                System.out.println("Candidato:"+cilouca.nome+"\n");
                cilouca.mostra();
                System.out.println("Candidato:"+bolos.nome+"\n");
                bolos.mostra();
                break;
            case 2 : 
                System.out.println("Selecione qual candidato quer votar:");
                System.out.println("1-"+lula.nome);
                System.out.println("2-"+bolso.nome);
                System.out.println("3-"+cilouca.nome);
                System.out.println("4-"+bolos.nome);
                Scanner ler2 = new Scanner(System.in);
                int candidato = ler2.nextInt();
                switch (candidato) {
                    case 1:
                        lula.votos++;
                        System.out.println("Obrigado voce votou no canditato"+lula.nome+"seu merda sai desse pais e vai pra feira do biquini");
                        
                        break;
                    case 2:
                        bolso.votos++;
                        System.out.println("Obrigado voce votou no canditato"+bolso.nome+"voce nao tem o que fazer ne vai pra inslandia");
                        
                        break;
                    case 3:
                        cilouca.votos++;
                        System.out.println("Obrigado voce votou no canditato"+cilouca.nome+"lugar de militar e no quartel volta pra ele");
                        
                        break;
                    case 4:
                        bolos.votos++;
                        System.out.println("Obrigado voce votou no canditato"+lula.nome+"voce deveria tambem fazer bolos de casamento pra ver se para de nao ter o que fazer");
                        
                        break;
                
                    default:
                        System.out.println("brasileiro e foda n consegue nem votar direito");
                        break;
                }
                break;
            case 3:
                System.out.println("ate nunca mais");
                break;    
            default:
                System.out.println("voce tem que digitar essa porra direito");
                break;
        }
    }
    } 
}