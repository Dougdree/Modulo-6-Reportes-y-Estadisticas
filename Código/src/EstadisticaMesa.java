// Clase que realiza cálculos de estadísticas para las mesas
public class EstadisticaMesa extends Estadistica {

    private String mesaMasUsada; // Mesa más utilizada

    // Constructor que inicializa el título de la estadística
    public EstadisticaMesa(String titulo) {
        super(titulo); // Llama al constructor de la clase padre
    }

    // Implementación del cálculo específico para estadísticas de mesas
    @Override
    public void calcularEstadistica() {
        // Simulando un cálculo para obtener la mesa más usada
        System.out.println("Calculando estadísticas para las mesas...");

        // Aquí puedes incluir la lógica real para calcular la mesa más usada
        // Por ejemplo: calcular a partir de datos reales, en lugar de un valor hardcodeado
        this.mesaMasUsada = "Mesa 1"; // Ejemplo de resultado de la estadística
    }

    // Getter para la mesa más usada
    public String getMesaMasUsada() {
        return mesaMasUsada;
    }

    // Método para imprimir la estadística calculada
    public void imprimirEstadistica() {
        System.out.println("Mesa más utilizada: " + mesaMasUsada);
    }
}






