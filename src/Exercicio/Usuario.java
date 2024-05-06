package Exercicio;

public class Usuario {
    public static void main(String[] args)  {
        Tv minhaTv = new Tv();

        System.out.println("State of TV " + minhaTv.online );
        System.out.println("Channel currency " + minhaTv.channel );
        System.out.println("Volume currency " + minhaTv.volume );

        minhaTv.on_off();
        minhaTv.aumentarVol();
        //minhaTv.diminuirVol();
        minhaTv.trocarCanal(13);


        System.out.println(minhaTv.online);
        System.out.println("Volume currency " + minhaTv.volume );
        System.out.println("Channel currency " + minhaTv.channel );

    }
}
