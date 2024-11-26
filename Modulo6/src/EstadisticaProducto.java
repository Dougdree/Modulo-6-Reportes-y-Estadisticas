// Clase que realiza cálculos de estadísticas para productos
public class EstadisticaProducto extends Estadistica {

    private String productoMasVendido; // Producto más vendido

    // Constructor que inicializa el título de la estadística
    public EstadisticaProducto(String titulo) {
        super(titulo); // Llama al constructor de la clase padre
    }

    // Implementación del cálculo específico para estadísticas de productos
    @Override
    public void calcularEstadistica() {
        System.out.println("Calculando estadísticas para los productos...");
        // Ejemplo de cómo se puede calcular (esto es solo un ejemplo)
        this.productoMasVendido = "Pizza"; // Este valor debe calcularse dinámicamente
    }

    // Método para calcular el producto más vendido, recibido nombre, cantidad y fecha
    // Este método es un ejemplo
    public String calcularMasVendido(String nombre, int cantidad, String fecha) {
        return "Producto: " + nombre + ", Cantidad vendida: " + cantidad + ", Fecha: " + fecha;
    }

    // Getter para el producto más vendido
    public String getProductoMasVendido() {
        return productoMasVendido;
    }
}


