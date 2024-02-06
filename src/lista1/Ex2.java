package lista1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		System.out.println("Write a Java program to print the sum of two numbers.\r\n"
				+ "Test Data:");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println(soma);		
		
		sc.close();
	}
}
