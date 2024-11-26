import java.util.List;

public class EstadisticaMesa extends Estadistica {

    private String mesaMasUsada; // Mesa más utilizada
    private List<Factura> facturas; // Relación con Factura (*)

    // Constructor que inicializa el título de la estadística
    public EstadisticaMesa(String titulo, List<Factura> facturas) {
        super(titulo); // Llama al constructor de la clase padre
        this.facturas = facturas; // Inicializa la relación
    }

    // Implementación del cálculo específico para estadísticas de mesas
    @Override
    public void calcularEstadistica() {
        System.out.println("Calculando estadísticas para las mesas...");
        this.mesaMasUsada = "Mesa 1"; // Ejemplo de resultado de la estadística
        // Aquí puedes agregar lógica para calcular las estadísticas basadas en las facturas.
    }

    // Getter para la mesa más usada
    public String getMesaMasUsada() {
        return mesaMasUsada;
    }

    // Getter y setter para facturas
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}




