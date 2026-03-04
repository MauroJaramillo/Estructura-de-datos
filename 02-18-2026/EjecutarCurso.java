public class EjecutarCurso {
    public static void main(String[] args) {

        Curso[] cursos = new Curso[3];

        cursos[0] = new Curso(1, "Matemáticas", "Juan", 30);
        cursos[1] = new Curso(2, "Programación", "Ana", 25);
        cursos[2] = new Curso(3, "Física", "Carlos", 20);

        int totalEstudiantes = 0;

        for (int i = 0; i < cursos.length; i++) {
            totalEstudiantes += cursos[i].cantidadEstudiantes;
        }

        System.out.println("Cursos creados: " + cursos.length);
        System.out.println("Estudiantes en total: " + totalEstudiantes);
    }
}