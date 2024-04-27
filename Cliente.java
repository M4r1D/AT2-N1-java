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
	private Conta conta;
	private float saldo = 1000;
	
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
	public Cliente(String nome,Conta conta, float saldo) {
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

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	//métodos - realizar compras 

	public void run(Loja[] loja1) {
		for(Loja loja: loja1) {
			while (saldo>0) {
				double valor = Math.random() < 0.5 ? 100 : 200;
				Comprar(loja,(int) valor, null);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void Comprar(Loja loja1, int valor, Banco banco){
		if(saldo>=valor) {
			saldo-=valor;
			banco.Transferencia(this, loja1, valor);
			System.out.println("Cliente"+nome+"realizou compra:"+ valor);
		} else {
			System.out.println("Saldo insuficiente!!!");
		}
		
	}
	
	void exibeSaldo() {
		System.out.println(this.nome + "seu saldo é R$"+ this.saldo);
	}
	
	
}
