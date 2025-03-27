package JYM;

public class Ladron extends Personaje {
    private int invisible; // 0 significa que el ladrón es visible, 1 significa que es invisible

    public Ladron(String nombre, int nivel, int puntosVida) {
        // Llamamos al constructor de la clase padre (Personaje) para inicializar nombre, nivel y vida
        super(nombre, nivel, puntosVida);
        this.invisible = 0; // Por defecto, el ladrón no es invisible
    }

    // Getter y Setter para la invisibilidad
    public int getInvisible() {
        return invisible; // Devuelve si el ladrón está invisible o no
    }

    public void setInvisible(int invisible) {
        if (invisible == 0 || invisible == 1) { // Solo aceptamos 0 (visible) o 1 (invisible)
            this.invisible = invisible;
        }
    }

    // Método para robar
    public void robar() {
        if (invisible == 1) { // Si el ladrón es invisible, nadie lo ve robar
            System.out.println(getNombre() + " roba sin ser visto!");
        } else {
            System.out.println(getNombre() + " intenta robar, pero todos pueden verlo!"); // Si no es invisible, lo pillan 😬
        }
    }
}