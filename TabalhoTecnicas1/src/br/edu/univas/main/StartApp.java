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

			System.out.print("Op��o: ");

			opcao = sc.nextInt();

			if (opcao == 1) {
				operacao = "Soma";
				System.out.println("Digite o primeiro n�mero: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				float y = sc.nextFloat();
				float z = x + y;
				System.out.printf("A %s de %.2f por %.2f � igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 2) {
				operacao = "Subtra��o";
				System.out.println("Digite o primeiro n�mero: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				float y = sc.nextFloat();
				float z = x - y;
				System.out.printf("A %s de %.2f por %.2f � igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 3) {
				operacao = "Multiplica��o";
				System.out.println("Digite o primeiro n�mero: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				float y = sc.nextFloat();
				float z = x * y;
				System.out.printf("A %s de %.2f por %.2f � igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 4) {
				operacao = "Divis�o";
				System.out.println("Digite o primeiro n�mero: ");
				float x = sc.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				float y = sc.nextFloat();
				float z = x / y;
				System.out.printf("A %s de %.2f por %.2f � igual a: %.2f\n\n", operacao, x, y, z);
			} else if (opcao == 9)
				System.out.println("Calculadora finalizada.");
			else
				System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");

		} while (opcao != 9);
		sc.close();
	}
}