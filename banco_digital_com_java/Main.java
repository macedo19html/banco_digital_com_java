package banco_digital_com_java;

public class Main {
	
	public static void main(String[] args) {
		
		Banco bancoInicial = new Banco(); 

        bancoInicial.setNome("First Bank"); 

        Cliente carla = new Cliente(bancoInicial, "Carla");  
        carla.setNome("Carla Edila Silveira"); 

        Conta ccorrente = new ContaCorrente(carla);

        ccorrente.depositar(100); 

        Cliente alisson = new Cliente(bancoInicial, "Alisson");  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(alisson);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente carla
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca alisson

        ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente carla pra cpoupanca alisson

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente carla
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca alisson
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente carolina = new Cliente(bancoInicial, "Carolina");  //instancia novo cliente carolina
        Conta ccorrente2 = new ContaCorrente(carolina); //instancia nova ccorrente2 de carolina
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de carolina
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }

		/*Cliente venilton = new ();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}*/

}
