// Clase Mesero que hereda de Persona
public class Mesero extends Persona {
    private static final String identificacion = "Mesero";
    // Atributo específico de los meseros
    private int pedidosAtendidos; // Cantidad de pedidos atendidos por el mesero

    // Constructor que incluye los atributos de Persona
    public Mesero(String nombre, int pedidosAtendidos) {
        super(nombre, identificacion); // Llama al constructor de la clase padre (Persona)
        this.pedidosAtendidos = pedidosAtendidos;
    }

    // Método para actualizar el número de pedidos atendidos
    public void actualizarPedidosAtendidos(int nuevosPedidos) {
        this.pedidosAtendidos += nuevosPedidos;
    }

    // Getters y setters para pedidosAtendidos
    public int getPedidosAtendidos() {
        return pedidosAtendidos;
    }

    public void setPedidosAtendidos(int pedidosAtendidos) {
        this.pedidosAtendidos = pedidosAtendidos;
    }
}
