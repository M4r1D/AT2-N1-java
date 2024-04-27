package AT2_N1;

public class Main {
	public static void main(String[] args) {
		//instancias
		Banco banco = new Banco();
		Loja loja1 = new Loja();
		Loja loja2 = new Loja();
		//instancia pessoas
		Cliente cliente1 = new Cliente("alexandre");
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		Cliente cliente5 = new Cliente();
		
		funcionario func1 = new funcionario();
		funcionario func2 = new funcionario();
		funcionario func3 = new funcionario();
		funcionario func4 = new funcionario();
		
		cliente1.run();
	}
}







/*package AT2_N1;

public class Main {
	public static void main(String[] args) {
		//add banco
		Banco banco = new Banco("brasco", 124,"setor sul");
		//add lojas
		Loja loja1 = new Loja("geeks",100);
		Loja loja2 = new Loja("leitura",200);
		//add clientes
		Cliente cliente1 = new Cliente("Alexandre");
		Cliente cliente2 = new Cliente("Vitoria");
		Cliente cliente3 = new Cliente("João");
		Cliente cliente4 = new Cliente("Rebeca");
		Cliente cliente5 = new Cliente("Victor");
		//add funcionarios
		funcionario func1 = new funcionario("joão",loja1,"1111","11-1");
		funcionario func2 = new funcionario("luciano",loja1, "2222", "22-2");
		funcionario func3 = new funcionario("amelie",loja2, "3333", "33-3");
		funcionario func4 = new funcionario("catarina",loja2,"4444", "44-4");
		
		//threads funcionarios
		Thread tf1 = new Thread(func1);
		Thread tf2 = new Thread(func2);
		Thread tf3 = new Thread(func3);
		Thread tf4 = new Thread(func4);

		//thread clientes
		Thread tc1 = new Thread(cliente1);
		Thread tc2 = new Thread(cliente2);
		Thread tc3 = new Thread(cliente3);
		Thread tc4 = new Thread(cliente4);
		Thread tc5 = new Thread(cliente5);
		
		
		//start threads
		tf1.start();
		tf2.start();
		tf3.start();
		tf4.start();
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tc5.start();
		
		//conclusão tests
		try {
            tf1.join();
            tf2.join();
            tf3.join();
            tf4.join();
            tc1.join();
            tc2.join();
            tc3.join();
            tc4.join();
            tc5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }	
		cliente1.run();
	}
	
}
*/