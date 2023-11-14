package javaapplication32;

public class Pez extends Animal{
    @Override
    public void dormir (){
        System.out.println("Duermo flotando");
    }
    @Override
    public void comunicarse (){
        System.out.println("glu gluu");
    }
    
    @Override
    public void comer(){
        System.out.println("Me gusta el agua");
    }
}    

