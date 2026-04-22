import java.util.HashMap;
import java.util.Map;

public class directorioProductos {
    // Instancia HashMap
    private static HashMap<Integer, String> productos = new HashMap<>();
    // Metodo para agregar productos al HashMap
    public static void addProducto(int id, String nombre) {
        productos.put(id, nombre);
    }
    public static void main(String[] args) {
        // Agregar elementos a la HashMap
        addProducto(101, "Laptop"); 
        addProducto(102, "Mouse");
        addProducto(103, "Teclado");
        // Metodo containsKey() verifica si el producto con ID 102 existe
        System.out.println(productos.containsKey(102));
        // Intentar agregar un producto con ID 101, que ya existe
        addProducto(101, "PC Gamer");
        // Imprimir el directorio de productos
        System.out.println("Directorio de productos:");
        for (Map.Entry<Integer, String> entry : productos.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Producto: " + entry.getValue());
        }
    }
    

}
