// Clase encargada de manejar la generación de gráficos.
public class Grafico {

    // Título del gráfico.
    private String titulo;

    // Constructor que inicializa el gráfico con su título.
    public Grafico(String titulo) {
        this.titulo = titulo;
    }

    // Genera un gráfico de tipo pastel basado en los datos.
    public void generarPastel() {
        System.out.println("Generando gráfico de pastel: " + titulo);
    }

    // Devuelve el título del gráfico.
    public String getTitulo() {
        return titulo;
    }

    // Permite actualizar el título del gráfico.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
