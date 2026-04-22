import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class sistemaPedidos {
    // Instancia HashMap para almacenar los pedidos de los clientes
    private static final Map<String, LinkedList<String>> pedidos = new HashMap<>();
    public static void addPedido(String cliente, String producto) {
        // Crea la lista de pedidos para el cliente si no existe y agrega el producto a la lista
        pedidos.computeIfAbsent(cliente, k -> new LinkedList<>()).add(producto);
    }
    public static void main(String[] args) {
        // Agregar pedidos para diferentes clientes
        addPedido("Ana", "Camisa");
        addPedido("Ana", "Pantalon");
        addPedido("Luis", "Zapatos");
        // Imprimir si el cliente "Ana" tiene pedidos size()
        System.out.println("Ana tiene pedidos: " + pedidos.containsKey("Ana"));
        System.out.println("Numero de pedidos de Ana: " + pedidos.get("Ana").size());
        // Agregar un nuevo pedido para el cliente "Luis"
        pedidos.get("Luis").add("Gorra");
        // Imprimir los pedidos de cada cliente
        System.out.println("Pedidos de los clientes:");
        for (Map.Entry<String, LinkedList<String>> entry : pedidos.entrySet()) {
            System.out.println("Cliente: " + entry.getKey() + ", Productos: " + entry.getValue());
        }
    }
}
