package JYM;

public class Personaje {
	  // Atributos
    private String nombre;
    private int nivel;
    private int puntosVida;
    private Inventario inventario;

    // Constructor
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();
    }

    // Método para reducir los puntos de vida
    public void bajarVida(int vida) {
        if (vida > 0) {
            this.puntosVida -= vida;
            if (this.puntosVida < 0) {
                this.puntosVida = 0;
            }
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    // Agregar equipamiento al inventario
    public void agregarEquipamiento(Equipamiento item) {
        this.inventario.agregarEquipamiento(item);
    }
}