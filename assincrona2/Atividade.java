


import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        class Super{
            //nome
            String nome;
            //tipo
            String tipo;
            //descrição
            String descrição;
           }
        class Vilao { 
           //identidade secreta 
           private String idsecret;
           //nome    
           private String nomev;
           //universo pertence
           private String universo;
           //liga pertence
           private String liga;
           //telefone
           private String telefone;
           //planeta natal
           private String planeta;
           //idade
           private int idade;
           //cidadenatal
           private String cidade;
           //basesecreta
           private String base;
           //esta na ativa
           private Boolean atuar;
           //super poder
           class Super{
               //nome
               String nome;
               //tipo
               String tipo;
               //descrição
               String descrição;
              }
           //super poderes
           private ArrayList<Super> poderes = new ArrayList<Super>();
           //metodos
           public Vilao(String a, String b,String c ,String l,boolean d , int i, String u, ArrayList<Super> x ) {
            this.nomev = a;
            this.planeta = b;
            this.cidade = c;
            this.atuar= d;
            this.idade=i;
            this.universo=u;
            this.liga=l;
            this.poderes=x;
        }
          /**
 * @return String return the idsecret
 */
public String getIdsecret() {
    if (this.idsecret!= null) {
        return idsecret;
    } else {
        return "indefinido";
    }
}

/**
 * @param idsecret the idsecret to set
 */
public void setIdsecret(String idsecret) {
    this.idsecret = idsecret;
}

/**
 * @return String return the nomeh
 */
public String getNomev() {
    return nomev;
}

/**
 * @param nomeh the nomeh to set
 */
public void setNomev(String nomev) {
    this.nomev = nomev;
}

/**
 * @return String return the universo
 */
public String getUniverso() {
    return universo;
}

/**
 * @param universo the universo to set
 */
public void setUniverso(String universo) {
    this.universo = universo;
}

/**
 * @return String return the liga
 */
public String getLiga() {
    return liga;
}

/**
 * @param liga the liga to set
 */
public void setLiga(String liga) {
    this.liga = liga;
}

/**
 * @return int return the telefone
 */
public String getTelefone() {
    if (this.telefone != null) {
        return telefone;
    } else {
        return "indefinido";
    }
}

/**
 * @param telefone the telefone to set
 */
public void setTelefone(String telefone) {
    this.telefone = telefone;
}

/**
 * @return String return the planeta
 */
public String getPlaneta() {
    return planeta;
}

/**
 * @param planeta the planeta to set
 */
public void setPlaneta(String planeta) {
    this.planeta = planeta;
}

/**
 * @return int return the idade
 */
public int getIdade() {
    return idade;
}

/**
 * @param idade the idade to set
 */
public void setIdade(int idade) {
    this.idade = idade;
}

/**
 * @return String return the cidade
 */
public String getCidade() {
    return cidade;
}

/**
 * @param cidade the cidade to set
 */
public void setCidade(String cidade) {
    this.cidade = cidade;
}

/**
 * @return String return the base
 */
public String getBase() {
    return base;
}

/**
 * @param base the base to set
 */
public void setBase(String base) {
    this.base = base;
}

/**
 * @return Boolean return the atuar
 */
public Boolean isAtuar() {
    return atuar;
}

/**
 * @param atuar the atuar to set
 */
public void setAtuar(Boolean atuar) {
    this.atuar = atuar;
}
public void setPoderes(ArrayList<Super> x){
    this.poderes= x;
}
public ArrayList<Super> getPoderes(){
    return poderes;
}
}
        class Heroi { 
            //identidade secreta 
            private String idsecret;
            //nome    
            private String nomeh;
            //universo pertence
            private String universo;
            //liga pertence
            private String liga;
            //telefone
            private String telefone;
            //planeta natal
            private String planeta;
            //idade
            private int idade;
            //cidadenatal
            private String cidade;
            //basesecreta
            private String base;
            //esta na ativa
            private Boolean atuar;
            //super poder
            class Super{
                //nome
                String nome;
                //tipo
                String tipo;
                //descrição
                String descrição;
               }
            //super poderes
            private ArrayList<Super> poderes = new ArrayList<Super>();
            //metodos
            public Heroi(String a, String b,String c, String l ,boolean d , int i, String u , ArrayList<Super> x) {
                this.nomeh = a;
                this.planeta = b;
                this.cidade = c;
                this.atuar= d;
                this.idade=i;
                this.universo=u;
                this.liga = l;
                this.poderes=x;
            }
              /**
     * @return String return the idsecret
     */
    public String getIdsecret() {
        return idsecret;
    }

    /**
     * @param idsecret the idsecret to set
     */
    public void setIdsecret(String idsecret) {
        this.idsecret = idsecret;
    }

    /**
     * @return String return the nomeh
     */
    public String getNomeh() {
        return nomeh;
    }

    /**
     * @param nomeh the nomeh to set
     */
    public void setNomeh(String nomeh) {
        this.nomeh = nomeh;
    }

    /**
     * @return String return the universo
     */
    public String getUniverso() {
        return universo;
    }

    /**
     * @param universo the universo to set
     */
    public void setUniverso(String universo) {
        this.universo = universo;
    }

    /**
     * @return String return the liga
     */
    public String getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(String liga) {
        this.liga = liga;
    }

    /**
     * @return int return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the planeta
     */
    public String getPlaneta() {
        return planeta;
    }

    /**
     * @param planeta the planeta to set
     */
    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return String return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return String return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return Boolean return the atuar
     */
    public Boolean isAtuar() {
        return atuar;
    }

    /**
     * @param atuar the atuar to set
     */
    public void setAtuar(Boolean atuar) {
        this.atuar = atuar;
    }
            
            void mostra(){
                System.out.println();
               
            }   
        }
        
        
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
        if (op == 1 || op ==2) {
            System.out.println("\nBem vindo de volta ao programa do governo idiota o que e que vc quer fazer agora?");
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