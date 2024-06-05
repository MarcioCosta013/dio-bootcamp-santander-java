import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("======= Bem - Vindo ao E-banco ============ \n");
		System.out.println("Escolha a opção desejada: \n 1- Fazer Movimentacoes; \n 2- Adicionar Cliente;");
		try {
			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					//TODO: Movimentacoes
					
				case 2:
					//TODO: Adicionar Cliente
					
			}
		} catch (Exception e) {
			System.out.println("Erro digite somente numeros inteiros!");
		}
	}

}