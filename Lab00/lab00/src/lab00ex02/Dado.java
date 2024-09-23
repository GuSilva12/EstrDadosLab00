package lab00ex02;

public class Dado {
    //passando a ação de jogar como atributo
    AcaoJogada jogada;

    //passando a ação de voar como parâmetro
    public void setJogada(AcaoJogada aJogada){
        this.jogada = aJogada;
    }

    public int jogaDado(){
        this.jogada.jogaDado();
        return 0;
    }

    //usando a ação de jogar
    public void obtemDado(){
        this.jogada.getDado();
    }
}
