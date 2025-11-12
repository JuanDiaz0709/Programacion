package hoja1;

import java.util.Scanner;

public class ej2 {

	private static Scanner read;
	
	public static void main(String[] args) {
		
		read = new Scanner(System.in);
		
		System.out.println("Introduce un número para saber si es par o impar: ");
		int num  = read.nextInt();
		
		if(num%2==0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
		
//		Que pida un número y diga si es par o impar.
	}

}
