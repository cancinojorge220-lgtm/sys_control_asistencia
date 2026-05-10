/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author alvar
 */
public class ROL {
    private String IDRol;
    private String Nombre ;
    private boolean PuedeEditarAsistencia;

    public ROL(String IDRol, String Nombre, boolean PuedeEditarAsistencia) {
        this.IDRol = IDRol;
        this.Nombre = Nombre;
        this.PuedeEditarAsistencia = PuedeEditarAsistencia;
    }

    public void setIDRol(String IDRol) {
        this.IDRol = IDRol;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPuedeEditarAsistencia(boolean PuedeEditarAsistencia) {
        this.PuedeEditarAsistencia = PuedeEditarAsistencia;
    }

    public String getIDRol() {
        return IDRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public boolean isPuedeEditarAsistencia() {
        return PuedeEditarAsistencia;
    }
    
    
    
}
