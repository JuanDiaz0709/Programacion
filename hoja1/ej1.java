package hoja1;

import java.util.Scanner;

public class ej1 {

	private static Scanner read;
	
	public static void main(String[] args) {
		
		read = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 1-5: ");
		int num = read.nextInt();
		
		if((num>=1) && (num<=5)) {
			if(num==4) {
				System.out.println("El número no es primo");
			}
			else {
				System.out.println("El numero es primo");
			}
		}
		else {
			System.out.println("Has introducido un valor fuera del rango");
		}
	
		
		
// 		Que pida (siempre por teclado) un número del 1 al 5 y diga (que muestre por 
//		pantalla) si es primo o no. 
		
		
	}

}
