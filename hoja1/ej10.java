package hoja1;

import java.util.Scanner;

public class ej10 {
	
	public static Scanner read;
	
	public static void main(String[] args) {
		read = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = read.nextInt();
		
		if(num>100) {
			System.out.println("El numero si es mayor a 100");
		}
		else {
			System.out.println("El numero no es mayor a 100");
		}
	}
//	Que pida un número y diga si es mayor de 100. 
}
