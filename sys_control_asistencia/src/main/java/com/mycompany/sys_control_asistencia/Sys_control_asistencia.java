package com.mycompany.sys_control_asistencia;
import java.util.ArrayList;

public class Sys_control_asistencia {

    public static void main(String[] args) {
        //Manejo de Colecciones
        ArrayList<Empleado> lista = new ArrayList<>();
        
        try {
            Empleado e1 = new Empleado("77889900", "Ana Torres", "Gerente", "ADMIN",true);
            lista.add(e1);
            System.out.println("✅ Insertado: " + e1.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error en e1: " + e.getMessage());
        }
    }
}
