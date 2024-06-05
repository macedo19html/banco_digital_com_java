package banco_digital_com_java;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public ContaCorrente() {
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}
