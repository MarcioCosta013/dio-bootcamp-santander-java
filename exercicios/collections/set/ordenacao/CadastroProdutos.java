package exercicios.collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    //construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //metodos
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        //Adiciona um produto ao cadastro.
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        //Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //o HashSet não deixa organizado o TreeSet deixa, por isso usamos ele aqui.
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        //Exibe todos os produtos do cadastro em ordem crescente de preço.
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    
    }




    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);
    
        // Exibindo produtos ordenados por nome
        System.out.println("--------------------------------------");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    
        // Exibindo produtos ordenados por preço
        System.out.println("--------------------------------------");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
      }
}
