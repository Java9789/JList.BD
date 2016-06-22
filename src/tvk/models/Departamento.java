package tvk.models;

public class Departamento {
    private int id_departamento;
    private Pais pais;
    private String nombre;

    public Departamento(){}

    public Departamento(int id_departamento){
        this.id_departamento = id_departamento;
    }

    public Departamento(int id_departamento, Pais pais, String nombre){
        this.id_departamento = id_departamento;
        this.pais = pais;
        this.nombre = nombre;
    }

    public int getIdDepartamento(){
        return id_departamento;
    }

    public void setIdDepartamento(int id_departamento){
        this.id_departamento = id_departamento;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}