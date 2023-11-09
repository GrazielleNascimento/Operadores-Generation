package exercicios0811;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, abono, novoSalario ;
		
		System.out.print("Salário: ");
		salario = sc.nextDouble();
		
	
		System.out.print("Abono: ");
		abono = sc.nextDouble();
		
	
		novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: %.2f" , novoSalario);
		
		sc.close();
	}

}
