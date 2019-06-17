
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String nome =sc.nextLine();
		
		System.out.print("O cliente irá fazer depósito inicial? s/n: ");
		char resposta=sc.next().charAt(0);
		
		if (resposta =='s') {
			System.out.printf("Digite o valor inicial: ");
			double depositoInicial=sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
				
		}else {
			
			conta= new Conta(numero, nome);
					
		}
		System.out.println();
		System.out.println(conta);
		System.out.println("Dados da conta");
		System.out.printf("Digite o valor a ser depositado ");
		double valorDeposito = sc.nextDouble();
		
		conta.deposito(valorDeposito);
			
		System.out.println("Dados Atualizados:" );
		System.out.println(conta);
		
		System.out.println("Digte o valor para Saque: ");
		double valorSaque = sc.nextDouble();
		
		conta.saque(valorSaque);
		
		System.out.println("Dados Atualizados:" );
		System.out.println(conta);
		
		
		
		sc.close();
	}
}