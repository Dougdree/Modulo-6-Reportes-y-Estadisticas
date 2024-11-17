package Modulo6;

import java.util.Date;

public class Factura {
    private Date fecha;
    private String nombreProducto;
    private int cantidadProducto;
    private double precioProducto;
    private String nombreEmpleado;
    private String numeroMesa;

    public Factura(Date fecha, String nombreProducto, int cantidadProducto, double precioProducto, String nombreEmpleado, String numeroMesa) {
        this.fecha = fecha;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.numeroMesa = numeroMesa;
    }

    public double calcularTotal() {
        return cantidadProducto * precioProducto;
    }
}
