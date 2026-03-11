import java.util.Random;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] energiaContenedores = new int[12];
        System.out.println("Energia generada: ");
        for (int i = 0; i < 12; i++) {
            energiaContenedores[i] = 50 + random.nextInt(101);
            System.out.print(energiaContenedores[i] + " ");
        }

        // Filtro multiplos de 10
        int[] filtrado = new int[12];
        int j = 0;
        for (int i = 0; i < 12; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                filtrado[j] = energiaContenedores[i];
                j++;
            }
        }
        System.out.println("\nEnergia filtrada: ");
        for (int i = 0; i < j; i++) {
            System.out.print(filtrado[i] + " ");
        }

        // mapa de carga
        int[][] mapaCarga = new int[3][3];
        int indice = 0;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (indice < j) {
                    mapaCarga[i][k] = filtrado[indice];
                    indice++;
                } else {
                    mapaCarga[i][k] = -1;
                }
            }
        }
        System.out.println("\nMapa de carga:");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(mapaCarga[i][k] + " ");
            }
            System.out.println();
        }

        // manifiesto de vuelo
        Suministro[] manifiesto = new Suministro[9];
        int posicion = 0;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                int energia = mapaCarga[i][k];
                if (energia != -1) {
                    String prioridad;
                    if (energia > 100) {
                        prioridad = "Alta";
                    } else {
                        prioridad = "Estandar";
                    }
                    String id = "C-" + i + "-" + k;
                    manifiesto[posicion] = new Suministro(id, energia, prioridad);
                } else {
                    manifiesto[posicion] = null;
                }
                posicion++;
            }
        }
        System.out.println("\nManifiesto de vuelo:");
        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i] != null) {
                manifiesto[i].mostrarSuministro();
            } else {
                System.out.println("null");
            }
        }
    }
}
