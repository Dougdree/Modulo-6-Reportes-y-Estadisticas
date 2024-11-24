// Clase que realiza cálculos de estadísticas para los meseros
public class EstadisticaMesero {

    private String mejorMesero; // El mesero que atendió más pedidos

    // Constructor vacío, puedes inicializar mejorMesero cuando sea necesario
    public EstadisticaMesero(String estadísticasDeMeseros) {
    }

    // Método para calcular el mejor mesero basado en los pedidos atendidos
    public String calcularMejorMesero(String nombre, int pedidosAtendidos, String fecha) {
        // Lógica para calcular el mesero con mejor desempeño
        // Aquí se podría agregar más lógica si se necesitara, pero por ahora es una salida directa
        return "Mesero: " + nombre + ", Pedidos atendidos: " + pedidosAtendidos + ", Fecha: " + fecha;
    }

    // Getter y Setter
    public String getMejorMesero() {
        return mejorMesero;
    }

    public void setMejorMesero(String mejorMesero) {
        this.mejorMesero = mejorMesero;
    }

    // Método vacío, pero se puede usar si necesitas implementar más cálculos
    public void calcularEstadistica() {
        // Aquí puedes añadir lógica para calcular otras estadísticas si es necesario
    }

    // Método para imprimir la estadística
    public void imprimirEstadistica(String nombre, int pedidosAtendidos, String fecha) {
        System.out.println("Calculando estadísticas para los meseros...");
        System.out.println("Mejor mesero: " + nombre + ", Pedidos atendidos: " + pedidosAtendidos + ", Fecha: " + fecha);
    }
}


