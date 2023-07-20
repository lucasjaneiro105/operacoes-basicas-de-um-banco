package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Banco;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.println("Bem-vindo ao Banco Exemplo");
		System.out.println();
		System.out.println("Numero da conta: ");
		int conta = sc.nextInt();
		System.out.println("Titular da conta: ");
		String titular = sc.next();
		System.out.println("Tem deposito inicial (y/n)? ");
		char r = sc.next().charAt(0);
		
		if (r == 'y') {
			
			System.out.println("digite o valor do deposito inicial: ");
			double depositoinicial = sc.nextDouble();
			banco = new Banco(conta, titular, depositoinicial);
			
		}
		
		else {
			banco = new Banco(conta, titular);
		}
		
		System.out.println("conta do cliente:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("digite um valor para deposito: ");
		double depositar = sc.nextDouble();
		banco.deposito(depositar);
		System.out.println("Conta Atualizada: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("digite um valor para sacar: ");
		double saque = sc.nextDouble();
		banco.sacar(saque);
		System.out.println("Conta Atualizada: ");
		System.out.println(banco);
		
		
		
		sc.close();

	}

}
