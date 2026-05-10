/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.util.Date;
/**
 *
 * @author alvar
 */
public class PERMISO {
    private int IdPermiso;
    private String motivo;
    private Date fechaInicio;
    private Date fechaFin;
    private String idEmpleado;

    public PERMISO(int IdPermiso, String motivo, Date fechaInicio, Date fechaFin, String idEmpleado) {
        this.IdPermiso = IdPermiso;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idEmpleado = idEmpleado;
    }

    public int getIdPermiso() {
        return IdPermiso;
    }

    public String getMotivo() {
        return motivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdPermiso(int IdPermiso) {
        this.IdPermiso = IdPermiso;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    //metodos de la clase permiso
    public void CrearPermiso() {
    }        
    public void EliminarPermiso() {
    } 

    //Creacion de metodos Turno
    public void crearEmpleado() {
        
    }
    public void editarEmpleado() {
        
    }
    public void EliminarEmpleado() {
        
    }
}
