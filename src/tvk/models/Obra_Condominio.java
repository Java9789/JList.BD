package tvk.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Obra_Condominio {
    // <editor-fold defaultstate="collapsed" desc="Attributes">
    private int id_obra_condominio;
    private Distrito distrito;
    private String nombre;
    private double costo;
    private String incidencias;
    private String imagen;
    private String direccion;
    private int n_estacionamientos;
    private double proceso;
    private String descripcion_proceso;
    private int estado;
    private Date fecha_inicio;
    private Date fecha_final;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Obra_Condominio(){}

    public Obra_Condominio(int id_obra_condominio){
        this.id_obra_condominio = id_obra_condominio;
    }

    public Obra_Condominio(int id_obra_condominio, Distrito distrito, String nombre, double costo, String incidencias, String imagen, String direccion, int n_estacionamientos, double proceso, String descripcion_proceso, int estado, Date fecha_inicio, Date fecha_final){
        this.id_obra_condominio = id_obra_condominio;
        this.distrito = distrito;
        this.nombre = nombre;
        this.costo = costo;
        this.incidencias = incidencias;
        this.imagen = imagen;
        this.direccion = direccion;
        this.n_estacionamientos = n_estacionamientos;
        this.proceso = proceso;
        this.descripcion_proceso = descripcion_proceso;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get & Set Methods">
    public int getIdObraCondominio(){
        return id_obra_condominio;
    }

    public void setIdObraCondominio(int id_obra_condominio){
        this.id_obra_condominio = id_obra_condominio;
    }

    public Distrito getDistrito(){
        return distrito;
    }

    public void setDistrito(Distrito distrito){
        this.distrito = distrito;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getCosto(){
        return costo;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

    public String getIncidencias(){
        return incidencias;
    }

    public void setIncidencias(String incidencias){
        this.incidencias = incidencias;
    }

    public String getImagen(){
        return imagen;
    }

    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getNEstacionamientos(){
        return n_estacionamientos;
    }

    public void setNEstacionamientos(int n_estacionamientos){
        this.n_estacionamientos = n_estacionamientos;
    }

    public double getProceso(){
        return proceso;
    }

    public void setProceso(double proceso){
        this.proceso = proceso;
    }

    public String getDescripcionProceso(){
        return descripcion_proceso;
    }

    public void setDescripcionProceso(String descripcion_proceso){
        this.descripcion_proceso = descripcion_proceso;
    }

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
    }

    public Date getFechaInicio(){
        return fecha_inicio;
    }

    public void setFechaInicio(Date fecha_inicio){
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFechaFinal(){
        return fecha_final;
    }

    public void setFechaFinal(Date fecha_final){
        this.fecha_final = fecha_final;
    }
    // </editor-fold>    
    
    /**
     * Select nombre from obra_condominio
     * @return 
     */
    public static List<Obra_Condominio> name(){
        List<Obra_Condominio> obra = new ArrayList<>();
        try {
            PreparedStatement ps = Conexion.getConnection().prepareStatement("select nombre from obra_condominio");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Obra_Condominio ob = new Obra_Condominio();
                ob.setNombre(rs.getString(1));
                obra.add(ob);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return obra;
    }
    
}