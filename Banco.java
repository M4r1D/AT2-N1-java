/*
Banco(1) - 
transações de forma síncrona 
//*/

package AT2_N1;

public class Banco {
	//atributos
	String nome;
	int num_agencia;
	String contas;
	String endereco;
	
	// construtores
	public Banco() {
		
	}
	public Banco(String nome) {
		this.nome=nome;
	}
	public Banco(String nome, int num_agencia) {
		this.nome = nome;
		this.num_agencia = num_agencia;
	}
	public Banco(String nome, int num_agencia, String contas) {
		this.nome = nome;
		this.num_agencia = num_agencia;
		this.contas= contas;
	}
	public Banco(String nome, int num_agencia, String contas, String endereco) {
		this.nome = nome;
		this.num_agencia = num_agencia;
		this.contas= contas;
		this.endereco = endereco;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public int getNum_agencia() {
		return num_agencia;
	}
	public String getContas() {
		return contas;
	}
	public String getEndereco() {
		return endereco;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setNum_agenci(int num_agencia) {
		this.num_agencia=num_agencia;
	}
	public void setContas(String contas) {
		this.contas=contas;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	//synchronyze --> transações de forma síncrona
	
	
	
	
	
	
}
