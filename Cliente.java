/*Cliente(5) - 
thread 
saldo inicial de 1.000
realizar compras(métodos) - 100 ou 200 - até zerar (alternar lojas)
//
realizar compras na loja 1 e loja 2
*/
package AT2_N1;

public class Cliente{
	private String nome;
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
	
	//métodos - realizar compras loja1 e 2
	
	
}
