// Interfaz que define las operaciones básicas de un reporte.
public interface IReporte {

    // Genera un resumen total de ventas, desglosado según sea necesario.
    public void generarVentasTotales();

    // Visualiza el gráfico relacionado con el reporte.
    public void visualizarReporte();

    // Exporta el gráfico en un formato específico, como PDF o imagen.
    public void exportarReporte();
}
