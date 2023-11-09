package exercicios0811;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.print("numero1: ");
		n1 = sc.nextFloat();
		System.out.print("numero2: ");
		n2 = sc.nextFloat();
		System.out.print("numero3: ");
		n3 = sc.nextFloat();
		System.out.print("numero4: ");
		n4 = sc.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Diferenca: %.2f", diferenca);
		
		sc.close();
		
		
		
	}

}
