package test;

import herencia.*;

import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
        //Crear empleados 
        Employee empleado1 = new Employee("Harry", 3000);
        System.out.println(empleado1);
        Employee empleado2 = new Employee("Mafe", 4000);
        System.out.println(empleado2);
        
        Employee empleado3 = new Employee("Juanito", 5000);
        System.out.println(empleado3);
        
         
    }
}
