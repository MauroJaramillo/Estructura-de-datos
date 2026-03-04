import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Puerto puerto = new Puerto();

        int opcion;

        do {
            System.out.println("\n====== MENU PUERTO ======");
            System.out.println("1. Generar matriz random (100 contenedores)");
            System.out.println("2. Mostrar matriz");
            System.out.println("3. Mostrar peso total");
            System.out.println("4. Mostrar origenes");
            System.out.println("5. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    puerto.llenarMatriz();
                    break;

                case 2:
                    puerto.mostrarMatriz();
                    break;

                case 3:
                    puerto.mostrarPesoTotal();
                    break;

                case 4:
                    puerto.mostrarOrigenes();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);

        sc.close();
    }
}