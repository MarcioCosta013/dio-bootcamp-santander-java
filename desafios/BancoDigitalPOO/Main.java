
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		


		System.out.println("======= Bem-Vindo ao E-banco ============ \n");
		System.out.println("Escolha a opção desejada: \n 1- Fazer Movimentacoes; \n 2- Adicionar Cliente;");
		try {
			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					//Movimentacoes
					System.out.println("Escolha a opção desejada: \n 1- Sacar; \n 2- Depositar; \n 3- Transferir; \n 4- Imprimir Saldo");
					try {
						int opcao2 = scanner.nextInt();
						switch (opcao2) {
							case 1:

								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
							default:
							System.out.println("Numero incorreto");
						}
					} catch (Exception e) {
						System.out.println("Opção incorreta!");
					}
					break;
				case 2:
					//TODO: Adicionar Cliente
					System.out.println("Digete: \n 1- Conta Corrente; \n 2- Conta Poupança; ");
					try {
						int opcaoConta = scanner.nextInt();
						System.out.println(opcaoConta);

						if(opcaoConta == 1){
							System.out.print("Digite o nome: ");
							String nomeCliente = scanner.next();
							System.out.println("Digite o ano de nascimento: ");
							int anoNasc = scanner.nextInt();
							System.out.println("Digite o Mês de nascimento: ");
							int anoMes = scanner.nextInt();
							System.out.println("Digite o Dia de nascimento: ");
							int anoDia = scanner.nextInt();

							Cliente cliente = new Cliente(nomeCliente, LocalDate.of(anoNasc, anoMes, anoDia));
							
							Conta conta = new ContaCorrente(cliente);
							conta.imprimirInfosComuns();
						} else {
							System.out.print("Digite o nome: ");
							String nomeCliente = scanner.next();
							System.out.println("Digite o ano de nascimento: ");
							int anoNasc = scanner.nextInt();
							System.out.println("Digite o Mês de nascimento: ");
							int anoMes = scanner.nextInt();
							System.out.println("Digite o Dia de nascimento: ");
							int anoDia = scanner.nextInt();

							Cliente cliente = new Cliente(nomeCliente, LocalDate.of(anoNasc, anoMes, anoDia));
							
							Conta conta = new ContaPoupanca(cliente);
							conta.imprimirInfosComuns();
						}
					} catch (Exception e) {
						System.out.println("Erro!");
					}
					break;
				default:
				System.out.println("Numero incorreto!");
			}
		} catch (Exception e) {
			System.out.println("Erro digite somente numeros inteiros!");
		}

		scanner.close();
	}
}