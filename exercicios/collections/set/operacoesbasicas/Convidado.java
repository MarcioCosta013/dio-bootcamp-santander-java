package exercicios.collections.set.operacoesbasicas;

public class Convidado {

    //atributos
    private String nome;
    private int codigoConvite;

    //construtor
    public Convidado(String nome, int codigoDoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoDoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoDoConvite=" + codigoConvite + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) { //metodo que devine o hash, o elemento que vai ser o identificador unico do SET(tipo um id em SQL).
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite){
            return false;
        }
        return true;
    }


    
}
