import java.util.Random;

public class Puerto {

    String[][] contenedores = new String[10][10];
    double[][] pesos = new double[10][10];
    String[][] origenes = new String[10][10];

    String[] paises = { "Colombia", "Mexico", "Brasil", "Chile", "Argentina" };
    Random random = new Random();

    public void llenarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                contenedores[i][j] = "C" + (i * 10 + j + 1);
                pesos[i][j] = 100.0 + random.nextInt(901);
                origenes[i][j] = paises[random.nextInt(paises.length)];
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("\nMatriz de contenedores:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (contenedores[i][j] == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
    }

    public void mostrarPesoTotal() {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                total += pesos[i][j];
            }
        }
        System.out.println("Peso total del puerto: " + total);
    }

    public void mostrarOrigenes() {

        System.out.println("\nLista de contenedores con origen:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(contenedores[i][j] + " - " + origenes[i][j]);
            }
        }
    }
}