package lista1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		System.out.println("Write a Java program that takes two numbers as input and displays the product of two numbers.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, R;
		
		System.out.println("Insira os dois número desejados: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		R = n1 * n2;
		
		System.out.println(n1 + " x " + n2 + " = " + R);
		
		sc.close();
	}

}
