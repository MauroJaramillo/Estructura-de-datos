public class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario(int capacidad) {
        this.productos = new Producto[capacidad];
        this.contador = 0;
    }

    // Agregar Producto al inventario
    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("Inventario lleno. No se pueden agregar más productos.");
        }
    }

    // Buscar por ID
    public Producto buscarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) {
                return productos[i];
            }
        }
        return null;
    }

    // Actualizar Stock
    public void actualizarStock(int id, int nuevaCantidad) {
        Producto p = buscarPorId(id);
        if (p != null) {
            p.setCantidadStock(nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    // Generar informa del valor total
    public double generarInformeValorTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += productos[i].getPrecio() * productos[i].getCantidadStock();
        }
        return total;
    }

    // Obtener productos agotados
    public Producto[] obtenerProductosAgotados() {
        int countAgotados = 0;
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                countAgotados++;
            }
        }
        Producto[] agotados = new Producto[countAgotados];
        int index = 0;
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                agotados[index++] = productos[i];
            }
        }
        return agotados;
    }

    // Ordenar por precio descendente
    public void ordenarPorPrecioDescendente() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (productos[j].getPrecio() < productos[j + 1].getPrecio()) {
                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
        System.out.println("Productos ordenados por precio.");
    }

    // mostrar inventario
    public void mostrarInventario() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }
}