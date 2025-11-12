package hoja1;

import java.util.Scanner;

public class ej15 {
	
	public static Scanner read;
	
	public static void main(String[] args) {
		read = new Scanner(System.in);
		
		System.out.println("Introduce 3 números: ");
		System.out.println("Introduce un valor: ");
		int num1 = read.nextInt();
		System.out.println("Introduce un valor: ");
		int num2 = read.nextInt();
		System.out.println("Introduce un valor: ");
		int num3 = read.nextInt();
		
		if((num1+num2==num3)) {
			System.out.println("El 3er valor es igual a la suma de los 2 valores anteriores");
		}
		else {
			System.out.println("El 3er valor no es igual a la suma de los 2 anterios");
		}
	}
//	Que pida tres números e indicar si el tercero es igual a la suma del primero y el 
//	segundo. 
}
