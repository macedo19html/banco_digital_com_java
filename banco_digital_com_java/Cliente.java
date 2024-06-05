package banco_digital_com_java;

public class Cliente {
	
	public Banco banco;
	public String nome;
	public String endereco;
	public String email;
	public String telefone;
	
	
	
	
	public Cliente(Banco banco, String nome) {
		this.banco = banco;
		this.nome = nome;
		this.banco.clientes.add(this);
	}


	public Cliente( String nome, String endereco, String email, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
		this.banco.clientes.add(this);
	}
	
	public String toString() {
		return "Cliente {" + "banco=" + banco.getNome() + ", nome='" + this.getNome() + '}';
	}
}
