package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String operacao = "";
		int opcao = 0;

		do {
			System.out.println("Menu Calculadora");
			System.out.println("1. Somar");
			System.out.println("2. Subtrair");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("9. Sair");

			System.out.print("Opção: ");

			opcao = sc.nextInt();

			if (opcao == 1) {
				operacao = "Soma";
				System.out.println("Digite o primeiro número: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo número: ");
				float y = sc.nextFloat();
				float z = x + y;
				System.out.printf("A %s de %.2f por %.2f é igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 2) {
				operacao = "Subtração";
				System.out.println("Digite o primeiro número: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo número: ");
				float y = sc.nextFloat();
				float z = x - y;
				System.out.printf("A %s de %.2f por %.2f é igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 3) {
				operacao = "Multiplicação";
				System.out.println("Digite o primeiro número: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo número: ");
				float y = sc.nextFloat();
				float z = x * y;
				System.out.printf("A %s de %.2f por %.2f é igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 4) {
				operacao = "Divisão";
				System.out.println("Digite o primeiro número: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo número: ");
				float y = sc.nextFloat();
				float z = x / y;
				System.out.printf("A %s de %.2f por %.2f é igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 9)
				System.out.println("Calculadora finalizada.");
			else
				System.out.println("Opção inválida! Por favor, digite uma opção correta!");

		} while (opcao != 9);
		sc.close();
	}
}