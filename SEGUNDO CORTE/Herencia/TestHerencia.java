package test;

import herencia.*;

import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
        //Crear empleados 
        Employee empleado1 = new Employee("Alex", 3000);
        System.out.println(empleado1);
        Employee empleado2 = new Employee("Reol", 4000);
        System.out.println(empleado2);
        
        Employee empleado3 = new Employee("Juan", 5000);
        System.out.println(empleado3);
        
        //Crear Clientes 
        var fecha = new Date(); //Obtener la fecha de hoy 
        Client cliente1 = new Client(fecha, true, "Suny", 'F', 18,"Santo tomas");
        System.out.println(cliente1);        
    }
}
