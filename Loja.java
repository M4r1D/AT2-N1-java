/*Loja(2) - 
possuir uma conta - recebe pagamentos
pagar funcionário assim que possuir o salario(1.400)
//
receber pagamentos 
pagar funcionários*/

package AT2_N1;

public class Loja{
	private String nome_l;
	private float valor;
	private int caixa;
	private Conta conta_l;
	
	//construtor
	public Loja() {
		
	}
	public Loja(String nome_l) {
		this.nome_l=nome_l;
	}
	public Loja(String nome_l, float valor) {
		this.nome_l=nome_l;
		this.valor=valor;
	}
	public Loja(String nome_l, float valor, int caixa) {
		this.nome_l=nome_l;
		this.caixa=caixa;
	}
	public Loja(String nome_l,float valor, int caixa, Conta conta_l) {
		this.nome_l=nome_l;
		this.caixa=caixa;
		this.conta_l=conta_l;
	}
	
	// get e set
	public String getNome_l() {
		return nome_l;
	}
	public float getValor() {
		return valor;
	}
	public int getCaixa() {
		return caixa;
	}
	public Conta getConta_l() {
		return conta_l;
	}
	public void setNome_l(String nome_l) {
		this.nome_l= nome_l;
	}
	public void setValor(float valor) {
		this.valor=valor;
	}
	public void setCaixa(int caixa) {
		this.caixa=caixa;
	}
	public void setConta_l(Conta conta_l) {
		this.conta_l=conta_l;
	}
	
	//metodo - receber pagamento - pagar funcionario
	void Receber() {
		int count = 5;
		int i =0;
		while(i<count) {
			if(caixa<1000) {this.caixa += 200;
			}
			else {
				break;
			}
	   }
		System.out.println("Saldo caixa:"+ this.caixa);
	
	}
}
