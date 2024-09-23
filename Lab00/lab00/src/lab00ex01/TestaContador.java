package lab00ex01;

public class TestaContador {
    public void testaContador(){
        //Instanciando um objeto "contador" da classe "Contador"
        Contador contador = new Contador();

        //setando como objeto anônimo de classe externa
        contador.setAcaoContar(new AcaoContarConcreta());
        contador.increase();    //método que, invocado, incrementa 1 ao contador
        contador.contar();      //método que, invocado, retorna a quantidade atual de incrementos feitos
        contador.increase();    //método que, invocado, incrementa 1 ao contador
        contador.contar();      //método que, invocado, retorna a quantidade atual de incrementos feitos
        contador.increase();    //método que, invocado, incrementa 1 ao contador
        contador.contar();      //método que, invocado, retorna a quantidade atual de incrementos feitos
    }
    //INÍCIO DO PROGRAMA
    public static void main(String[]args){
        new TestaContador().testaContador();
    }
}
