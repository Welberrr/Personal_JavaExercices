package lista2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		System.out.println("15. Write a Java program to swap two variables");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva os dois números desejados: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("Antes de substituir: a, b = " + n1 + ", " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("Após substituir: a, b = " + n1 + ", " + n2);
		
		sc.close();
	}
}
