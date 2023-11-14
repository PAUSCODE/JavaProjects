package javaapplication32;


public class Menu {
    public void menu(){
        Animal objAnimal;
        
        objAnimal = new Gato();
        objAnimal.comunicarse();
        objAnimal.dormir();
        
        objAnimal=new Pez();
        objAnimal.dormir();
        objAnimal.comunicarse();
        
        objAnimal=new Perro();
        objAnimal.dormir();
        objAnimal.comunicarse();
    }
}
