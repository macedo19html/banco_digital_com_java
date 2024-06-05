package banco_digital_com_java;

import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	List<Cliente> clientes = new ArrayList<Cliente>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void mostrarClientes() {
		System.out.println(clientes);
	}
}
