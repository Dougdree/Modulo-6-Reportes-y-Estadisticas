package Modulo6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reporte implements Estadistica {
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> datosEstadisticos;

    public Reporte(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.datosEstadisticos = new ArrayList<>();
    }

    public void generarReporte() {
        // Implementación del reporte
    }

    public void filtrarDatos() {
        // Implementación del filtrado
    }

    public boolean exportarReporte(TipoDeExportacion tipo) {
        // Implementación de exportación en el formato deseado
        return true;
    }

    @Override
    public String calcularEstadistica() {
        return "Estadísticas calculadas";
    }

    @Override
    public void generarGrafico() {
        // Implementación para generar gráfico
    }
}
