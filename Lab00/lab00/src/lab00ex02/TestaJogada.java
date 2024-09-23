package lab00ex02;

public class TestaJogada {
    public void testaJogada(){

        Dado dado = new Dado();

        //setando como objeto anonimo de classe externa
        dado.setJogada(new AcaoJogadaConcreta());
        dado.jogaDado();
        dado.obtemDado();
        dado.jogaDado();
        dado.obtemDado();
        dado.jogaDado();
        dado.obtemDado();
        dado.jogaDado();
        dado.obtemDado();
    }

    public static void main (String[] args){
        new TestaJogada().testaJogada();
    }
}
