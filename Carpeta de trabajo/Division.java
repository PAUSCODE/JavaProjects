/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Division {
    Usuario objUsuario=new Usuario ();
    
    public int division(){
        return objUsuario.pedirNumero() / objUsuario.pedirNumero();
    }
    
    public void mostrar (int num4){
        System.out.println("La resta es " + num4);
    }

    Division() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}   
