package Boletin2;

import java.util.Scanner;

public class Boletin2Ej4 {
	public static void main(String[] args) 
	{
		var sc=new Scanner(System.in);
	
		//pedir año
		System.out.println("Introduce el año actual: ");
		
		float f1 = sc.nextInt();
		System.out.println("Introduce el año de tu nacimiento: ");
		float f2 = sc.nextInt();
		float f = f1 - f2;
		System.out.println (f);		
	}
	
}
