import java.util.ArrayList;

public class Heroi {
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
    public Heroi(String a, String b,String c, String l ,boolean d , int i, String u , ArrayList<Super> aux) {
        this.nomeh = a;
        this.planeta = b;
        this.cidade = c;
        this.atuar= d;
        this.idade=i;
        this.universo=u;
        this.liga = l;
        this.poderes=aux;
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

public void setPoderes(ArrayList<Super> x){
    this.poderes= x;
}
public ArrayList<Super> getPoderes(){
    return poderes;
}
       
}
