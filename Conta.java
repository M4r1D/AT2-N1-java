package AT2_N1;

public class Conta{
	private String num_conta;
	private Banco banco;
	private double saldo;
	
	//construtores
	public Conta() {
		
	}
	public Conta(String num_conta) {
		this.num_conta=num_conta;
	}
	public Conta(String num_conta,Banco banco) {
		this.num_conta=num_conta;
		this.banco=banco;
	}
	public Conta(String num_conta,Banco banco, float saldo) {
		this.num_conta=num_conta;
		this.banco=banco;
		this.saldo=saldo;
	}
	
	//get e set
	public String getNum_conta() {
		return num_conta;
	}
	public Banco getBanco() {
		return banco;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNum_conta(String num_conta) {
		this.num_conta=num_conta;
	}
	public void setBanco(Banco banco) {
		this.banco=banco;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	//metcodo - syncronize
	public synchronized void transacao(double valor) {
        saldo += valor;
    }

}
