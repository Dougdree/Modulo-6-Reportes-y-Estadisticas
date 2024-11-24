import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Mostrar el mensaje de bienvenida
        System.out.println("Bienvenido al sistema de estadísticas del restaurante\n");

        // Crear productos
        Producto producto1 = new Producto("Hamburguesa", 10.5f);
        Producto producto2 = new Producto("Pizza", 8.0f);
        Producto producto3 = new Producto("Ensalada", 5.0f);

        // Crear meseros
        Mesero mesero1 = new Mesero("Carlos", 20);
        Mesero mesero2 = new Mesero("Ana", 15);

        // Crear mesas
        Mesa mesa1 = new Mesa(5, "P1-M1");
        Mesa mesa2 = new Mesa(3, "P1-M2");

        // Crear factura
        List<Producto> productosFactura = Arrays.asList(producto1, producto2, producto3);
        Factura factura = new Factura(123, 50.0f, 5.0f, 7.0f, "2024-11-21", productosFactura);

        // Crear las estadísticas
        EstadisticaProducto estadisticaProducto = new EstadisticaProducto("Estadísticas de Productos");
        EstadisticaMesa estadisticaMesa = new EstadisticaMesa("Estadísticas de Mesas");
        EstadisticaMesero estadisticaMesero = new EstadisticaMesero("Estadísticas de Meseros");

        // Calcular las estadísticas
        estadisticaProducto.calcularEstadistica();
        estadisticaMesa.calcularEstadistica();
        estadisticaMesero.calcularEstadistica();

        // Mostrar las estadísticas calculadas
        System.out.println("Producto más vendido: " + estadisticaProducto.calcularMasVendido(producto1.getNombre(), 50, factura.getFecha()));
        System.out.println("Mesa más usada: " + estadisticaMesa.getMesaMasUsada() + " | Usos: " + mesa1.getCantidadUso() + " | Fecha: " + factura.getFecha());
        System.out.println("Mejor mesero: " + mesero1.getNombre() + " | Pedidos atendidos: " + mesero1.getPedidosAtendidos() + " | Fecha: " + factura.getFecha());

        // Generar reportes
        System.out.println("\nGenerando reportes...");
        Grafico graficoDiario = new Grafico("Reporte Diario");
        Grafico graficoSemanal = new Grafico("Reporte Semanal");
        Grafico graficoMensual = new Grafico("Reporte Mensual");

        // Mostrar los gráficos
        graficoDiario.generarPastel();
        graficoSemanal.generarPastel();
        graficoMensual.generarPastel();

        // Exportar reporte
        System.out.println("\nExportando reportes en diferentes formatos...");
        System.out.println("El reporte será exportado como: PDF");

        // Fin del sistema
        System.out.println("\nSistema finalizado. ¡Gracias por utilizar el sistema!");
    }
}


