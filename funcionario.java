/*Funcionário(4) - 
thread 
duas contas - salário loja e outra de investimentos
deve investir 20% salário na 2º conta
//
receber salário 
investir 20%atualizar conta salarial

*/

package AT2_N1;

public class funcionario {
	String nome_f;
	String cpf;
	String conta_f;
	String conta_fi;
	
	//construtores
	public funcionario() {
		
	}
	public funcionario(String nome_f) {
		this.nome_f=nome_f;
	}
	public funcionario(String nome_f,String cpf) {
		this.nome_f=nome_f;
		this.cpf=cpf;
	}
	public funcionario(String nome_f,String cpf,String conta_f) {
		this.nome_f=nome_f;
		this.cpf=cpf;
		this.conta_f=conta_f;
	}
	public funcionario(String nome_f,String cpf,String conta_f, String conta_fi) {
		this.nome_f=nome_f;
		this.cpf=cpf;
		this.conta_f=conta_f;
		this.conta_fi=conta_fi;
	}
	//get e set
	public String getNome_f() {
		return nome_f;
	}
	public String getCpf() {
		return cpf;
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
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	public void setConta_f(String conta_f) {
		this.conta_f=conta_f;
	}
	public void setConta_fi(String conta_fi) {
		this.conta_fi=conta_fi;
	}
	
	//métodos receber salario - investir 20%
	
	
	
	
	
	
	
	
	
	
	
	
	
}
