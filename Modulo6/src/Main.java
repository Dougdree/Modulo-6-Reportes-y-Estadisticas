package Modulo6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(new Date(), "ProductoX", 5, 100.0, "EmpleadoY", "Mesa1");
        System.out.println("Total de la factura: " + factura.calcularTotal());

        Empleado empleado = new Empleado();
        empleado.registrarVenta();
        System.out.println("Venta registrada por el empleado.");

        Producto producto = new Producto();
        producto.actualizarCantidadVendida(5);
        System.out.println("Cantidad vendida del producto actualizada.");

        Mesa mesa = new Mesa();
        mesa.registrarUsoDeMesa();
        System.out.println("Uso de mesa registrado.");

        Reporte reporte = new Reporte(new Date(), new Date());
        reporte.generarReporte();
        System.out.println("Reporte generado.");
        System.out.println("Estadísticas: " + reporte.calcularEstadistica());

        boolean exportado = reporte.exportarReporte(TipoDeExportacion.PDF);
        System.out.println("Reporte exportado: " + (exportado ? "Sí" : "No"));
    }
}
