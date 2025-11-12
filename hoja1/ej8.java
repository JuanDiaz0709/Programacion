package hoja1;

import java.util.Scanner;

public class ej8 {
	
	public static Scanner read;

	public static void main(String[] args) {
		
		read=new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num = read.nextInt();
		
		if(num<0) {
			System.out.println("El numero "+num+" es negativo");
		}
		else if(num>0) {
			System.out.println("El numero "+num+" es positvo");
		}
	}
//	Que pida un número y diga si es positivo o negativo.
}
