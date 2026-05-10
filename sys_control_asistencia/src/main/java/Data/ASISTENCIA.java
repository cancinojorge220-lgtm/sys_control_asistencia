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
public class ASISTENCIA {
    private int IDEmleado;
    private Date fecha;
    private String horaMarcada;
    private String Tipo;

    public ASISTENCIA(int IDEmleado, Date fecha, String horaMarcada, String Tipo) {
        this.IDEmleado = IDEmleado;
        this.fecha = fecha;
        this.horaMarcada = horaMarcada;
        this.Tipo = Tipo;
    }

    public int getIDEmleado() {
        return IDEmleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHoraMarcada() {
        return horaMarcada;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setIDEmleado(int IDEmleado) {
        this.IDEmleado = IDEmleado;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHoraMarcada(String horaMarcada) {
        this.horaMarcada = horaMarcada;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    //metodos de la clase asistencia
    public void MarcarAsistencia() {
    } 
}
