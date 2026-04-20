package com.mycompany.sys_control_asistencia;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sys_control_asistencia {

    public static void main(String[] args) {
        //Manejo de Colecciones
        ArrayList<Empleado> lista = new ArrayList<>();
        
        try {
            Empleado e1 = new Empleado("77889900", "Ana Torres", "Gerente", "ADMIN",true);
            lista.add(e1);
            System.out.println("*Insertado: " + e1.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("*Error en e1: " + e.getMessage());
        }
        
        System.out.println("------------------------------------------------");
         // Turno administrativo (oficina)
        Turno adminManiana = new Turno("Administrativo Maniana",LocalTime.of(8, 0), 10, "ADMIN");

        // Turno de operarios (taller)
        Turno operarioManiana = new Turno("Operario Maniana",LocalTime.of(7, 30), 5, "EMPLEADO");

        // Turno tarde sin tolerancia
        Turno empleadoTarde = new Turno("Turno Tarde",LocalTime.of(14, 0), "EMPLEADO");
         // Mostrar informacion
        System.out.println(adminManiana.Mostrar_informacion());
        System.out.println("------------------------------------------------");
        System.out.println(operarioManiana.Mostrar_informacion());
        System.out.println("------------------------------------------------");
        System.out.println(empleadoTarde.Mostrar_informacion());
        System.out.println("------------------------------------------------");
    }
}
