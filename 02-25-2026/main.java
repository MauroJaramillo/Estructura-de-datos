public class main {
    public static void main(String[] args) {
        Inventario miTienda = new Inventario(5);

        miTienda.agregarProducto(new Producto(101, "Laptop", 1200.50, 10));
        miTienda.agregarProducto(new Producto(102, "Mouse", 25.0, 3));
        miTienda.agregarProducto(new Producto(103, "Teclado", 45.0, 2));

        System.out.println("Inventario Inicial:");
        miTienda.mostrarInventario();

        System.out.println("\nValor Total: $" + miTienda.generarInformeValorTotal());

        miTienda.ordenarPorPrecioDescendente();
        miTienda.mostrarInventario();

        System.out.println("\n--- Productos Agotados (< 5) ---");
        for (Producto p : miTienda.obtenerProductosAgotados()) {
            System.out.println(p);
        }
    }
}