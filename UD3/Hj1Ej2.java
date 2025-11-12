package UD3;
import java.util.Scanner;

public class Hj1Ej2 {
	
	private static Scanner read;
	
	public static void main(String[] args) {
		int resultado;
		read = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = read.nextInt();
		resultado = numero % 2;
		if (resultado == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
	}

}
