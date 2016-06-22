package tvk.models;

public class Distrito {
    private int id_distrito;
    private Provincia provincia;
    private String nombre;

    public Distrito(){}

    public Distrito(int id_distrito){
        this.id_distrito = id_distrito;
    }

    public Distrito(int id_distrito, Provincia provincia, String nombre){
        this.id_distrito = id_distrito;
        this.provincia = provincia;
        this.nombre = nombre;
    }

    public int getIdDistrito(){
        return id_distrito;
    }

    public void setIdDistrito(int id_distrito){
        this.id_distrito = id_distrito;
    }

    public Provincia getProvincia(){
        return provincia;
    }

    public void setProvincia(Provincia provincia){
        this.provincia = provincia;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}