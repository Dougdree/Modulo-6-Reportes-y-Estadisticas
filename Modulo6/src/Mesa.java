// Clase que representa una mesa en el restaurante
public class Mesa {
    private int cantidadUso;      // Número de veces que la mesa fue utilizada
    private String codigoMesa;   // Código único que identifica la mesa (ejemplo: P1-M5)

    // Constructor
    public Mesa(int cantidadUso, String codigoMesa) {
        this.cantidadUso = cantidadUso;
        this.codigoMesa = codigoMesa;
    }

    // Método para obtener la cantidad de uso de la mesa
    public int getCantidadUso() {
        return cantidadUso;
    }

    // Método para actualizar la cantidad de uso de la mesa
    public void actualizarCantidadUso() {
        this.cantidadUso++;
    }

    // Método para obtener el código de la mesa
    public String getCodigoMesa() {
        return codigoMesa;
    }

    // Método para establecer el código de la mesa
    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }
}


