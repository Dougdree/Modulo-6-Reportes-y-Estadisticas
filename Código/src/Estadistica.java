// Clase base para manejar estadísticas generales.
public abstract class Estadistica {

    // Título de la estadística.
    protected String titulo;

    // Constructor que inicializa el título de la estadística.
    public Estadistica(String titulo) {
        this.titulo = titulo;
    }

    // Método abstracto que las subclases deben implementar para calcular las estadísticas específicas.
    public abstract void calcularEstadistica();

    // Devuelve el título de la estadística.
    public String getTitulo() {
        return titulo;
    }
}


