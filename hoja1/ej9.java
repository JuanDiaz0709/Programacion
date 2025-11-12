package hoja1;

import java.util.Scanner;

public class ej9 {
	
	public static Scanner read;
	
	public static void main(String[] args) {
		
		read = new Scanner(System.in);
		
		System.out.println("Introduce le caracter 'S' o el caracter 'N': ");
		char letra = read.next().charAt(0);
		
		if((letra == 'S') || (letra == 's') || (letra == 'N') || (letra == 'n')) {
			System.out.println("Valor correcto");
		}
		else {
			System.out.println("Valor incorrecto");
		}
	}
//	Que sólo permita introducir los caracteres S y N.
}
