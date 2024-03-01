package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual numero deseja fatorar ? ");
		int number = sc.nextInt();
		int x = number;
		int f = 1;
		while(x > 1) {
			f *= x;
			x--;
			System.out.println("O fatorial é " + number + "x" + x);
		}
		System.out.println("O fatorial do numero " + number + " é de: " + f);
		
		
		
		sc.close();
	}

}
