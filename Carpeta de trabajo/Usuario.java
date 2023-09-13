/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
import java.util.Scanner;


public class Usuario {
    public int pedirNumero(){
        Scanner usu=new Scanner (System.in);
        System.out.println("Por favor, dígite un valor ");
        return usu.nextInt();
    }
}
