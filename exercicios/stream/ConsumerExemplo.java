package exercicios.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer<T>: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. 
 * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do 
 * Stream sem modificar ou retornar um valor.
 */
public class ConsumerExemplo {
    public static void main(String[] args) {

        //criando uma lista de numeros inteiros.
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //-------------Forma 1 de inplementação de um Consumer: -------------------//

        //Usar o Consumer com expressão lambda para imprimir números pares.
        Consumer<Integer> imprimirNumeroPar = numeroConsumer -> { //Consumer implementado fora para melhor compreenção inicial.
            if(numeroConsumer % 2 == 0){
                System.out.println(numeroConsumer);
            }
        };

        //Usar o Consumer para imprimir números pares no Scream
        numeros.stream().forEach(imprimirNumeroPar);
        /*
         * peguei a lista 'numeros' chamei o stream, e no stream chamei o 
         * metodo 'forEach', do stream, que recebe um Consumer. então 
         * chamei o metodo feito anteriormente.
         */

         //---------------Forma 2 de implementação do Consumer: --------//

         numeros.stream().forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer n) {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
            
         });

        // Transformando o codigo acima com o Lambda: --------------

        numeros.forEach( n -> { //nesse caso dá para simplificar mais ainda tirando o ".stream()", e vai funcionar da mesma forma.
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
         );
    }
}
