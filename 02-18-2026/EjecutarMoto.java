public class EjecutarMoto {
    public static void main(String[] args) {

        // Creación de un arreglo de objetos de tipo Moto y almacenados en cada posición
        // del arreglo
        Moto[] m = new Moto[8];
        m[0] = new Moto(2026, "AKT", "Negra", 125, 1250);
        m[1] = new Moto(2025, "Ninja", "Verde", 400, 25000);
        m[2] = new Moto(2026, "Honda", "Roja", 350, 5000);
        m[3] = new Moto(2024, "Honda C90", "Dorado Negro", 90, 4000);
        m[4] = new Moto(2025, "Yamaha", "Azul", 250, 15000);
        m[5] = new Moto(2026, "Susuki", "Blanco", 125, 1250);
        m[6] = new Moto(2025, "BMW", "Verde", 400, 25000);
        m[7] = new Moto(2026, "Harley Davidson", "Roja", 350, 5000);

        // Operaciones con el arreglo de objetos

        //Obtener el promedio de los modelos de las motos del arreglo
        double promedioModelos = 0;
        int sumaModelos = 0;
        for (int i = 0; i < m.length; i++) {
            sumaModelos += m[i].getModelo();
        }
        promedioModelos = (double) sumaModelos / m.length;
        System.out.println("El promedio de los modelos es: " + promedioModelos);

        //obtener las motos que puedo comprar con un presupuesto de 20000
        System.out.println("Motos que puedo comprar con un presupuesto de 20000:");
        for (int i = 0; i < m.length; i++) {
            if (m[i].getPrecio() <= 20000) {
                System.out.println(m[i].getMarca() + " " + m[i].getModelo());
            }
        }
    }
}