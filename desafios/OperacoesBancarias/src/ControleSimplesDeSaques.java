import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        for(double i=0; i<limiteDiario;){
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                i = limiteDiario;
                System.out.println("Transacoes encerradas.");
                break;
            } else if(valorSaque > limiteDiario){
                i = limiteDiario;
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            } else{
                i = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + i);
            }
        }
          
        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}