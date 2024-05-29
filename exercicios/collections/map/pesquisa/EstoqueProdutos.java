package exercicios.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //atributo
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        //Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        //Exibe todos os produtos, suas quantidades em estoque e preços.
        if(!estoqueProdutoMap.isEmpty()){
            System.out.println(estoqueProdutoMap);
        } else {
            System.out.println("Não há produtos no estoque.");
        }
        
    }

    public double calcularValorTotalEstoque(){
        //Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
        double valorTotalEstoque = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        } else {
            System.out.println("Não há produtos no estoque.");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        //Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE; //essa constante é para que futuramente o primeiro numero a ser comparado já seja o maior numero.
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else{
            System.out.println("Não há produtos no estoque.");
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        //Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE; //essa constante é para que futuramente o primeiro numero a ser comparado já seja o menor numero.
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } else{
            System.out.println("Não há produtos no estoque.");
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }
}
