// Clase que representa un ítem dentro de una factura.
public class ItemFactura {

    private Producto producto;  // Producto asociado al ítem.
    private int cantidad;       // Cantidad del producto.
    private float subtotal;     // Subtotal calculado para este ítem.

    // Constructor que inicializa el producto y la cantidad.
    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal(); // Calcula el subtotal automáticamente.
    }

    // Calcula el subtotal basado en el precio del producto y la cantidad.
    public float calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Getters y setters.
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        this.subtotal = calcularSubtotal(); // Actualiza el subtotal si cambia el producto.
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal(); // Actualiza el subtotal si cambia la cantidad.
    }

    public float getSubtotal() {
        return subtotal;
    }
}

