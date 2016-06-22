package tvk.models;

public class Provincia {
    private int id_provincia;
    private Departamento departamento;
    private String nombre;

    public Provincia(){}

    public Provincia(int id_provincia){
        this.id_provincia = id_provincia;
    }

    public Provincia(int id_provincia, Departamento departamento, String nombre){
        this.id_provincia = id_provincia;
        this.departamento = departamento;
        this.nombre = nombre;
    }

    public int getIdProvincia(){
        return id_provincia;
    }

    public void setIdProvincia(int id_provincia){
        this.id_provincia = id_provincia;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}