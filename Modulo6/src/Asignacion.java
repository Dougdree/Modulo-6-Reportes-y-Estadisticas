import java.util.Date;  // Importar la clase Date para manejar fechas.

public class Asignacion {

    private String codigoAsignacion;  // Código único de la asignación.
    private String descripcion;      // Descripción de la asignación.
    private Date fecha;              // Fecha en la que se realiza la asignación.

    // Constructor que inicializa los atributos de la asignación.
    public Asignacion(String codigoAsignacion, String descripcion, Date fecha) {
        this.codigoAsignacion = codigoAsignacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Getters y setters.
    public String getCodigoAsignacion() {
        return codigoAsignacion;
    }

    public void setCodigoAsignacion(String codigoAsignacion) {
        this.codigoAsignacion = codigoAsignacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Método para mostrar la asignación en el formato deseado para el terminal.
    public void mostrarAsignacion() {
        System.out.println("Asignación realizada:");
        System.out.println("Código de asignación: " + codigoAsignacion);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha);
        System.out.println();  // Agregar espacio para mejor visualización.
    }
}


