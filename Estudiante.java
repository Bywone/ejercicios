public class Estudiante {
    private static int numEstudiantes = 0;

    public Estudiante() {
        numEstudiantes++;
    }
    public static int obtenerNumeroEstudiantes() {
        return numEstudiantes;
    }
}
