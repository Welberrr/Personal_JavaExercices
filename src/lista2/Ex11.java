package lista2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		System.out.println("Write a Java program to print the area and perimeter of a circle");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o raio do circulo: ");
		double r = sc.nextDouble();
		
		System.out.println("Perimetro: " + (2 * r * Math.PI));
		System.out.println("Area: " + (Math.PI * r * r));
		
		sc.close();
	}
}
