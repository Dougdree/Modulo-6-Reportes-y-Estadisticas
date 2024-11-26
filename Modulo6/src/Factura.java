import java.util.List;  // Para manejar listas de productos

// Clase que representa una Factura emitida en el restaurante
public class Factura {

    // Atributos de la factura
    private int numero;        // Número único de la factura
    private float montoTotal;  // Monto total de la factura
    private float descuento;   // Descuento aplicado a la factura
    private float impuesto;    // Impuesto aplicado
    private String fecha;      // Fecha de emisión
    private List<Producto> productos; // Lista de productos incluidos en la factura

    // Constructor de Factura
    public Factura(int numero, List<Producto> productos, String fecha) {
        this.numero = numero;
        this.productos = productos;
        this.fecha = fecha;
        // Calculamos el monto total, descuento e impuestos
        this.montoTotal = calcularMontoTotal();
        this.descuento = calcularDescuento();
        this.impuesto = calcularImpuesto();
    }

    public Factura(int numero, float v, float v1, float v2, String date, List<Producto> productosFactura) {
        this.numero = numero;
        this.productos = productosFactura;
        this.montoTotal = v;
        this.descuento = v1;
        this.impuesto = v2;
        this.fecha = date;
        this.montoTotal = calcularMontoTotal();
        this.descuento = calcularDescuento();
        this.impuesto = calcularImpuesto();
    }

    // Método que calcula el monto total sumando los precios de los productos
    private float calcularMontoTotal() {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();  // Suponiendo que Producto tiene getPrecio y getCantidad
        }
        return total;
    }

    // Método que calcula el descuento (porcentaje) sobre el monto total
    private float calcularDescuento() {
        // Ejemplo de descuento, podrías tener tu lógica personalizada aquí
        return montoTotal * 0.10f;  // 10% de descuento
    }

    // Método que calcula el impuesto (porcentaje) sobre el monto total
    private float calcularImpuesto() {
        // Ejemplo de impuesto, podrías tener tu lógica personalizada aquí
        return montoTotal * 0.18f;  // 18% de impuesto
    }

    // Método para mostrar la factura
    public void mostrarFactura() {
        System.out.println("Factura Nº: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + ": " + producto.getPrecio() + " x " + producto.getCantidad());
        }
        System.out.println("Descuento: " + descuento);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Monto Total: " + montoTotal);
    }

    // Método toString para representar la factura de manera más simple
    @Override
    public String toString() {
        return "Factura Nº: " + numero + ", Fecha: " + fecha + ", Monto Total: " + montoTotal;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

