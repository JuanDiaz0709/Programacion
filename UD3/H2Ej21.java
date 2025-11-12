package UD3;

import sun.awt.dnd.SunDragSourceContextPeer;

public class H2Ej21 {

	public static void main(String[] args) {
		//Ustina Nicole Untaru Ustuca
		
		//21. Que calcule el factorial de un número cualquiera y lo muestre en pantalla. 
		
		//Habilitamos la lectura de datos por consola.
		Scanner entrada=new Scanner(System.in);
		
		//ZDV
		int cont=1, fact=1, num;
		
		//Mostrar.
		System.out.println("Introduzac un número para calcular su factorial:");
		
		//Leer número.
		num=entrada.nextInt();
		
		//Bucle while.
		while (cont <= num) {
			fact = fact * cont;
			cont++;
		}
		
		//Mostrar resultado.
		System.out.println("El factorial de " + num + " es = !" + fact);
	}

}
