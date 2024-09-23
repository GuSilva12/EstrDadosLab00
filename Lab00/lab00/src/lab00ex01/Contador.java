package lab00ex01;

public class Contador {
    //passando a ação de contar como atributo
    AcaoContar acaoContar;

    //podemos passar qualquer ação de voar como parâmetro
    public void setAcaoContar(AcaoContar acaoContar){
        this.acaoContar = acaoContar;
    }
    //usando a ação de incrementar
    public int increase(){
        this.acaoContar.increase();
        return 0;
    }

    //usando a ação de contar
    public void contar(){
        this.acaoContar.getCount();
    }
}
