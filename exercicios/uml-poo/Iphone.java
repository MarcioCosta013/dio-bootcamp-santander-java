package uml;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico {

    private int numero;
    private boolean reprodutor;

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionandoMusica() {
        System.out.println("Selecionando Musica");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o numero: " + numero);
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando o Correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada...");
    }


    //metodos especiais
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isReprodutor() {
        return reprodutor;
    }

    public void setReprodutor(boolean reprodutor) {
        this.reprodutor = reprodutor;
    }
    
}
