package hoja1;

import java.util.Scanner;

public class ej12 {
	
	public static Scanner read;
	
	public static void main(String[] args) {
		read = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = read.nextInt();
		System.out.println("Introduce un número: ");
		int num2 = read.nextInt();
		System.out.println("Introduce un número: ");
		int num3 = read.nextInt();
		
		if((num1<num2) && (num2<num3)) {
			System.out.println("Se han introducido los números de manera creciente");
		}
		else {
			System.out.println("No se han introducido los numeros de manera creciente");
		}
	}
//	  Que pida tres números y detecte si se han introducido en orden creciente. 
}
