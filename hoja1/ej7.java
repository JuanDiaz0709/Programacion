package hoja1;

import java.util.Scanner;

public class ej7 {

	private static Scanner read;

	public static void main(String[] args) {

		read = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Introduce 3 números para obtener el orden decreciente");
		System.out.println("Introduce el primer número: ");
		num1 = read.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = read.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3 = read.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} 
		else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
			if ((num1 == num2) && (num2 > num3)) {
				System.out.print(num1 + " " + num2 + "\n" + num3);
			} else if ((num1 == num2) && (num2 < num3)) {
				System.out.println(num3 + "\n" + num1 + " " + num2);
			} else if ((num1 == num3) && (num3 > num2)) {
				System.out.println(num1 + " " + num3 + "\n" + num2);
			} else if ((num1 == num3) && (num3 < num2)) {
				System.out.println(num2 + "\n" + num1 + " " + num3);
			} else if ((num2 == num3) && (num3 > num1)) {
				System.out.println(num2 + " " + num3 + "\n" + num1);
			} else if ((num2 == num3) && (num3 < num1)) {
				System.out.println(num1 + "\n" + num2 + " " + num3);
			}
		}
		else{
			if ((num1 > num2) && (num2 > num3)) {
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			} else if ((num1 > num3) && (num3 > num2)) {
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			} else if ((num2 > num1) && (num1 > num3)) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			} else if ((num2 > num3) && (num3 > num1)) {
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			} else if ((num3 > num2) && (num2 > num1)) {
				System.out.println(num3 + "\n" + num2 + "\n" + num1);
			} else if ((num3 > num1) && (num1 > num2)) {
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}
			}
		}
//		Que pida 3 números y los muestre en pantalla de mayor a menor en líneas 
//		distintas. En caso de haber números iguales se pintan en la misma línea.
	
	
// SOLUCION MAS SENCILLA Y LOGICA

//    System.out.print("Introduce el primer número: ");
//    int a = sc.nextInt();
//    System.out.print("Introduce el segundo número: ");
//    int b = sc.nextInt();
//    System.out.print("Introduce el tercer número: ");
//    int c = sc.nextInt();
//
//    // Determinar el mayor, medio y menor
//    int mayor, medio, menor;
//
//    if (a >= b && a >= c) {
//        mayor = a;
//        if (b >= c) {
//            medio = b;
//            menor = c;
//        } else {
//            medio = c;
//            menor = b;
//        }
//    } else if (b >= a && b >= c) {
//        mayor = b;
//        if (a >= c) {
//            medio = a;
//            menor = c;
//        } else {
//            medio = c;
//            menor = a;
//        }
//    } else {
//        mayor = c;
//        if (a >= b) {
//            medio = a;
//            menor = b;
//        } else {
//            medio = b;
//            menor = a;
//        }
//    }
//
//    // Mostrar resultado con iguales en la misma línea
//    if (mayor == medio && medio == menor) {
//        System.out.println(mayor + " " + medio + " " + menor);
//    } else if (mayor == medio) {
//        System.out.println(mayor + " " + medio);
//        System.out.println(menor);
//    } else if (medio == menor) {
//        System.out.println(mayor);
//        System.out.println(medio + " " + menor);
//    } else {
//        System.out.println(mayor);
//        System.out.println(medio);
//        System.out.println(menor);
//    }
//
//    sc.close();
//}
//}
	}

