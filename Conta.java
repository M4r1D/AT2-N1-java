package AT2_N1;

public class Conta{
	String nome_cli;
	String num_conta;
	String banco;
	float saldo;
	
	//construtores
	public Conta() {
		
	}
	public Conta(String nome) {
		this.nome_cli=nome;
	}
	public Conta(String nome_cli,String num_conta) {
		this.nome_cli=nome_cli;
		this.num_conta=num_conta;
	}
	public Conta(String nome_cli,String num_conta,String banco) {
		this.nome_cli=nome_cli;
		this.num_conta=num_conta;
		this.banco=banco;
	}
	public Conta(String nome_cli,String num_conta,String banco, float saldo) {
		this.nome_cli=nome_cli;
		this.num_conta=num_conta;
		this.banco=banco;
		this.saldo=saldo;
	}
	
	//get e set
	public String getNome() {
		return nome_cli;
	}
	public String getNum_conta() {
		return num_conta;
	}
	public String getBanco() {
		return banco;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setNome_cli(String nome_cli) {
		this.nome_cli=nome_cli;
	}
	public void setNum_conta(String num_conta) {
		this.num_conta=num_conta;
	}
	public void setBanco(String banco) {
		this.banco=banco;
	}
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	
	//metodo - syncronize
	
	
	
	
	
}
