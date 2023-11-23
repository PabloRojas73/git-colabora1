package Boletin2;

import java.util.Scanner;

public class Boletin2Ej3 {
	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce tu Nombre completo: ");
		String nombre = sc.nextLine();
		System.out.println("Nombre completo:" + nombre);
				
		System.out.println("Introduce tu edad ");
		int edad = sc.nextInt();
		System.out.println("Edad el año siguiente: " + ++edad);
		
	}
		
}
