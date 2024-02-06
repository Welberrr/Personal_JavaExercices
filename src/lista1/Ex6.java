package lista1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		System.out.println("Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, S, M, SU, D;
		
		System.out.println("Insira os dois números desejados: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		S = n1 + n2;
		M = n1 * n2;
		SU = n1 - n2;
		D = n1 / n2;
		
		System.out.println(S);
		System.out.println(M);
		System.out.println(SU);
		System.out.println(D);
		
		sc.close();
	}

}
