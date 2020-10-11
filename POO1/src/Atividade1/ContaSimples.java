package Atividade1;

import Atividade1.Conta;

public class ContaSimples extends Conta{

	public ContaSimples(String cpf, String numConta, String numAgencia, double saldo) {
		super(cpf, numConta, numAgencia, saldo);
	}

	public double getSaldoDisponivel() {
		return super.getSaldo();
	}
	

}
