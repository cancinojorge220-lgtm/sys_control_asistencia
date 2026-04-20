package com.mycompany.sys_control_asistencia;

public class Empleado {
    //Atributos
    private String dni;
    private String nombre;
    private String cargo;
    private String rol;
    private boolean activo;

    //Constructor
    public Empleado(String dni, String nombre, String cargo, String rol, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.cargo = cargo;
        this.rol = rol;
        this.activo = activo;
    }

    public Empleado() {
    }
    
    

    public String getDni() {return dni;}
    public String getNombre() {return nombre;}
    public String getCargo() {return cargo;}
    public String getRol() {return rol;}
    public boolean isActivo() {return activo; }

    public void setDni(String dni) {
        if (dni.length() != 8) {
            throw new IllegalArgumentException("DNI debe tener 8 dígitos");
        }
        this.dni = dni;
    }   

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public void setRol(String rol) {this.rol = rol;}
    public void setActivo(boolean activo) {this.activo = activo;}
    
    
    
    
}
