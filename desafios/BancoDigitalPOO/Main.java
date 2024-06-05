
public class Main {

	public static void main(String[] args) {

        //Criando um cliente
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
        //conta corrente
		Conta cc = new ContaCorrente(venilton);

        //conta poupança
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}