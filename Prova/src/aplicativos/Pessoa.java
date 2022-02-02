package aplicativos;

public abstract class Pessoa {

    private String nome;
    private String cpf;
 
    //construtor vazio
    public Pessoa() {
    }
    
    //construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract Piloto getPilotoab();
    
    //getters and setters
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf ){
        this.cpf = cpf;
    }
     


}
 

