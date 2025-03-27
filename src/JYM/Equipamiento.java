package JYM;

public class Equipamiento {
    private String nombre; // Aquí guardamos el nombre del equipamiento.
    private String tipo; // Aquí guardamos el tipo de equipamiento.

    // Constructor
    public Equipamiento(String nombre, String tipo) {
        this.nombre = nombre; // Guardamos el nombre que nos pasen.
        this.tipo = tipo; // Guardamos el tipo que nos pasen.
    }

    // Getters y Setters
    // Método para obtener el nombre del equipamiento.
    public String getNombre() {
        return nombre;
    }
    // Método para cambiar el nombre del equipamiento.
    public void setNombre(String nombre) {
        this.nombre = nombre; // Actualizamos el nombre con el valor que nos pasen.
    }
    // Método para obtener el tipo de equipamiento.
    public String getTipo() {
        return tipo;
    }
    // Método para cambiar el tipo de equipamiento.
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}