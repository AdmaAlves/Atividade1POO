package Atividade1;

import Atividade1.Conta;

public abstract class Conta {

	private String Cpf;
	private String NumAgencia;
	private String NumConta;
	private double Saldo;
	
	public Conta() {
		this("","","",0.0);
	}

	public Conta(String cpf, String numAgencia, String numConta, double saldo){
		Cpf = cpf;
		NumAgencia = numAgencia;
		NumConta = numConta;
		Saldo = saldo;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getNumAgencia() {
		return NumAgencia;
	}

	public void setNumAgencia(String novoNumAgencia) {
		NumAgencia = novoNumAgencia;
	}

	public String getNumConta() {
		return NumConta;
	}

	public void setNumConta(String novoNumConta) {
		NumConta = novoNumConta;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public double debitar(double valor) {
		this.Saldo = Saldo - valor;
		return Saldo;
	}
	public double creditar(double valor) {
		this.Saldo = Saldo + valor;
		return Saldo;
	}
	
	public abstract double getSaldoDisponivel();

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cpf == null) ? 0 : Cpf.hashCode());
		result = prime * result + ((NumAgencia == null) ? 0 : NumAgencia.hashCode());
		result = prime * result + ((NumConta == null) ? 0 : NumConta.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Cpf == null) {
			if (other.Cpf != null)
				return false;
		} else if (!Cpf.equals(other.Cpf))
			return false;
		if (NumAgencia == null) {
			if (other.NumAgencia != null)
				return false;
		} else if (!NumAgencia.equals(other.NumAgencia))
			return false;
		if (NumConta == null) {
			if (other.NumConta != null)
				return false;
		} else if (!NumConta.equals(other.NumConta))
			return false;
		if (Double.doubleToLongBits(Saldo) != Double.doubleToLongBits(other.Saldo))
			return false;
		return true;
	}
	
	
}
