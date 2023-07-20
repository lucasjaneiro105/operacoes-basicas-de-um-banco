package entidades;

public class Banco {
	
	
	private int conta;
	private String titular;
	private double equilibrio;
	
	public Banco(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public Banco(int conta, String titular, double saldoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(saldoInicial);
	}

	public int getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getEquilibrio() {
		return equilibrio;
	}

	public void deposito(double depositar) {
		equilibrio += depositar;
	}
	
	public void sacar(double saque) {
		equilibrio -= saque + 5.0;
	}
	
	
	public String toString() {
		return "Conta: " + conta + ", titular: " + titular + ", saldo: " + equilibrio; 
	}
	

}
