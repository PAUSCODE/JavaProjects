package javaapplication32;

public class Perro extends Animal{
    @Override
    public void dormir (){
        System.out.println("Duermo boca arriba");
    }
    @Override
    public void comunicarse (){
        System.out.println("guau");
    }
    
    @Override
    public void comer(){
        System.out.println("Me gustan los huesos");
    }
}    


