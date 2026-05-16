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
public class TURNO {
    //declaracion de atributos
    private int idTurno;
    private String Nombre;
    private Date horaEntrada;
    private String tolerancia;
    private String diasLaborales;
    private Date horaSalida;

    public TURNO(int idTurno, String Nombre, Date horaEntrada, String tolerancia, String diasLaborales, Date horaSalida) {
        this.idTurno = idTurno;
        this.Nombre = Nombre;
        this.horaEntrada = horaEntrada;
        this.tolerancia = tolerancia;
        this.diasLaborales = diasLaborales;
        this.horaSalida = horaSalida;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public String getTolerancia() {
        return tolerancia;
    }

    public String getDiasLaborales() {
        return diasLaborales;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setTolerancia(String tolerancia) {
        this.tolerancia = tolerancia;
    }

    public void setDiasLaborales(String diasLaborales) {
        this.diasLaborales = diasLaborales;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    @Override
    public String toString() {
        return this.Nombre + " - " + this.diasLaborales;
    }
    
}
