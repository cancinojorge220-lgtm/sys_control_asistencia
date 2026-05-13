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
    //private String IDRol;
    private String Nombre;
    private String Descripcion;
    private boolean PuedeEditarAsistencia;

    public ROL( String Nombre, String Descripcion, boolean PuedeEditarAsistencia) {
        
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.PuedeEditarAsistencia = PuedeEditarAsistencia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    

   
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPuedeEditarAsistencia(boolean PuedeEditarAsistencia) {
        this.PuedeEditarAsistencia = PuedeEditarAsistencia;
    }

  
    public String getNombre() {
        return Nombre;
    }

    public boolean isPuedeEditarAsistencia() {
        return PuedeEditarAsistencia;
    }
    
    
    
}
