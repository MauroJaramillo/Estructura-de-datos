public class Ejercicios {

    public static void main(String[] args) {

        // 1. Suma de N números
        int[] arr1 = { 4, 6, 8, 2, 10 };
        int suma = 0;
        for (int i = 0; i < arr1.length; i++) {
            suma += arr1[i];
        }
        System.out.println("1) Suma = " + suma);

        // 2. Neto a pagar empleados
        double[] sueldo = { 1000, 1200, 900 };
        double[] asign = { 200, 150, 100 };
        double[] deduc = { 100, 120, 80 };
        double[] neto = new double[sueldo.length];

        for (int i = 0; i < sueldo.length; i++) {
            neto[i] = sueldo[i] + asign[i] - deduc[i];
            System.out.println("2) Neto empleado " + (i + 1) + ": " + neto[i]);
        }

        // 3. Sumar pares e impares
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0)
                sumaPares += arr1[i];
            else
                sumaImpares += arr1[i];
        }
        System.out.println("3) Pares = " + sumaPares + " | Impares = " + sumaImpares);

        // 4. Mayor valor entre dos arreglos
        int[] edades1 = { 18, 25, 30 };
        int[] edades2 = { 22, 19, 35 };
        int mayor = edades1[0];

        for (int i = 0; i < edades1.length; i++) {
            if (edades1[i] > mayor)
                mayor = edades1[i];
        }
        for (int i = 0; i < edades2.length; i++) {
            if (edades2[i] > mayor)
                mayor = edades2[i];
        }
        System.out.println("4) Mayor edad = " + mayor);

        // 5. Productos
        double[] PU = { 10, 5, 8 };
        int[] CC = { 3, 10, 4 };
        String[] desc = { "Cuaderno", "Lapicero", "Borrador" };
        double[] TG = new double[PU.length];
        double totalGeneral = 0;
        int posMayor = 0;

        for (int i = 0; i < PU.length; i++) {
            TG[i] = PU[i] * CC[i];
            totalGeneral += TG[i];
            if (TG[i] > TG[posMayor])
                posMayor = i;
        }

        System.out.println("5) Total general = " + totalGeneral);
        System.out.println("Mayor gasto: " + desc[posMayor] + " $" + TG[posMayor]);

        // 6. Ganancia por vivienda
        double[] alquiler = { 500, 700, 600 };
        double[] porcentaje = { 0.1, 0.15, 0.12 };
        double[] ganancia = new double[alquiler.length];

        for (int i = 0; i < alquiler.length; i++) {
            ganancia[i] = alquiler[i] * porcentaje[i];
            System.out.println("6) Ganancia vivienda " + (i + 1) + ": " + ganancia[i]);
        }

        // 7. Separar pares e impares
        int[] A7 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("7) Pares: ");
        for (int i = 0; i < A7.length; i++) {
            if (A7[i] % 2 == 0)
                System.out.print(A7[i] + " ");
        }
        System.out.print("\n   Impares: ");
        for (int i = 0; i < A7.length; i++) {
            if (A7[i] % 2 != 0)
                System.out.print(A7[i] + " ");
        }
        System.out.println();

        // 8. Mayor, menor y repeticiones
        int[] arr8 = { 5, 3, 8, 3, 9, 9, 1, 1, 1, 4 };
        int max = arr8[0], min = arr8[0];

        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] > max)
                max = arr8[i];
            if (arr8[i] < min)
                min = arr8[i];
        }

        int contMax = 0, contMin = 0;
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] == max)
                contMax++;
            if (arr8[i] == min)
                contMin++;
        }

        System.out.println("8) Mayor = " + max + " repite " + contMax);
        System.out.println("   Menor = " + min + " repite " + contMin);

        // 9. Contar cuántas veces aparece X
        int X = 3;
        int contador = 0;
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] == X)
                contador++;
        }
        System.out.println("9) El número " + X + " aparece " + contador + " veces");

        // 10. Suma de opuestos
        int[] A10 = { 8, 5, 3, 10, 2, 8, 1 };
        System.out.print("10) B = ");
        for (int i = 0; i < A10.length / 2; i++) {
            System.out.print(A10[i] + A10[A10.length - 1 - i] + " ");
        }
        System.out.println();

        // 11. Negativos, ceros y positivos
        int[] A11 = { -3, 0, 4, -1, 2 };
        System.out.print("11) Negativos: ");
        for (int i = 0; i < A11.length; i++) {
            if (A11[i] < 0)
                System.out.print(A11[i] + " ");
        }
        System.out.print("\n    Ceros: ");
        for (int i = 0; i < A11.length; i++) {
            if (A11[i] == 0)
                System.out.print(A11[i] + " ");
        }
        System.out.print("\n    Positivos: ");
        for (int i = 0; i < A11.length; i++) {
            if (A11[i] > 0)
                System.out.print(A11[i] + " ");
        }
        System.out.println();

        // 12. Posiciones donde A[i] = X
        int[] A12 = { 4, 6, 8, 2, 6, 9, 6, 1 };
        int x = 6;
        System.out.print("12) Posiciones de X: ");
        for (int i = 0; i < A12.length; i++) {
            if (A12[i] == x)
                System.out.print((i + 1) + " ");
        }
        System.out.println();

        // 13. Mayores y menores que la media
        int[] A13 = { 2, 4, 6, 8 };
        double media = 0;

        for (int i = 0; i < A13.length; i++)
            media += A13[i];
        media /= A13.length;

        System.out.print("13) Mayores que la media: ");
        for (int i = 0; i < A13.length; i++) {
            if (A13[i] > media)
                System.out.print(A13[i] + " ");
        }
        System.out.print("\n    Menores que la media: ");
        for (int i = 0; i < A13.length; i++) {
            if (A13[i] < media)
                System.out.print(A13[i] + " ");
        }
        System.out.println();

        // 14. Diferencia entre elementos sucesivos
        int[] A14 = { 4, 6, 8, 2, 6, 9, 5, 1 };
        System.out.print("14) B = ");
        for (int i = 0; i < A14.length - 1; i++) {
            System.out.print(A14[i] - A14[i + 1] + " ");
        }
        System.out.println();

        // 15. Personas con sueldo promedio
        String[] nombres = { "Ana", "Luis", "Carlos" };
        double[] sueldos = { 1000, 1200, 1100 };
        double sumaSueldos = 0;

        for (int i = 0; i < sueldos.length; i++)
            sumaSueldos += sueldos[i];
        double promedio = sumaSueldos / sueldos.length;

        System.out.print("15) Sueldo promedio = " + promedio + " | Personas: ");
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] == promedio)
                System.out.print(nombres[i] + " ");
        }
    }
}
