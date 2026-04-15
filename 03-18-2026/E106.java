import java.util.*;

public class E106 {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        Random rand = new Random();

        int tiempoSimulacion = 420; // 7 horas en minutos

        int[] tiempoCaja = new int[4]; // 4 cajas
        boolean[] ocupada = new boolean[4];

        int clientesAtendidos = 0;
        int totalFila = 0;
        int maxFila = 0;
        int maxEspera = 0;
        int tiempoCaja4Activa = 0;

        for (int minuto = 0; minuto < tiempoSimulacion; minuto++) {

            if (rand.nextDouble() < 0.8) {
                fila.add(minuto);
            }

            boolean caja4Activa = fila.size() > 20;

            if (caja4Activa) tiempoCaja4Activa++;

            for (int i = 0; i < 4; i++) {

                if (i == 3 && !caja4Activa) continue;

                if (ocupada[i]) {
                    tiempoCaja[i]--;

                    if (tiempoCaja[i] == 0) {
                        ocupada[i] = false;
                        clientesAtendidos++;
                    }
                }

                if (!ocupada[i] && !fila.isEmpty()) {

                    int llegada = fila.poll();
                    int espera = minuto - llegada;

                    if (espera > maxEspera) maxEspera = espera;

                    double tiempo;

                    switch (i) {
                      case 0 -> 
                        tiempo = 1.5 + rand.nextDouble();
                      case 1 ->
                        tiempo = 2 + rand.nextDouble() * 3;
                      case 2 -> 
                        tiempo = 2 + rand.nextDouble() * 2;
                      default ->
                        tiempo = 2 + rand.nextDouble() * 2.5;
                    } // caja 4

                    tiempoCaja[i] = (int) Math.ceil(tiempo);
                    ocupada[i] = true;
                }
            }

            totalFila += fila.size();
            if (fila.size() > maxFila) maxFila = fila.size();
        }

        double promedioFila = (double) totalFila / tiempoSimulacion;

        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Tamaño promedio fila: " + promedioFila);
        System.out.println("Tamaño máximo fila: " + maxFila);
        System.out.println("Tiempo máximo espera: " + maxEspera + " minutos");
        System.out.println("Tiempo caja 4 activa: " + tiempoCaja4Activa + " minutos");
    }
}