package AT2_N1;

public class Main {
	public static void main(String[] args) {
		//instancias
		Banco banco = new Banco();
		
		Conta cont001 = new Conta("Geeks", banco, 0,"001","06");
		Conta cont002 = new Conta("Anime", banco, 0,"002","07");
		
		Loja loja1 = new Loja("Geeks", (float) 0.0, 0, cont001);
		Loja loja2 = new Loja("Anime",(float) 0.0,0, cont002);
		
		//instancias
		Conta cont1 = new Conta("Alexandre", banco, 1000,"06","01");
		Conta cont2 = new Conta("Vitoria", banco,1000,"07","02");
		Conta cont3 = new Conta("Pedro", banco, 1000, "08", "03");
		Conta cont4 = new Conta("Amanda", banco, 1000, "09", "04");
		Conta cont5 = new Conta("José", banco, 1000, "06", "05");
		Conta cont6 = new Conta("Fernanda", banco, 0, "", "06");
		Conta cont7 = new Conta("João", banco, 0, "", "07");
		Conta cont8 = new Conta("Claudia", banco, 0, "", "08");
		Conta cont9 = new Conta("Sabrina", banco, 0, "", "09");
		
		Cliente cliente1 = new Cliente("alexandre",cont1, 1000);
		Cliente cliente2 = new Cliente("Vitoria", cont2,1000);
		Cliente cliente3 = new Cliente("Pedro", cont3,1000);
		Cliente cliente4 = new Cliente("Amanda", cont4, 1000);
		Cliente cliente5 = new Cliente("José", cont5, 1000);
		
		funcionario func1 = new funcionario("Fernanda",loja1,"06","066");
		funcionario func2 = new funcionario("João", loja1, "07", "077");
		funcionario func3 = new funcionario("Claudia", loja2,"08", "088");
		funcionario func4 = new funcionario("Sabrina", loja2,"09", "099");
		
		
		
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
		
		
		//compras
		System.out.println("COMPRAS");
		cliente1.Comprar(loja1, 0, banco);
		
		
		//valor da transferencia 
		System.out.println("TANSFERENCIA:");
		banco.Transferencia(cont1, cont6, 0, 0);
		
		System.out.println("CLIENTE:");
		cliente1.run();
		cliente1.exibeSaldo();

		System.out.println("CAIXA:");
		loja1.Receber();
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