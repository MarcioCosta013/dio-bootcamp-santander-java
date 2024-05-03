import java.util.Scanner;

public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean loopWhile = true;
        System.out.println("digite: 1 - Depositar\r\n" + //
                        "2 - Sacar\r\n" + //
                        "3 - Consultar Saldo\r\n" + //
                        "4 - Encerrar"); 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (loopWhile) { 
            
            int opcao = scanner.nextInt();
            switch (opcao){ 
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double depósito = scanner.nextDouble();
                    saldo += depósito;
                    System.out.printf("Saldo atual: R$ %.2f\n",saldo);
                    break;
                case 2:
                    double saque;
                    System.out.println("Digite o valor a ser sacado: ");
                    saque = scanner.nextDouble();
                    if (saque > saldo){
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.printf("Valor do Saque: R$ %.2f\n",saque);
                        System.out.printf("Saldo Atual: %.2f\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("O Saldo atual da conta é de: R$ %.2f", saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    loopWhile = false;
                    break;

                // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
                // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}
