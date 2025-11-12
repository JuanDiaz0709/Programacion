package UD3;
import java.util.Scanner;

public class Hj0Ej1 {

	private static Scanner read;

	public static void main(String[] args) {
		read = new Scanner(System.in);
		System.out.println("Introduce 2 numeros"); //escribo el mensaje pq el ejercicio indica pedir los numeros
		int numero1 = read.nextInt();
		int numero2 = read.nextInt();
		if (numero1 > numero2)
			System.out.println("El primer número ingresado es mayor");
		else 
			System.out.println("El segundo número es mayor");
	}

}
