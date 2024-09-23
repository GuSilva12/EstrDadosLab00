package lab00ex02;

import java.util.Random;

public class AcaoJogadaConcreta implements AcaoJogada {

    Random rand = new Random();


    @Override
    public void jogaDado() {
        // Generate random integers in range 1 to 6
        int result = rand.nextInt(6) + 1;
        System.out.println("Valor dado: " + result);
    }

    @Override
    public Random getDado() {
        return rand;
    }
}
