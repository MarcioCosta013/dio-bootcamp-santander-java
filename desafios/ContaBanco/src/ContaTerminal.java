import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        String nomeDoCliente = scan.nextLine();

        System.out.println("Digite o sua agencia: ");
        String agencia = scan.nextLine();

        System.out.println("Digite o numero da sua conta: ");
        int numero = scan.nextInt();

        System.out.println("Digite o seu Saldo: ");
        double saldo = (Double) scan.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia +", conta "+ numero + " e seu saldo é de " + saldo +" já está disponível para saque");

        scan.close();
    }
}
