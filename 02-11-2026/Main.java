public class Main {
    public static void main(String[] args) {
        // Definiendo el arreglo
        int[] a = { 7, 2, 6, 1, 0, 3 };

        // El tamaño del arreglo se obtiene con la propiedad length
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = " + a[i]);
        }

        // Sumar todos los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        System.out.println("\nLa suma de los elementos del arreglo es: " + suma);
    }
}