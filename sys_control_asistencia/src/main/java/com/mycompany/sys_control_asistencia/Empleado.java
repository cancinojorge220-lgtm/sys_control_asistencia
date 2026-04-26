package com.mycompany.sys_control_asistencia;

public class Empleado {
    //Atributos
    private String dni;
    private String nombre;
    private String cargo;
    private String rol;
    private Turno turno;
    private boolean activo;

    //Constructor
    public Empleado(String dni, String nombre, String cargo, String rol, Turno turno, boolean activo) {
        setDni(dni);
        this.nombre = nombre;
        this.cargo = cargo;
        this.rol = rol;
        this.turno = turno;
        this.activo = activo;
    }

    public Empleado() {
    }
    
    
    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public String getRol() {
        return rol;
    }

    
    public boolean isActivo() {
        return activo;
    }

    private void setDni(String dni) {
        if (dni == null || dni.length() != 8 || !dni.matches("\\d+")) {
            throw new IllegalArgumentException("DNI debe tener exactamente 8 números");
        }
        this.dni = dni;
    }  
    
    @Override
    public String toString() {
        return "Nuevo Empleado: " + this.dni + " | " + this.nombre  +  " | " + this.turno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }    
    
}
