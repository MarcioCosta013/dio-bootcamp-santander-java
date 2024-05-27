package exercicios.collections.set.ordenacao;

public class Produto {
    //atributos
    private String nome;
    private int cod;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, int cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "] \n";
    }

    
}
