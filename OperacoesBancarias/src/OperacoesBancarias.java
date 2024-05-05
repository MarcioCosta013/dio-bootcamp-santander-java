import java.util.Scanner;

public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean loopWhile = true;
         
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (loopWhile) { 
            int continuar = 0;
            System.out.println("--------------------------------------------------------------------\r\n"+
                        "Digite: 1 - Depositar\r\n" + //
                        "2 - Sacar\r\n" + //
                        "3 - Consultar Saldo\r\n" + //
                        "4 - Encerrar");

            System.out.print("Opção escolhida: ");
            int opcao = scanner.nextInt();
                        
            switch (opcao){ 
                case 1:
                    //Depositar
                    System.out.println("Digite o valor a ser depositado: ");
                    double depósito = scanner.nextDouble();
                    saldo += depósito;
                    System.out.printf("Saldo atual: R$ %.2f\n",saldo);


                    System.out.println("Deseja encerrar o programa?\r\n" +
                                        "1 - Sim\r\n" +
                                        "2 - Não");
                    continuar = scanner.nextInt();
                    if (continuar == 1){
                    loopWhile = false;
                    break;
                    } else if(continuar == 2) {
                        continue;
                    }else {
                        System.out.println("Opção não existente");
                    }
                case 2:
                    //Sacar
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
                    
                    System.out.println("Deseja encerrar o programa?\r\n" +
                                        "1 - Sim\r\n" +
                                        "2 - Não");
                    continuar = scanner.nextInt();
                    if (continuar == 1){
                    loopWhile = false;
                    break;
                    } else if(continuar == 2) {
                        continue;
                    }else {
                        System.out.println("Opção não existente");
                    }
                case 3:
                    //Ver o Saldo
                    System.out.printf("O Saldo atual da conta é de: R$ %.2f\r\n", saldo);
                    
                    System.out.println("Deseja encerrar o programa?\r\n" +
                                        "1 - Sim\r\n" +
                                        "2 - Não");
                    continuar = scanner.nextInt();
                    if (continuar == 1){
                    loopWhile = false;
                    break;
                    } else if(continuar == 2) {
                        continue;
                    }else {
                        System.out.println("Opção não existente");
                    }
                case 4:
                //Encerrar o programa
                    System.out.println("Deseja encerrar o programa?\r\n" +
                                        "1 - Sim\r\n" +
                                        "2 - Não");
                    continuar = scanner.nextInt();
                    if (continuar == 1){
                    loopWhile = false;
                    break;
                    } else if(continuar == 2) {
                        continue;
                    }else {
                        System.out.println("Opção não existente");
                    }

                // TODO: Implemente as condições necessárias para avaliar a opção escolhida:
                // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}
