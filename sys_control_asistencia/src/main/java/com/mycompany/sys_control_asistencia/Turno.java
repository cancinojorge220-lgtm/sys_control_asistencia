package com.mycompany.sys_control_asistencia;

import java.time.LocalTime;

public class Turno {
    //Atributos
    private String nombreTurno;
    private LocalTime horaEntrada;
    private int tolerancia; // en minutos
    private String rol; // "ADMIN" o "EMPLEADO"
    
    //Constructores
    public Turno() {
    }

    public Turno(String nombreTurno, LocalTime horaEntrada, int tolerancia, String rol) {
        this.nombreTurno = nombreTurno;
        this.horaEntrada = horaEntrada;
        this.tolerancia = tolerancia;
        this.rol = rol;
    }
    public Turno(String nombreTurno, LocalTime horaEntrada, String rol) {
        this.nombreTurno = nombreTurno;
        this.horaEntrada = horaEntrada;
        this.tolerancia = 0; // por defecto
        this.rol = rol;
    }

    //  Método para validar si llega a tiempo
    public boolean aTiempo(LocalTime horaLlegada) {
        LocalTime limite = horaEntrada.plusMinutes(tolerancia);
        return !horaLlegada.isAfter(limite);
    }
    //metodos get
    
    public String getNombreTurno() {
        return nombreTurno;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public int getTolerancia() {
        return tolerancia;
    }

    public String getRol() {
        return rol;
    }
    
    //metodos set
    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
       
    //metodo para mostrar informacion
    public String Mostrar_informacion() {
        String informacion="Turno{" +
                "nombreTurno='" + nombreTurno + '\'' +
                ", horaEntrada=" + horaEntrada +
                ", tolerancia=" + tolerancia + " min" +
                ", rol=" + rol +
                '}';
        return informacion;
    }
}
