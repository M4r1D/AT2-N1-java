package AT2_N1;

public class Conta{
	private String nome_conta;
	private Banco banco;
	private String conta_o;
	private String conta_d;
	private int saldo;
	
	//construtores
	public Conta() {
		
	}
	public Conta(String nome_conta) {
		this.nome_conta=nome_conta;
	}
	public Conta(String nome_conta,Banco banco) {
		this.nome_conta=nome_conta;
		this.banco=banco;
	}
	public Conta(String nome_conta,Banco banco, int saldo) {
		this.nome_conta=nome_conta;
		this.banco=banco;
		this.saldo=saldo;
	}
	public Conta(String nome_conta,Banco banco, int saldo,String conta_o) {
		this.nome_conta=nome_conta;
		this.banco=banco;
		this.saldo=saldo;
		this.conta_o=conta_o;
	}
	public Conta(String nome_conta,Banco banco, int saldo,String conta_o, String conta_d) {
		this.nome_conta=nome_conta;
		this.banco=banco;
		this.saldo=saldo;
		this.conta_o=conta_o;
		this.conta_d = conta_d;
	}
	
	
	//get e set
	public String getNome_conta() {
		return nome_conta;
	}
	public Banco getBanco() {
		return banco;
	}
	public String getConta_o() {
		return conta_o;
	}
	public String getConta_d() {
		return conta_d;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setNome_conta(String nome_conta) {
		this.nome_conta=nome_conta;
	}
	public void setBanco(Banco banco) {
		this.banco=banco;
	}
	public void setConta_o(String conta_o) {
		this.conta_o=conta_o;
	}
	public void setConta_d(String conta_d) {
		this.conta_d=conta_d;
	}
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	
	//metcodo - syncronize
	public synchronized void transacao(int valor) {
        saldo += valor;
    }

}
