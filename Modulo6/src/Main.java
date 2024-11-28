import java.util.*;  // Importar utilidades necesarias como Date y List

public class Main {

    public static void main(String[] args) {

        // Mensaje de bienvenida
        System.out.println("Bienvenido al sistema de estadísticas del restaurante.\n");

        // Creación de productos (Ejemplo)
        Producto pizza = new Producto("Pizza", 10.0f, 3);  // Producto nombre, precio, cantidad
        Producto pasta = new Producto("Pasta", 8.0f, 5);  // Producto nombre, precio, cantidad

        // Creación de una factura (Ejemplo)
        List<Producto> productosFactura = new ArrayList<>();
        productosFactura.add(pizza);
        productosFactura.add(pasta);

        Factura factura = new Factura(1, 30.0f, 5.0f, 4.0f, "2024-11-26", productosFactura);
        factura.mostrarFactura();  // Mostrar la factura

        // Crear estadísticas de mesas
        List<Factura> facturas = new ArrayList<>();
        facturas.add(factura);  // Agregar la factura creada a la lista de facturas

        EstadisticaMesa estadisticaMesa = new EstadisticaMesa("Estadísticas de Mesas", facturas);
        estadisticaMesa.calcularEstadistica();  // Calcular las estadísticas
        System.out.println("Mesa más usada: " + estadisticaMesa.getMesaMasUsada() + "\n");

        // Crear estadísticas de meseros
        EstadisticaMesero estadisticaMesero = new EstadisticaMesero("Estadísticas de Meseros", facturas);
        System.out.println(estadisticaMesero.calcularMejorMesero("Juan", 10, "2024-11-26") + "\n");

        // Crear estadísticas de productos
        EstadisticaProducto estadisticaProducto = new EstadisticaProducto("Estadísticas de Productos");
        estadisticaProducto.calcularEstadistica();
        System.out.println("Producto más vendido: " + estadisticaProducto.getProductoMasVendido() + "\n");

        // Crear gráfico (Ejemplo)
        Grafico grafico = new Grafico("Ventas por Producto");
        grafico.generarPastel();  // Generar gráfico de pastel

        // Mostrar estadísticas
        estadisticaMesa.imprimirEstadistica();  // Imprimir estadísticas de mesa
        estadisticaMesero.imprimirEstadistica();  // Imprimir estadísticas de meseros
        estadisticaProducto.imprimirEstadistica();  // Imprimir estadísticas de productos

        // Mensaje de fin
        System.out.println("\nFin de la ejecución del sistema.");
    }
}



