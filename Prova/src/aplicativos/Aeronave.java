package aplicativos;

public class Aeronave {

    private String modelo;
    private String categoria;
    private Piloto p2;
    public Piloto p1;
    

    //construtor vazio
    public Aeronave(){
        
    }

     // construtores
     public Aeronave(String modelo, String categoria, Piloto p2) {
        this.modelo = modelo;
        this.categoria = categoria;
        this.p2 = p2;
    }

    // getters and setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Piloto getp2() {
        return p2;
    }
    public void setPiloto(Piloto p2) {
        this.p2 = p2;
    }

    
  
    
    
    
}
