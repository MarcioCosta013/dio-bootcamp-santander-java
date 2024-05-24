package exercicios.collections.list.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    //atributo
    private List<Item> carrinhoDeCompras = new ArrayList<>();

    //construtor
    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }


    //metodos
    public void adicionarItem(String nome, double preco, int quantidade){
        // Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
        carrinhoDeCompras.add(new Item(nome, preco, quantidade)); 
    }

    public void removerItem(String nome) {
        //Remove um item do carrinho com base no seu nome.
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : carrinhoDeCompras){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        carrinhoDeCompras.removeAll(itensParaRemover); //
    }

    public double calcularValorTotal(){
        //Calcula o valor total do carrinho.
        double valorTotal = 0;
        double subTotal = 0;
        for(Item i: carrinhoDeCompras){
            subTotal =+ i.getPreco() * i.getQuantidade();
            valorTotal =+ valorTotal + subTotal;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }




    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("urso", 8.00, 2);
        carrinho.adicionarItem("pedra", 8.00, 3);
        carrinho.adicionarItem("polar", 8.00, 1);

        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());
    }
}
