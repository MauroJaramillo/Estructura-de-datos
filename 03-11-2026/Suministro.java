public class Suministro {
    String id;
    int nivelEnergia;
    String prioridad;

    public Suministro(String id, int nivelEnergia, String prioridad) {
        this.id = id;
        this.nivelEnergia = nivelEnergia;
        this.prioridad = prioridad;
    }

    public void mostrarSuministro() {
        System.out.println("ID: " + id + ", Nivel de Energía: " +
                nivelEnergia + ", Prioridad: " + prioridad);
    }

}
