public class SmartTv {
    public boolean ligada = false;
    public int canal;
    public int volume;

    public SmartTv() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 20;
    }

public void power () {
    ligada = !ligada;
}

public void aumentarVolume (){
    volume++;
}

public void diminuirVolume (){
    volume--;
}

public void mudarCanal(){
    canal++;
}

public void mudarCanalDefinido(int  novoCanal) {
     canal=novoCanal;
}


}