package exercicios.collections.map.ordenacao;

public class Evento {
    //atributos
    private String nomeDoEvento;
    private String nomeDaAtracao;
    
    //construtor
    public Evento(String nomeDoEvento, String nomeDaAtracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDaAtracao = nomeDaAtracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    @Override
    public String toString() {
        return "Evento [nomeDoEvento=" + nomeDoEvento + ", nomeDaAtracao=" + nomeDaAtracao + "] \n";
    }

    
}
