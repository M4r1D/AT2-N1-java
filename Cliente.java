/*Cliente(5) - 
thread 
saldo inicial de 1.000
realizar compras(métodos) - 100 ou 200 - até zerar (alternar lojas)
//
realizar compras na loja 1 e loja 2
*/
package AT2_N1;

public class Cliente extends Thread{
	private String nome;
	private int saldo = 1000;
	private Conta conta;
	
	//construtores
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome=nome;
	}
	public Cliente(String nome,Conta conta) {
		this.nome=nome;
		this.conta=conta;
	}
	public Cliente(String nome,Conta conta,int Saldo) {
		this.nome=nome;
		this.conta=conta;
		this.saldo=saldo;
	}
	
	//get set
	public String getNome(){
		return nome;
	}
	public Conta getNum_conta(){
		return conta;
	}
	public void SetNome(String nome){
		this.nome=nome;
	}
	public void SetNum_conta(Conta conta) {
		this.conta=conta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	//métodos - realizar compras 
	public void run() {
			int count = 5;
			int i = 0;
			while(i < count) {
				if(this.saldo>200) {
					this.saldo -=200;
					i++;
					System.out.println(this.nome + "seu saldo é R$"+ this.saldo);
				}
				else {
					System.out.println("Saldo indisponível!");
					break;
				}
			}
	}
	
	void exibeSaldo() {
		System.out.println(this.nome + "seu saldo é R$"+ this.saldo);
	}
	
}
