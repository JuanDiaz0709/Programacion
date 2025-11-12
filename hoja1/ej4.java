package hoja1;

import java.util.Scanner;

public class ej4 {

	private static Scanner read;
	
	public static void main(String[] args) {
		
		read = new Scanner(System.in);
		System.out.println("Introduce un número entre 1-12 para devolverte el mes del año que le corresponde: ");
		int num = read.nextInt();
		
		if(num==1) {
			System.out.println("El "+num+" correponde al mes Enero");
		}
		else if(num==2) {
			System.out.println("El "+num+" correponde al mes Febrero");
		}
		else if(num==3) {
			System.out.println("El "+num+" correponde al mes Marzo");
		}
		else if(num==4) {
			System.out.println("El "+num+" correponde al mes Abril");
		}
		else if(num==5) {
			System.out.println("El "+num+" correponde al mes Mayo");
		}
		else if(num==6) {
			System.out.println("El "+num+" correponde al mes Junio");
		}
		else if(num==7) {
			System.out.println("El "+num+" correponde al mes Julio");
		}
		else if(num==8) {
			System.out.println("El "+num+" correponde al mes Agosto");
		}
		else if(num==9) {
			System.out.println("El "+num+" correponde al mes Septiembre");
		}
		else if(num==10) {
			System.out.println("El "+num+" correponde al mes Octubre");
		}
		else if(num==11) {
			System.out.println("El "+num+" correponde al mes Noviembre");
		}
		else if(num==12) {
			System.out.println("El "+num+" correponde al mes Diciembre");
		}
		else {
			System.out.println("Valor invalido tiene que estar en el rango de 1-12");
		}
//		Que pida un número del 1 al 12 y diga el nombre del mes correspondiente.
	}

}
