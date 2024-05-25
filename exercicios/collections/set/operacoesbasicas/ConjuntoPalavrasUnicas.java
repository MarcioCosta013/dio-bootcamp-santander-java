package exercicios.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> palavrasUnicas;

    //construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    

    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }



    public void adicionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){ //para verificar se a lista está vazia.
            if(palavrasUnicas.contains(palavra)){
                this.palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
            
            System.out.println("palavra removida");
        } else {
            System.out.println("a lista está vazia");
        }
        
    }

    public void verificarPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){ //para verificar se existe esse elemento dentro da lista.
                System.out.println("palavra já existe");
            } else {
                System.out.println("palavra não existe");
            }
        } else {
            System.out.println("a lista está vazia");
        }
        
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }


    //-------------------------------------------------------------------

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("bolado");
        conjunto.adicionarPalavra("marcio");
        conjunto.adicionarPalavra("maiza");
        conjunto.adicionarPalavra("Zulamy");
        conjunto.adicionarPalavra("marcio");

        conjunto.exibirPalavrasUnicas();
        
        System.out.println("------------------------");

        conjunto.removerPalavra("bolado");
        conjunto.exibirPalavrasUnicas();

        System.out.println("------------------------");

        conjunto.verificarPalavra("gdfjgdgarcio");
        

        
    }
}
