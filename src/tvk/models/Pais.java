package tvk.models;

public class Pais {
    private int id_pais;
    private String nombre;

    public Pais(){}

    public Pais(int id_pais){
        this.id_pais = id_pais;
    }

    public Pais(int id_pais, String nombre){
        this.id_pais = id_pais;
        this.nombre = nombre;
    }

    public int getIdPais(){
        return id_pais;
    }

    public void setIdPais(int id_pais){
        this.id_pais = id_pais;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}