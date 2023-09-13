/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Suma {
    Usuario objUsuario=new Usuario ();
    
    public int sumar(){
        return objUsuario.pedirNumero()+ objUsuario.pedirNumero();
    }
    
    public void mostrar (int num){
        System.out.println("La suma es " + num);
    }
}
