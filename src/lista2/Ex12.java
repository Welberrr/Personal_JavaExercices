package lista2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		System.out.println(" Write a Java program that takes three numbers as input to calculate and print the average of the numbers.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os três números desejados: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int m = (n1 + n2 + n3) / 3;
		
		System.out.println();
		System.out.println(m);
		
		sc.close();
	}

}
