package exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina DOIS argumentos do tipo T e retorna um
 * resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar
 * números ou combinar objetos.
 */
public class BinaryOperatorExemplo {
    public static void main(String[] args) {

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // ------------------------ 1° Forma de usar
        // --------------------------------------//

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, somar);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);

        // ------------------------ 2° Forma de usar
        // --------------------------------------//

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado2 = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() { // "identity" seria uma variavel temporária dentro de um laço

                    @Override
                    public Integer apply(Integer n1, Integer n2) {
                        return n1 + n2;
                    }
                });

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado2);

        // ------------------------ 3° Forma de usar(usando lambda)
        // --------------------------------------//
        
        int resultado3 = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2); // "identity" seria uma variavel temporária dentro de um laço

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado3);
    }
}
