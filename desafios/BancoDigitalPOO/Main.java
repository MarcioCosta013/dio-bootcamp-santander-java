import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

        //Criando um cliente
		Cliente marcio = new Cliente("Marcio", LocalDate.of(1999, 5, 20));
		
		
        //conta corrente
		IConta cc = new ContaCorrente(marcio);

		
        //conta poupança
		IConta poupanca = new ContaPoupanca(marcio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}