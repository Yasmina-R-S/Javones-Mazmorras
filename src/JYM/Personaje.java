package JYM;

public class Personaje {
	// Atributos (cosas que definen al personaje)
    private String nombre; // Nombre del personaje
    private int nivel; // Nivel del personaje
    private int puntosVida; // Cantidad de vida del personaje
    private Inventario inventario; // Cada personaje tiene su propio inventario

    // Constructor: se ejecuta cuando creamos un personaje.
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre; // Guardamos el nombre que le pasamos al crear el personaje
        this.nivel = nivel; // Guardamos el nivel
        this.puntosVida = puntosVida; // Guardamos la cantidad de vida
        this.inventario = new Inventario(); // Inicializamos el inventario vacío
    }

    // Método para bajar la vida del personaje cuando recibe daño
    public void bajarVida(int vida) {
        if (vida > 0) { // Nos aseguramos de que el daño sea positivo
            this.puntosVida -= vida; // Restamos la cantidad de vida que recibe como daño
            if (this.puntosVida < 0) { // Si la vida baja de 0, la dejamos en 0 (no hay vida negativa)
                this.puntosVida = 0;
            }
        }
    }

    // Métodos para obtener (get) y modificar (set) los atributos del personaje.
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

    // Método para agregar equipamiento al inventario del personaje
    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.inventario.agregarEquipamiento(equipamiento); // Llamamos al método del inventario
    }

    // Método para mostrar la información del personaje en pantalla
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosVida);
    }
}