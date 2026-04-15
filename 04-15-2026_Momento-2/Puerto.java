import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Puerto {

    // MODULO 1 (Arreglo)
    Contenedor[] manifiesto = new Contenedor[10];
    int contador = 0;

    // MODULO 2 (Matriz)
    Contenedor[][] patio = new Contenedor[3][3];

    // MODULO 3 (Cola)
    Queue<Contenedor> inspeccion = new LinkedList<>();

    // MODULO 4 (Pila)
    Stack<Contenedor> buque = new Stack<>();

    // Modulo 1: Manifiesto
    public void agregarContenedor(Contenedor C) {
        if (contador < manifiesto.length) {
            manifiesto[contador] = C;
            contador++;
        } else {
            System.out.println("Manifiesto lleno");
        }
    }
    public void mostrarManifiesto() {
        for (int i = 0; i < contador; i++) {
            System.out.println(manifiesto[i]);
        }
    }
    public double pesoTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += manifiesto[i].getPeso();
        }
        return total;
    }

    // Modulo 2: Matriz
    public void ubicarEnPatio(Contenedor C) {
        boolean agregado = false;
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] == null) {
                    patio[i][j] = C;
                    agregado = true;
                    System.out.println("Ubicado en [" + i + "][" + j + "]");
                    break;
                }
            }
            if (agregado) {
                break;
            }
            if (!agregado) {
                System.out.println("Patio lleno");
            }
        }
        
    }
    public void mostrarPatio() {
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] != null) {
                    System.out.println("[" + patio[i][j].getId() + "]");
                } else {
                    System.out.println("[]");
                }
            }
            System.out.println();
        }
    }

    // Modulo 3: Cola
    public void enviarAInspeccion(Contenedor C) {
        inspeccion.add(C);
        System.out.println("Enviado a inspección: " + C.getId());
    }
    public void atenderInspeccion() {
        if (!inspeccion.isEmpty()) {
            Contenedor C = inspeccion.poll();
            System.out.println("Revisando: " + C.getId());
        } else {
            System.out.println("No hay contenedores en inspección");
        }
    }

    // Modulo 4: Pila
    public void cargarBuque(Contenedor C) {
        //Bono
        if (buque.isEmpty()) {
            buque.push(C);
        } else {
            if (C.peso <= buque.peek().getPeso()) {
                buque.push(C);
            } else {
                System.out.println("No se puede cargar " + C.getId() + " porque es más pesado que " + buque.peek().getId());
            }
        }
    }
    public void mostrarBuque() {
        for (int i = 0; i < buque.size(); i++) {
            System.out.println(buque.get(i));
        }
    }

    //Reto usar una pila auxiliar
    public void eliminarContenedor(String id) {
        Stack<Contenedor> aux = new Stack<>();
        boolean encontrado = false;

        while (!buque.isEmpty()) {
            Contenedor C = buque.pop();
            if (!C.getId().equals(id)) {
                aux.push(C);
            } else {
                encontrado = true;
                System.out.println("Contenedor " + id + " eliminado del buque");
            }
        }
        while (!aux.isEmpty()) {
            buque.push(aux.pop());
        }
    }
}