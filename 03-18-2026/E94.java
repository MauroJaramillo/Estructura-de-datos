import java.util.*;

public class E94 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        Stack<Integer>[] pilas = new Stack[n];

        for (int k = 0; k < n; k++) {
            pilas[k] = new Stack<>();
        }

        while (true) {
            System.out.print("Ingrese i: ");
            int i = sc.nextInt();

            if (i == 0) break;

            System.out.print("Ingrese j: ");
            int j = sc.nextInt();

            int index = Math.abs(i) - 1;

            if (i > 0) {
                pilas[index].push(j);
            } else {
                if (!pilas[index].isEmpty()) {
                    pilas[index].pop();
                }
            }
        }

        // Mostrar pilas
        for (int k = 0; k < n; k++) {
            System.out.println("Pila " + (k + 1) + ": " + pilas[k]);
        }
    }
}