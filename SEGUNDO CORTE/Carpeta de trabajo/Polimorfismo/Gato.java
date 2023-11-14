package javaapplication32;

public class Gato extends Animal{
    
    @Override
    public void dormir (){
        System.out.println("Duermo acostado");
    }
    
    @Override
    public void comunicarse (){
        System.out.println("miau miau");
    }
    
    public void comer(){
        System.out.println("Me gusta el pollito");
    }
}
