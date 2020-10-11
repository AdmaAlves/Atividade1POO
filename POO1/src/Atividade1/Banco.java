package Atividade1;
import java.util.ArrayList;
import java.util.List;

public class Banco implements SistemaBanco {
	private String Nome;
	private String Cnpj;
	private List<Conta> Contas;
	
	public Banco(String nome, String cnpj, List<Conta> contas) {
		this.Nome = nome;
		this.Cnpj = cnpj;
		this.Contas = contas;
	}
	
	public double consultarSaldoDeConta(String numConta, String numAgencia) {
		double saldo = 0.0;
		for (Conta c: this.Contas) {
			if(c.getNumConta().equals(numConta) && c.getNumAgencia().equals(numAgencia)) {
					saldo = c.getSaldo();
			}
		}
		return saldo;
	}

	public void abrirContaSimples(Conta novaContaSimples){
		this.Contas.add(novaContaSimples);
	}
	
	public void abrirContaEspecial(Conta novaContaEspecial) {
		this.Contas.add(novaContaEspecial);
	}
	
	public List<Conta> pesquisarContasDoCliente(String cpf){
		List<Conta> contasDoCliente = new ArrayList<Conta>();
		for (Conta a: this.Contas) {
			if (a.getCpf().equals(cpf)) {
				contasDoCliente.add(a);
			}	
		}
		return contasDoCliente;
 		
	}
	
	public boolean DepositarEmConta(String numConta, String numAgencia, double valor) {
		for (Conta a: this.Contas) {
			if (a.getNumConta().equals(numConta) && a.getNumAgencia().equals(numAgencia)) {
				a.creditar(valor);
				return true;
			}
		}
		return false;
	}
	
	public boolean SacarEmConta(String numConta, String numAgencia, double valor) {
		for (Conta a: this.Contas) {
			if (a.getNumConta().equals(numConta) && a.getNumAgencia().equals(numAgencia)) {
				a.debitar(valor);
				return true;
			} 
		}
		return false;
	}

	public String toString() {
		return "Banco: " + Nome + "\n CNPJ: " + this.Cnpj + "\n Contas: " + Contas;
	}
	
	public double consultarSaldoDaConta(String numConta, String numAgencia) {
		double result = 0.0;
		for (Conta a: this.Contas) {
			if (a.getNumConta().equals(numConta) && a.getNumAgencia().equals(numAgencia)) {
				result = a.getSaldo();
			}
		}
		return result;
	}
	
	public void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor) {
		Conta contaO = null;
		Conta contaD = null;
		for (Conta c: this.Contas) {
			if (c.getNumAgencia().equals(numAgenciaO) && c.getNumConta().equals(numContaO)){
				contaO = c;
			}
			if (c.getNumAgencia().equals(numAgenciaD) && c.getNumConta().equals(numContaD)) {
				contaD = c;
			}			
		}
		if (contaO != null && contaD != null) {
			contaO.debitar(valor);
			contaD.creditar(valor);
		}
		
	}
	
	public List<Conta> pesquisarContasComSaldoNegativo(){
		List<Conta> Negativado = new ArrayList<Conta>();
		for (Conta c: Contas) {
			if(c.getSaldo()< 0.0 ) {
				Negativado.add(c);
			}
		}
		return Negativado;
	}
	
	public double consultarSaldoDisponivelDeConta(String numConta, String numAgencia) {
		double ok = 0.0;
		for (Conta c: Contas) {
			if(c.getNumConta().equals(numConta)&&(c.getNumAgencia().equals(numAgencia))){
				ok = c.getSaldoDisponivel();
			}
		}
		return ok;
	}
}
		

	


