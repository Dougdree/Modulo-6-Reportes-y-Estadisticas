// Clase que representa a un Producto del restaurante
public class Producto {
    // Atributos de un producto
    private String nombre;   // Nombre del producto
    private float precio;    // Precio del producto
    private String categoria; // Categoría del producto (ej: bebidas, comida)
    private int cantidad;    // Cantidad disponible del producto

    // Constructor de Producto
    public Producto(String nombre, float precio, int i) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
