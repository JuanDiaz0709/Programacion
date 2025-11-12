package UD3;

public class H2Ej16 {

	public static void main(String[] args) {
		//Ustina Nicole Untaru Ustuca
		
		// 16. Que pida un número y muestre en pantalla el mismo número de asteriscos.
		
		//Habilitamos la lectura de datos por consola.
		Scanner entrada=new Scanner(System.in);
		
		//ZDV
		int num, i;
		// Mostrar
		System.out.print("Introduce un número: ");
		
		//Leer número.
		num=entrada.nextInt();

		// Bucle for
		for (int i = 0; i < num; i++) {
			System.out.print("*");  
		}

	}

}
