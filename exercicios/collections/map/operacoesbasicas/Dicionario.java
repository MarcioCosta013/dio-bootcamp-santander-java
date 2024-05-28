package exercicios.collections.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> listaPalavras;

    public Dicionario() {
        this.listaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        //Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
        listaPalavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        //Remove uma palavra do dicionário, dado o termo a ser removido.
        if(!listaPalavras.isEmpty()){
            listaPalavras.remove(palavra);
        }
    }

    public void exibirPalavras(){
        //Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
        System.out.println(listaPalavras);
    }

    public String pesquisarPorPalavra(String palavra){
        //Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
        String palavraEscolhida = null;
        if(!listaPalavras.isEmpty()){
            palavraEscolhida = listaPalavras.get(palavra);
        }

        return palavraEscolhida;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
    
        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
    
        // Exibir todas as palavras
        dicionario.exibirPalavras();
    
        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
    
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);
    
        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
      }
}
