package hoja1;

import java.util.Scanner;

public class ej3 {

	private static Scanner read;
	
	public static void main(String[] args) {
		
		read = new Scanner(System.in);
		System.out.println("Introduce un número entre 1-7 para devolverte el dia de la semana que le corresponde: ");
		int num = read.nextInt();
		
		if(num==1) {
			System.out.println("El "+num+" correponde al dia Lunes");
		}
		else if(num==2) {
			System.out.println("El "+num+" correponde al dia Martes");
		}
		else if(num==3) {
			System.out.println("El "+num+" correponde al dia Miercoles");
		}
		else if(num==4) {
			System.out.println("El "+num+" correponde al dia Jueves");
		}
		else if(num==5) {
			System.out.println("El "+num+" correponde al dia Viernes");
		}
		else if(num==6) {
			System.out.println("El "+num+" correponde al dia Sabado");
		}
		else if(num==7) {
			System.out.println("El "+num+" correponde al dia Domingo");
		}
		else {
			System.out.println("Valor invalido tiene que estar en el rango de 1-7");
		}
//		Que pida un número del 1 al 7 y diga el día de la semana correspondiente.
	}

}
