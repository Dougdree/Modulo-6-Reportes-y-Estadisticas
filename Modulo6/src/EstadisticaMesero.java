import java.util.List;

public class EstadisticaMesero extends Estadistica {

    private String mejorMesero; // El mesero que atendió más pedidos
    private List<Factura> facturas; // Relación con Factura (*)

    // Constructor que inicializa el título de la estadística
    public EstadisticaMesero(String titulo, List<Factura> facturas) {
        super(titulo); // Llama al constructor de la clase padre
        this.facturas = facturas; // Inicializa la relación
    }

    // Método para calcular el mejor mesero basado en los pedidos atendidos
    public String calcularMejorMesero(String nombre, int pedidosAtendidos, String fecha) {
        return "Mesero: " + nombre + ", Pedidos atendidos: " + pedidosAtendidos + ", Fecha: " + fecha;
    }

    // Getter y Setter para facturas
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    // Getter y Setter para mejorMesero
    public String getMejorMesero() {
        return mejorMesero;
    }

    public void setMejorMesero(String mejorMesero) {
        this.mejorMesero = mejorMesero;
    }

    // Método vacío, pero se puede usar si necesitas implementar más cálculos
    @Override
    public void calcularEstadistica() {
        // Implementar la lógica específica para calcular la estadística del mesero
    }
}



