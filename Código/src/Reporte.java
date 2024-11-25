// Clase que implementa la interfaz IReporte y maneja reportes.
public class Reporte implements IReporte {

    private String titulo;           // Título del reporte.
    private TipoArchivo tipoArchivo; // Tipo de archivo para exportar.
    private TipoReporte tipoReporte; // Tipo de reporte (Diario, Semanal, Mensual).
    private Grafico grafico;         // Gráfico asociado al reporte.

    // Constructor que inicializa el reporte con título, tipo de archivo, tipo de reporte y gráfico.
    public Reporte(String titulo, TipoArchivo tipoArchivo, TipoReporte tipoReporte, Grafico grafico) {
        this.titulo = titulo;
        this.tipoArchivo = tipoArchivo;
        this.tipoReporte = tipoReporte;
        this.grafico = grafico;
    }

    public Reporte(String reporteDiario, TipoArchivo tipoArchivo, Grafico gráficoDiario) {
        this.titulo = reporteDiario;
        this.tipoArchivo = tipoArchivo;
    }

    // Getters y setters para el tipo de reporte.
    public TipoReporte getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(TipoReporte tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    // Métodos de la interfaz IReporte (sin cambios).
    @Override
    public void generarVentasTotales() {
        System.out.println("Generando ventas totales para el reporte: " + titulo);
    }

    @Override
    public void visualizarGrafico() {
        grafico.generarPastel();
    }

    @Override
    public void exportarGrafico() {
        System.out.println("Exportando gráfico en formato: " + tipoArchivo);
    }
}

