package UD3;
//import java.util.Scanner;
public class Hj1Ej11 {
	
	//private static Scanner read;
	
	public static void main(String[] args) {
		System.out.println("Introduce un caracter");
		char letra = 'I';
		//read = new Scanner(System.in);
		//char letra = read.next().charAt(0);
		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u') || (letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U'))
			System.out.println("La letra es una vocal");
		else
			System.out.println("La letra es una consonante");
	}

}
