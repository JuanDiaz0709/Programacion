package hoja1;

import java.util.Scanner;

public class ej5 {
	
	private static Scanner read;
	
	public static void main(String[] args) {
		read = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Introduce 3 números para obtener el orden creciente");
		System.out.println("Introduce el primer número: ");
		num1 = read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = read.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3 = read.nextInt();
		
		if((num1<num2) && (num2<num3)){
			System.out.println("Orden: "+num1+" , "+num2+" , "+num3);
		}
		else if((num1<num3) && (num3<num2)){
			System.out.println("Orden: "+num1+" , "+num3+" , "+num2);
		}
		else if((num2<num1) && (num1<num3)){
			System.out.println("Orden: "+num2+" , "+num1+" , "+num3);
		}
		else if((num2<num3) && (num3<num1)){
			System.out.println("Orden: "+num2+" , "+num3+" , "+num1);
		}
		else if((num3<num2) && (num2<num1)){
			System.out.println("Orden: "+num3+", "+num2+", "+num1);
		}
		else if((num3<num1) && (num1<num2)){
			System.out.println("Orden: "+num3+", "+num1+", "+num2);
		}	
//		Que pida 3 números y los muestre en pantalla de menor a mayor.
	}

}
