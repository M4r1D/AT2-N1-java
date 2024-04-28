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
	private int salario;
	private String nome_f;
	private String conta;
	private String conta_fi;
	private Loja loja;
	
	//construtores
	public funcionario() {
		
	}
    public funcionario(int salario) {
		this.salario=salario;
	}
    public funcionario(int salario, String nome_f) {
		this.salario=salario;
		this.nome_f=nome_f;
	}
    public funcionario(int salario, String nome_f,String conta) {
		this.salario=salario;
		this.nome_f=nome_f;
		this.conta=conta;
	}
    public funcionario(int salario, String nome_f,String conta, String conta_fi) {
		this.salario=salario;
		this.nome_f=nome_f;
		this.conta=conta;
		this.conta_fi=conta_fi;
	}
    public funcionario(int salario, String nome_f,String conta, String conta_fi, Loja loja) {
		this.salario=salario;
		this.nome_f=nome_f;
		this.conta=conta;
		this.conta_fi=conta_fi;
		this.loja=loja;
	}
	//get e set
    public int getSalario() {
		return salario;
	}
	public String getNome_f() {
		return nome_f;
	}
	public String getConta() {
		return conta;
	}
	public String getConta_fi() {
		return conta_fi;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setSalario(int salario) {
		this.salario=salario;
	}
	public void setNome_f(String nome_f) {
		this.nome_f=nome_f;
	}
	public void setConta(String conta) {
		this.conta=conta;
	}
	public void setConta_fi(String conta_fi) {
		this.conta_fi=conta_fi;
	}	
	public void setLoja(Loja loja) {
		this.loja=loja;
	}
	
	
	//métodos receber salario - investir 20%
	public void Receber(Loja loja, Conta conta_f) {
		if(loja.getConta_l().getSaldo() >= salario) {
		loja.getConta_l().setSaldo(loja.getConta_l().getSaldo());		}
		conta_f.setSaldo(conta_f.getSaldo()); 
		System.out.println("recebeu:" +salario);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
