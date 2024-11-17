package Modulo6;

public class Producto {
    private String nombreDeProducto;
    private double precioDeProducto;
    private int cantidadVendida;

    public void actualizarCantidadVendida(int cantidadVendida) {
        this.cantidadVendida += cantidadVendida;
    }
}
