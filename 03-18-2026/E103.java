import java.util.*;

public class E103 {

    public static void main(String[] args) {

        Queue<Integer> caja1 = new LinkedList<>();
        Queue<Integer> caja2 = new LinkedList<>();
        Queue<Integer> caja3 = new LinkedList<>();

        int clientes = 10;

        for (int i = 1; i <= clientes; i++) {

            // Elegir la cola más corta
            Queue<Integer> menor = caja1;

            if (caja2.size() < menor.size()) menor = caja2;
            if (caja3.size() < menor.size()) menor = caja3;

            menor.add(i);
        }

        System.out.println("Caja 1: " + caja1);
        System.out.println("Caja 2: " + caja2);
        System.out.println("Caja 3: " + caja3);
    }
}