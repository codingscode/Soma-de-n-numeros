package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de n�meros ? :");
		int n = sc.nextInt();
		
		double soma = 0.0;
		for (int i=1; i <= n; i++) {
			System.out.println("n�mero " + i + " : ");
			double x = sc.nextDouble();
			soma += x;
		}
		
		System.out.println("A soma � : " + soma);
		
        sc.close();
	}

}
