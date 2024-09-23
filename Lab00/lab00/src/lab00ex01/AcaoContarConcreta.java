package lab00ex01;

//tornamos a ação de incrementar possível ao implementar a interface "AcaoContar" à classe "AcaoContarConcreta",
// que possui os métodos de incremento e contagem responsáveis por executar a ação de contar e incrementar
public class AcaoContarConcreta implements AcaoContar{
    //variável "count" de tipo int
    public int count;
    //método vazio Counter que inicia a variável "count" em 0
    public void Counter(){
        this.count = 0;
    }

    @Override
    public void increase(){     //método que, invocado, incrementa 1 ao contador
        count++;
        System.out.println("COUNT: " + count);
    }
    @Override
    public int getCount(){
        return count;
    }
}
