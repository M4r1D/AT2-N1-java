/*
Banco(1) - 
transações de forma síncrona 
//*/

package AT2_N1;

public class Banco {
	//atributos
	private String nome;
	private int num_agencia;
	private int transacoes;
	
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
	}
	public Banco(String nome, int num_agencia, String contas, int transacoes) {
		this.nome = nome;
		this.num_agencia = num_agencia;
		this.transacoes=transacoes;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public int getNum_agencia() {
		return num_agencia;
	}
	public int getTransacoes() {
		return transacoes;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setNum_agenci(int num_agencia) {
		this.num_agencia=num_agencia;
	}
	public void setTransacoes(int transacoes) {
		this.transacoes=transacoes;
	}
	
	//synchronyze --> transações de forma síncron
	
	    public synchronized void Transferencia(Conta conta_o, Conta conta_d, int saldo, double valor){
	        if (conta_o.getSaldo() >= valor) {
	        	conta_o.setSaldo((int) (conta_d.getSaldo()+valor));
	        }
	        System.out.println("Transferência de R$:" + valor);
	    }
		public void Transferencia(Cliente cliente, Loja loja1, int valor) {
			// TODO Auto-generated method stub
			
		}
	
}
