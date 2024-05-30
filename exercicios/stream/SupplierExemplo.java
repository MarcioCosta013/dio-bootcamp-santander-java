package exercicios.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. 
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExemplo {
    public static void main(String[] args) {
        
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao) //"generate()" é um metodo que recebe um Supplier.
            .limit(5) //Se passa um 'long' nesse metodo para dizer quantas vezes se vai repetir a 'saudacao' acima.
            .collect(Collectors.toList()); //Esse metodo coleta as 'saudacao's e coloca em uma lista. Ele recebe um Collector.
                                            //e esse collector tem 'toList' um metodo que tranforma em um list. pode simplificar e botar só o '.toList'.
        
        
        // Imprimir as saudações geradas(usando lambda)
        listaSaudacoes.forEach(s -> System.out.println(s));

        // Imprimir as saudações geradas(usando Method Reference no lugar do lambda)
        listaSaudacoes.forEach(System.out::println);

        // --------------------- forma 2 de chegar no mesmo resultado: --------//

        // Usar o Supplier com uma classe anônima para fornecer uma saudação personalizada
        Supplier<String> saudacao2 = new Supplier<String>() {
        @Override
        public String get() {
            return "Olá, seja bem-vindo(a)!";
        }
        };

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaSaudacoes.add(saudacao2.get());
        }

        // Imprimir as saudações geradas
        for (String saudacaoGerada : listaSaudacoes2) {
            System.out.println(saudacaoGerada);
        }
    }
}
