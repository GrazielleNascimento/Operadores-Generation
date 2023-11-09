package exercicios0811;

import java.util.Locale;
import java.util.Scanner;

public class Participante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, mediaFinal;
		
		System.out.print("Nota 1: ");
		n1 = sc.nextFloat();
		System.out.print("Nota 2: ");
		n2 = sc.nextFloat();
		System.out.print("Nota 3: ");
		n3 = sc.nextFloat();
		System.out.print("Nota 4: ");
		n4 = sc.nextFloat();
		
		mediaFinal = (n1 + n2 + n3 + n4) / 4;
		System.out.printf("Média final: %.1f", mediaFinal);
		
		sc.close();
	}

}
