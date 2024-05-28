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
}
