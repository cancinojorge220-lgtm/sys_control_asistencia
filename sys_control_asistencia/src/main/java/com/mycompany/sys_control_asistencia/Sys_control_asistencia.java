package com.mycompany.sys_control_asistencia;
import GUI.Login;
import GUI.MainFrame;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sys_control_asistencia {

    public static void main(String[] args) {
        
        MainFrame main=new MainFrame();
        main.setVisible(true);
        
        ArrayList<Empleado> lista = new ArrayList<>();
        
        //Creación de Turnos y Roles
        Turno tAdmin = new Turno("Administrativo", LocalTime.of(8, 0), 10, "ADMIN");
        Turno tOperativo = new Turno("Operativo", LocalTime.of(7, 30), 5, "EMPLEADO");
        Turno tTarde = new Turno("Tarde Estricto", LocalTime.of(14, 0), "EMPLEADO");

        //System.out.println(t1);       
        System.out.println("=== CONFIGURACIÓN DE TURNOS ===");
        System.out.println(tAdmin);
        System.out.println(tOperativo);
        System.out.println(tTarde);
        
        //Creacion de Empleados
        Empleado e1 = new Empleado("70610050", "ABAL SANCHEZ RAFAEL JOHNY", "Gerente", "ADMIN", tAdmin,true);
        Empleado e2 = new Empleado("44568900", "CANCINO CHUQUITUCTO JORGE RODRIGO", "Gerente", "ADMIN", tOperativo,true);
        Empleado e3 = new Empleado("06458056", "LEYVA ALTAMIRANO ALVARO JOEL", "Gerente", "ADMIN", tOperativo, true);
        Empleado e4 = new Empleado("45216820", "MARTOS SANCHEZ LENIN DAVID", "Gerente", "ADMIN", tOperativo, true);
        Empleado e5 = new Empleado("73900208", "VERA MEDINA LUIS JOAQUIN ANTONIO", "Gerente", "ADMIN", tTarde,true);
        
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);
        
        //Mostrar la lista
        System.out.println("\n=== REGISTRO DE EMPLEADOS ===");
        for (Empleado emp : lista) {
            System.out.println(emp);
        }       
        
    }
}
