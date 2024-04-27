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
	private double saldo;
	private String num_conta;
	
	//construtores
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome=nome;
	}
	public Cliente(String nome,String num_conta) {
		this.nome=nome;
		this.num_conta=num_conta;
	}
	public Cliente(String nome,String num_conta,double saldo) {
		this.nome=nome;
		this.num_conta=num_conta;
		this.saldo=saldo;
	}
	
	//get set
	public String getNome(){
		return nome;
	}
	public String getNum_conta(){
		return num_conta;
	}
	public void SetNome(String nome){
		this.nome=nome;
	}
	public void SetNum_conta(String num_conta) {
		this.num_conta=num_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//métodos - realizar compras loja1  
	void exibeSaldo() {
		System.out.println(this.nome + "seu saldo é R$"+ this.saldo);
	}
	
	void Compras() {
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
	
}
