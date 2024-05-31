package exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Function<T, R>: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. 
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */
public class FunctionExemplo {
    public static void main(String[] args) {
        
        // Criar uma lista de números inteiros.
        List<Integer> numeros = Arrays.asList(1,2,3,4);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        // Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);

        //--------------2° forma de fazer o mesmo codigo --------------------

        List<Integer> numerosDobrados2 = numeros.stream()
        .map( new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer numero) {
                return numero * 2;
            }
        })
        .collect(Collectors.toList());

        // Imprimir a lista de números dobrados
        numerosDobrados2.forEach(System.out::println);

        //--------------3° forma de fazer o mesmo codigo (com lambda) --------------------

        List<Integer> numerosDobrados3 = numeros.stream()
        .map(n ->  n * 2) //recebendo um argumento do tipo T<Integer no caso> e retornando no caso o mesmo tipo T<Integer>.
        .toList();

        // Imprimir a lista de números dobrados
        numerosDobrados3.forEach(System.out::println);
    }
}
