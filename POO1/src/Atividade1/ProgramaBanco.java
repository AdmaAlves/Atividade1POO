package Atividade1;
import java.util.ArrayList;

public class ProgramaBanco {
	public static void main (String[]args) {
		
		SistemaBanco meuBanco = new Banco("Original Bank", "444/555", new ArrayList<Conta>());
		
		meuBanco.abrirContaSimples(new ContaSimples("123","222-2","33-3",100.0));
		
		meuBanco.abrirContaEspecial(new ContaEspecial("434454", "333-9", "44-3", 0.0, 300.0));
		
		System.out.println(meuBanco.consultarSaldoDisponivelDeConta("333-9", "44-3"));
		
		meuBanco.abrirContaEspecial(new ContaEspecial("434454-74","444-5","44-3", 0.0, 1000.0));
		
		meuBanco.SacarEmConta("444-5", "44-3", 10.0);
		
		System.out.println(meuBanco.consultarSaldoDisponivelDeConta("444-5", "44-3"));
		
		System.out.println(meuBanco.pesquisarContasDoCliente("434454-74"));
		
	}
	

}
