package aplicativos;


public class Piloto extends Pessoa {
    
    private String breve;
    private String matricula;
    public Aeronave boing77;
    
  

    //construtor vazio
    

    public Piloto() {
    }

    public Piloto getPilotoab(){
        return this;

    }

    //construtores
    public Piloto(String breve, String matricula) {
        this.breve = breve;
        this.matricula = matricula;
    }

    // Getters and setters 
    public String getBreve() {
        return breve;
    }
    public void setBreve(String breve) {
        this.breve = breve;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    
}
