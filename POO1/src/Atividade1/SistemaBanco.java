package Atividade1;
import java.util.List;

public interface SistemaBanco {

	public double consultarSaldoDaConta(String numConta, String numAgencia);

	public double consultarSaldoDisponivelDeConta(String numConta, String numAgencia);

	public List<Conta> pesquisarContasDoCliente(String cpfCliente);

	public void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor);

	public void abrirContaSimples(Conta novaContaSimples);
	
	public void abrirContaEspecial(Conta novaContaEspecial);

	public List<Conta> pesquisarContasComSaldoNegativo();
	
	public boolean SacarEmConta(String numConta, String numAgencia, double valor);
	
	public boolean DepositarEmConta(String numConta, String numAgencia, double valor);
	
}
