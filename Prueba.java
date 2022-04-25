package Probabilidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prueba {
    public static void main(String[] args) {
        List<Float> lista = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<100; i++){
            float numero = 0.0f;
            numero = random.nextFloat()*6;
            lista.add(numero);
        }
        System.out.println(lista);

        float totalsum=0;
        for (int i=0; i<lista.size(); i++){
            totalsum=totalsum+lista.get(i);
        }
        System.out.println(totalsum/lista.size());
    }
}
