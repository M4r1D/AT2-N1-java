/*
Banco(1) - 
transações de forma síncrona 
//*/

package AT2_N1;

public class Banco {
	//atributos
	String nome;
	int num_agencia;
	//String contas;
	
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
		//this.contas= contas;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public int getNum_agencia() {
		return num_agencia;
	}
	/*public String getContas() {
		return contas;
	}*/
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setNum_agenci(int num_agencia) {
		this.num_agencia=num_agencia;
	}
	/*public void setContas(String contas) {
		this.contas=contas;
	}*/	
	//synchronyze --> transações de forma síncron
	
	    public static synchronized void realizarTransferencia(Conta origem, Conta destino, double valor) {
	        if (origem.getSaldo() >= valor)
	            destino.transacao(valor);
	            System.out.println("Transferência de R$" + valor);
	        }
	
}
