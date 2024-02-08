package lista2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		System.out.println("Write a Java program to print the area and perimeter of a rectangle");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a altura e a largura do retangulo: ");
		double a = sc.nextDouble();
		double l = sc.nextDouble();
		
		double area = a * l;
		double p = 2 * (a * l);
		
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", a, l, p);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", l, a, area);
		
		sc.close();
	}
}
