/*Loja(2) - 
possuir uma conta - recebe pagamentos
pagar funcionário assim que possuir o salario(1.400)
//
receber pagamentos 
pagar funcionários*/

package AT2_N1;

public class Loja{
	private String nome_l;
	private double caixa;
	private String conta_l;
	private double pagamento;
	String funcionarios;
	
	//construtor
	public Loja() {
		
	}
	public Loja(String nome_l) {
		this.nome_l=nome_l;
	}
	public Loja(String nome_l, double caixa) {
		this.nome_l=nome_l;
		this.caixa=caixa;
	}
	public Loja(String nome_l, double caixa, String conta_l) {
		this.nome_l=nome_l;
		this.caixa=caixa;
		this.conta_l=conta_l;
	}
	public Loja(String nome_l, double caixa, String conta_l,double pagamento) {
		this.nome_l=nome_l;
		this.caixa=caixa;
		this.conta_l=conta_l;
		this.pagamento=pagamento;
	}
	
	// get e set
	public String getNome_l() {
		return nome_l;
	}
	public double getCaixa() {
		return caixa;
	}
	public String getConta_l() {
		return conta_l;
	}
	public double getPagamento() {
		return pagamento;
	}
	public void setNome_l(String nome_l) {
		this.nome_l= nome_l;
	}
	public void setEndereco(double caixa) {
		this.caixa=caixa;
	}
	public void setConta_l(String conta_l) {
		this.conta_l=conta_l;
	}
	public void setPagamento(double pagamento) {
		this.pagamento=pagamento;
	}
	
	
	//metodo - receber pagamento - pagar funcionario
	void Receber() {
		int count = 5;
		int i =0;
		while(i<count) {
			if(caixa<1000) {this.caixa += 200;
			System.out.println("Saldo caixa:"+ this.caixa);
		}
			else {
				break;
			}
	   }
	
	}
	
	void PagarF() {
		if (caixa>1400) {
			
		}
	}
}
