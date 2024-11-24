// Clase que representa a una Persona con nombre e identificación
public class Persona {
    // Atributos básicos de una persona
    private String nombre;  // Nombre de la persona
    private String identificacion;  // Identificación de la persona

    // Constructor de la clase Persona
    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Métodos getters y setters para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
