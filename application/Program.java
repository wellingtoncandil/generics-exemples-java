/*
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N n�meros
inteiros. Ao final, imprima esses n�meros de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.
 */


package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("Type the quantity of numbers to be read: ");
		int n = sc.nextInt();
		System.out.println("Set the "+n+" values: ");
		
		for(int i=0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: "+ps.first());
		
		sc.close();
	
	}
}
