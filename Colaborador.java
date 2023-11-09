package exercicios0811;

import java.util.Locale;
import java.util.Scanner;

public class Colaborador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário Bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.print("Descontos: ");
		descontos = sc.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salário Líquido: %.2f",  salarioLiquido);
		
		sc.close();
	}

}
