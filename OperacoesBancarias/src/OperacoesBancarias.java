import java.util.Scanner;

public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean loopWhile = true;
 
        /*System.out.println("--------------------------------------------------------------------\r\n"+
                        "Digite: \r\n 1 - Depositar\r\n" + //
                        "2 - Sacar\r\n" + //
                        "3 - Consultar Saldo\r\n" + //
                        "4 - Encerrar"); */

        //System.out.print("\nOpção escolhida: ");
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (loopWhile) { 
            int continuar = 0;

            
            try {
                int opcao = scanner.nextInt();

                switch (opcao){ 
                    case 1:
                        //Depositar
                        
                        //System.out.println("Digite o valor a ser depositado: ");
                        
                        try {
                            double deposito = scanner.nextDouble();
                            saldo += deposito;
                            System.out.printf("Saldo atual: " + saldo +"\n");
                            break;
                        } catch (Exception e) {
                            System.out.println("Erro: Digite só numeros");
                            break;
                        }
                    
                    case 2:
                        //Sacar
                        double saque;
                        //System.out.println("Digite o valor a ser sacado: ");
                        saque = scanner.nextDouble();
                        if (saque > saldo){
                            System.out.println("Saldo insuficiente.");
                            break;
                        } else {
                            saldo -= saque;
                            System.out.printf("Saldo atual: " + saldo +"\n");
                            break;
                        }
                        
                        
                    case 3:
                        //Consultar Saldo
                        System.out.printf("Saldo atual: " + saldo +"\n");
                        break;
                        
                    case 0:
                        //Encerrar o programa
                        try{
                            System.out.println("Programa encerrado.");
                            loopWhile = false;
                            break;
                            
                        }catch (Exception e){
                            System.out.println("Erro na digitação da opção, por favor tente novamente só com numeros.");
                        }
                    // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                    default:
                        System.out.println("Opção inválida. Tente novamente ."); 
                }
            } catch (Exception e) {
                System.err.println("\r\nErro! Opção inválida. Somente Numeros...");
                break;
            }
         
        }
        
    }

}
