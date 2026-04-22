import java.util.LinkedList;

public class HNavegacion {
    public static void main(String[] args) {
        // Instancia LinkedList
        LinkedList<String> navegacion = new LinkedList<>();
        // Agregar elementos a la LinkedList
        navegacion.add("google.com");
        navegacion.add("github.com");
        navegacion.add("stackoverflow.com");
        // Metodo getLast() elimina el ultimo elemento y muestra la pagina actual
        navegacion.removeLast();
        System.out.println("Pagina actual: " + navegacion.getLast());
        // Imprimir el historial bucle for-each
        System.out.println("Historial de navegacion:");
        for (String pagina : navegacion) {
            System.out.println(pagina);
        }
    }
}
