// Interfaz que define las operaciones básicas de un reporte.
public interface IReporte {

    // Genera un resumen total de ventas, desglosado según sea necesario.
    void generarVentasTotales();

    // Visualiza el gráfico relacionado con el reporte.
    void visualizarGrafico();

    // Exporta el gráfico en un formato específico, como PDF o imagen.
    void exportarGrafico();
}
