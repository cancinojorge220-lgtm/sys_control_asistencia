package Data;

public class ROL {
    private int IDRol;
    private String Nombre;
    private String Descripcion;
    private boolean PuedeEditarAsistencia;

    public ROL(int IDRol, String Nombre, String Descripcion, boolean PuedeEditarAsistencia) {
        this.IDRol = IDRol;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.PuedeEditarAsistencia = PuedeEditarAsistencia;
    }
       
    public void setIDRol(int IDRol) {
        this.IDRol = IDRol;
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
    
    public int getIDRol() {
        return IDRol;
    }  

    public String getDescripcion() {
        return Descripcion;
    }
  
    public String getNombre() {
        return Nombre;
    }

    public boolean isPuedeEditarAsistencia() {
        return PuedeEditarAsistencia;
    }
    
    @Override
    public String toString() {
        return this.Nombre; 
    }
    
}
