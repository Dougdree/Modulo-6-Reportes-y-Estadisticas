// Clase base para manejar estadísticas generales
public abstract class Estadistica {

    protected String titulo;

    // Constructor que inicializa el título de la estadística
    public Estadistica(String titulo) {
        this.titulo = titulo;
    }

    // Método abstracto para que las subclases implementen su lógica específica de cálculo
    public abstract void calcularEstadistica();

    // Método para imprimir la estadística
    public void imprimirEstadistica() {
        System.out.println("Imprimiendo estadísticas para: " + titulo);
    }

    // Getter del título
    public String getTitulo() {
        return titulo;
    }
}

