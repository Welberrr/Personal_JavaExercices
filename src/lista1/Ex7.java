package lista1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		System.out.println("Write a Java program that takes a number as input and prints its multiplication table up to 10.");
		System.out.println();

		int nmr, M;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número: ");
		nmr = sc.nextInt();
		
		for (int n=11, i=1; i<n; i++) {
			M = nmr * i;
			System.out.println(nmr + " x " + i + " = " + M);
		}
		
		sc.close();
	}

}
