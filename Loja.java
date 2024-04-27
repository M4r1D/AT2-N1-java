/*Loja(2) - 
possuir uma conta - recebe pagamentos
pagar funcionário assim que possuir o salario(1.400)
//
receber pagamentos 
pagar funcionários*/

package AT2_N1;

public class Loja extends Conta{
	String nome_l;
	String endereco;
	String conta_l;
	//String funcionarios;
	
	//construtor
	public Loja() {
		
	}
	public Loja(String nome_l) {
		this.nome_l=nome_l;
	}
	public Loja(String nome_l, String endereco) {
		this.nome_l=nome_l;
		this.endereco=endereco;
	}
	public Loja(String nome_l, String endereco, String conta_l) {
		this.nome_l=nome_l;
		this.endereco=endereco;
		this.conta_l=conta_l;
	}
	
	// get e set
	public String getNome_l() {
		return nome_l;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getConta_l() {
		return conta_l;
	}
	public void setNome_l(String nome_l) {
		this.nome_l= nome_l;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	public void setConta_l(String conta_l) {
		this.conta_l=conta_l;
	}
	
	//metodo - receber pagamento - pagar funcionario
}
