package Atividade1;

import Atividade1.Conta;

public class ContaEspecial extends Conta {
	private double Credito;
	
	public ContaEspecial(String cpf, String numConta, String numAgencia, double saldo, double credito) {
		super(cpf, numConta, numAgencia, saldo);
		Credito = credito;
	}
	
	public double getSaldoDisponivel() {
		return super.getSaldo()+this.Credito;
	}

	public double getCredito() {
		return Credito;
	}

	public void setCredito(double novocredito) {
		Credito = novocredito;
	}
	
}
