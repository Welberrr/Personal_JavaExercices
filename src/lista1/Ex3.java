package lista1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("Write a Java program to divide two numbers and print them on the screen.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, div;
		
		System.out.println("Insira o primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		n2 = sc.nextDouble();
		
		div = n1/ n2;
		
		System.out.println(div);
		
		sc.close();
	}

}
