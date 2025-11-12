package UD3;

import java.util.Scanner;

public class Hj2Ej16 {

	private static Scanner read;

	public static void main(String[] args) {
		read = new Scanner(System.in);

		int num, i;

		System.out.print("Introduce un número:");

		num = read.nextInt();

		for (i = 0; i < num; i++) {
			System.out.print("*");
		}
	}
}
