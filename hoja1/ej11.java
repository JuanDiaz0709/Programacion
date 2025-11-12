package hoja1;

import java.util.Scanner;

public class ej11 {
	
	public static Scanner read;
	
	public static void main(String[] args) {
		read=new Scanner(System.in);
		
		System.out.println("Introduce una letra: ");
		char letra = read.next().charAt(0);
		
		if((letra=='a') || (letra=='e') || (letra=='i') || (letra=='o') || (letra=='u') || (letra=='A') || (letra=='E') || (letra=='I') || (letra=='O') || (letra=='U')) {
			System.out.println("Es una vocal");
		}
		else {
			System.out.println("No es una vocal");
		}
	}
//	Que pida una letra y detecte si es una vocal.
}
