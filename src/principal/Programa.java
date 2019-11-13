package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de números ? :");
		int n = sc.nextInt();
		
		double soma = 0.0;
		for (int i=1; i <= n; i++) {
			System.out.println("número " + i + " : ");
			double x = sc.nextDouble();
			soma += x;
		}
		
		System.out.println("A soma é : " + soma);
		
        sc.close();
	}

}
