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
public class EMPLEADO {
    private int DNI;
    private String Nombre;
    private String Apellidos;
    private Date FechaNacimiento;
    private String Cargo;
    private String Telefono;
    private String Turno;
    private boolean Estado;
    private String Direccion;
    private int IdEmpleado;
    private int IdRol;

    public EMPLEADO(int DNI, String Nombre, String Apellidos, Date FechaNacimiento, String Cargo, String Telefono, String Turno, boolean Estado, String Direccion, int IdEmpleado, int IdRol) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.Cargo = Cargo;
        this.Telefono = Telefono;
        this.Turno = Turno;
        this.Estado = Estado;
        this.Direccion = Direccion;
        this.IdEmpleado = IdEmpleado;
        this.IdRol = IdRol;
    }
    public EMPLEADO(int DNI, String Nombre, String Apellidos)
    {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getCargo() {
        return Cargo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getTurno() {
        return Turno;
    }

    public boolean isEstado() {
        return Estado;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }
    
    @Override
    public String toString() {
        return this.Nombre + " "+ this.Apellidos; 
    }
}
