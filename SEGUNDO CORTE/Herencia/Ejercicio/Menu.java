package ejemplo;

import java.util.Scanner;

public class Menu {
	VEsfera objVEs;
	
	public Menu(){
	objVEs=new VEsfera();
	}
	
	public void menu (){
		Scanner s=new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1. Area Circulo");
		System.out.println("2. Volumen Esfera");
		System.out.println("3. Volumen Cilindro");
		System.out.println("Cualquier numero salir");
		int opcion=s.nextInt();
		if (opcion == 1){
			objVEs.mostrar(objVEs.calcularAreaC(), "El area del circulo es ");
		} else{
			if (opcion ==2){
				objVEs.mostrar(objVEs.cvesf(), "El volumen de la esfera es ");
			}else{
			if (opcion ==3){
				objVCil.mostrar(objVCil.calcularVCil(), "El volumen de la esfera es ");
			}else{
				System.out.println("Gracias por usar el software");
			}
		} 
			
			
	
	
	}	
	
}
