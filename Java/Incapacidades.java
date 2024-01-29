import java.sql.Date;

public class Incapacidades{
    private int idIncapacidades;
    private int idEmpleado;
    private Date Fechainicio;
    private Date Fechafin;
    private int Numincapacidades;
    private int duracion;
    public int getIdIncapacidades() {
        return idIncapacidades;
    }
    public void setIdIncapacidades(int idIncapacidades) {
        this.idIncapacidades = idIncapacidades;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Date getFechainicio() {
        return Fechainicio;
    }
    public void setFechainicio(Date fechainicio) {
        Fechainicio = fechainicio;
    }
    public Date getFechafin() {
        return Fechafin;
    }
    public void setFechafin(Date fechafin) {
        Fechafin = fechafin;
    }
    public int getNumincapacidades() {
        return Numincapacidades;
    }
    public void setNumincapacidades(int numincapacidades) {
        Numincapacidades = numincapacidades;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    


}