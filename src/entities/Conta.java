package entities;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
		

	public int getNumero() {
		return numero;
	}

	
	public void deposito (double valorDeposito) {
		saldo+=valorDeposito;
		
	}
	
	public void saque (double valorSaque) {
		saldo-=valorSaque;
		
		
  		
	}
	
	public String toString() {
		return "Conta: " 
				+ numero
				+ ", Cliente: "
				+ nome
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
		
	}
	
	
	
	
	
}
