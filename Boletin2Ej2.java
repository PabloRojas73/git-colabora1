package Boletin2;

import java.util.Scanner;

public class Boletin2Ej2 {
	public static void main(String[] args) 
	{
		var sc=new Scanner(System.in);
		
	
		System.out.println("Introduce numero 1: ");
		int i1=sc.nextInt();
		System.out.println("Introduce numero 2: ");
		int i2=sc.nextInt();
		int i=i1 + i2;
		System.out.println (i);
		
		
		System.out.println("Introduce numero 1: ");
		
		float f1 = sc.nextInt();
		System.out.println("Introduce numero 2: ");
		float f2 = sc.nextInt();
		float f = f1 - f2;
		System.out.println (f);		
		
		
		System.out.println("Introduce numero 1: ");
		int r1=sc.nextInt();
		System.out.println("Introduce numero 2: ");
		int r2=sc.nextInt();
		int r=r1 * r2;
		System.out.println (r);	
		
		System.out.print("Introduce numero 1:");
		int d1=sc.nextInt();
		System.out.print("Introduce numero 2:");
		int d2=sc.nextInt();
		int d=d1 / r2;
		System.out.println (d);	
}
		

}
