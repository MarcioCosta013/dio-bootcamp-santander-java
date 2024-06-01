package exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso). 
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExemplo {
    public static void main(String[] args) {
        
        //Criar uma lista de palavras.
        List<String> palavras = Arrays.asList("java", "Kotlin", "python", "c", "go", "ruby","javascript");

        //Criar um Predicate que verifica se a palavra tem mais de 5 letras.
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        /* 
        Usar  o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        imprimir cada palavra que passou no filtro. 
        */
        palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);

        //--------------------2° forma de escrever o mesmo codigo ---------------------------

        /* 
        Usar  o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        imprimir cada palavra que passou no filtro. 
        */
        palavras.stream()
        .filter(
            new Predicate<String>() {
                @Override
                public boolean test(String p){
                    return p.length() > 5;
                }
            }
        )
        .forEach(System.out::println);

        //--------------------3° forma de escrever o mesmo codigo (com lambda) ---------------------------

        palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(System.out::println);
    }
}
