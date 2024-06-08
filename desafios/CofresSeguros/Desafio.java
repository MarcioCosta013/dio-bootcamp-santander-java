package desafios.CofresSeguros;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            CofreDigital cofre = new CofreDigital(scanner.nextInt());
            int confirmacaoSenha = scanner.nextInt();
            cofre.imprimirInformacoes();
            if (cofre.validarSenha(confirmacaoSenha)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            Cofre cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }

        scanner.close();
    }
}
