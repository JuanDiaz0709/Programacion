package UD3;

import java.util.Scanner;

public class Hj2Ej21 {

	private static Scanner read;
	
	public static void main(String[] args) {
		read = new Scanner(System.in);
		
		int cont=1, fact=1, num;
		
		System.out.println("Introduzac un número para calcular su factorial:");
		num = read.nextInt();
		
		while (cont <= num) {
			fact = fact * cont;
			cont++;
		}
		System.out.println("El factorial de " + num + " es = " + fact);
	}

}
