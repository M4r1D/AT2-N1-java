/*Funcionário(4) - 
thread 
duas contas - salário loja e outra de investimentos
deve investir 20% salário na 2º conta
//
receber salário 
investir 20%atualizar conta salarial

*/

package AT2_N1;

public class funcionario extends Thread {
	private Loja loja;
	private String nome_f;
	private String conta_f;
	private String conta_fi;
	
	//construtores
	public funcionario() {
		
	}
	public funcionario(String nome_f) {
		this.nome_f=nome_f;
	}
	public funcionario(String nome_f,Loja loja) {
		this.nome_f=nome_f;
		this.loja=loja;
	}
	public funcionario(String nome_f,Loja loja,String conta_f) {
		this.nome_f=nome_f;
		this.loja=loja;
		this.conta_f=conta_f;
	}
	public funcionario(String nome_f,Loja loja,String conta_f, String conta_fi) {
		this.nome_f=nome_f;
		this.loja=loja;
		this.conta_f=conta_f;
		this.conta_fi=conta_fi;
	}
	//get e set
	public String getNome_f() {
		return nome_f;
	}
	public Loja getLoja() {
		return loja;
	}
	public String getConta_f() {
		return conta_f;
	}
	public String getConta_fi() {
		return conta_fi;
	}
	public void setNome_f(String nome_f) {
		this.nome_f=nome_f;
	}
	public void setLoja(Loja loja) {
		this.loja=loja;
	}
	public void setConta_f(String conta_f) {
		this.conta_f=conta_f;
	}
	public void setConta_fi(String conta_fi) {
		this.conta_fi=conta_fi;
	}
	
	
	//métodos receber salario - investir 20%
	
	
	
	
	
	
	
	
	
	
	
	
	
}
