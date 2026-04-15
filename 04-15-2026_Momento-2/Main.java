public class Main {
    public static void main(String[] args) {

        Puerto p = new Puerto();

        // -------------------------
        // CREAR CONTENEDORES
        // -------------------------
        Contenedor c1 = new Contenedor("C1", 1000, 5);
        Contenedor c2 = new Contenedor("C2", 800, 9);
        Contenedor c3 = new Contenedor("C3", 600, 3);
        Contenedor c4 = new Contenedor("C4", 500, 10);
        Contenedor c5 = new Contenedor("C5", 700, 7);

        // -------------------------
        // MODULO 1: MANIFIESTO
        // -------------------------
        p.agregarContenedor(c1);
        p.agregarContenedor(c2);
        p.agregarContenedor(c3);
        p.agregarContenedor(c4);
        p.agregarContenedor(c5);

        System.out.println("\n--- MANIFIESTO ---");
        p.mostrarManifiesto();

        System.out.println("\nPeso total: " + p.pesoTotal());

        // -------------------------
        // MODULO 2: PATIO (MATRIZ)
        // -------------------------
        System.out.println("\n--- UBICANDO EN PATIO ---");
        p.ubicarEnPatio(c1);
        p.ubicarEnPatio(c2);
        p.ubicarEnPatio(c3);

        System.out.println("\n--- PATIO ---");
        p.mostrarPatio();

        // -------------------------
        // MODULO 3: COLA (FIFO)
        // -------------------------
        System.out.println("\n--- INSPECCION ---");
        p.enviarAInspeccion(c2);
        p.enviarAInspeccion(c4);

        p.atenderInspeccion();
        p.atenderInspeccion();

        // -------------------------
        // MODULO 4: PILA (LIFO)
        // -------------------------
        System.out.println("\n--- CARGANDO BUQUE ---");
        p.cargarBuque(c1);
        p.cargarBuque(c2);
        p.cargarBuque(c3);

        System.out.println("\n--- BUQUE ---");
        p.mostrarBuque();

        // -------------------------
        // RETO: ELIMINAR CON PILA AUXILIAR
        // -------------------------
        System.out.println("\n--- ELIMINANDO C2 ---");
        p.eliminarContenedor("C2");

        System.out.println("\n--- BUQUE FINAL ---");
        p.mostrarBuque();
    }
}