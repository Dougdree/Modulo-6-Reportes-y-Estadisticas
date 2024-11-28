import java.util.List;

public class Reporte implements IReporte {

    private String titulo;           // Título del reporte.
    private TipoArchivo tipoArchivo; // Tipo de archivo para exportar.
    private TipoReporte tipoReporte; // Tipo de reporte (Diario, Semanal, Mensual).
    private Grafico grafico;         // Gráfico asociado al reporte.
    private List<Estadistica> estadisticas; // Relación con Estadistica (*)
    private List<Factura> facturas;

    // Constructor que inicializa el reporte con estadísticas.
    public Reporte(String titulo, TipoArchivo tipoArchivo, TipoReporte tipoReporte, Grafico grafico, List<Estadistica> estadisticas) {
        this.titulo = titulo;
        this.tipoArchivo = tipoArchivo;
        this.tipoReporte = tipoReporte;
        this.grafico = grafico;
        this.estadisticas = estadisticas; // Inicializa la relación.
    }

    // getter and setter de la relacion de Factura
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    // Getter y setter para estadisticas.
    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }

    // Método para agregar una estadística.
    public void agregarEstadistica(Estadistica estadistica) {
        this.estadisticas.add(estadistica); // Agrega la estadística a la lista.
    }

    // Métodos de la interfaz IReporte.
    @Override
    public void generarVentasTotales() {
        System.out.println("Generando ventas totales para el reporte: " + titulo);
        // Implementar la lógica para generar las ventas totales, puede ser sumando valores de las estadísticas.
    }

    @Override
    public void visualizarReporte() {
        System.out.println("Visualizando el reporte: " + titulo);
        grafico.generarPastel();  // Llama al método para generar el gráfico.
    }

    @Override
    public void exportarReporte() {
        System.out.println("Exportando reporte en formato: " + tipoArchivo);
        // Aquí puedes implementar la exportación real a archivo (PDF, imagen, etc.).
    }

    // Método para calcular todas las estadísticas.
    public void calcularEstadisticas() {
        for (Estadistica estadistica : estadisticas) {
            estadistica.calcularEstadistica();  // Llama a calcular la estadística de cada tipo.
        }
    }
}


