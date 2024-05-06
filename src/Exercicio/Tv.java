package Exercicio;

public class Tv {
    boolean online = false;
    int channel = 1;
    int volume = 15;

   public void on_off(){
        online =!online;
    };
    public void aumentarVol(){
        volume++;
    };
    public void diminuirVol(){
        volume--;
    };


public void trocarCanal(int novoChannel){
    channel = novoChannel;
}

}
