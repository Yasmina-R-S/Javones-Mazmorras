package JYM;

public class Mago extends Personaje {
	
	private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    // Getter y Setter para mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0) { // Aseguramos que el mana no sea negativo
            this.mana = mana;
        } else {
            System.out.println("El mana no puede ser negativo.");
        }
    }

    // Métodos específicos de Mago
    public void lanzarHechizo(int costoMana) {
        if (mana >= costoMana) {
            mana -= costoMana;
            System.out.println(getNombre() + " ha lanzado un hechizo y ha gastado " + costoMana + " de mana.");
        } else {
            System.out.println(getNombre() + " no tiene suficiente mana para lanzar el hechizo.");
        }
    }

    public void recargarMana(int cantidad) {
        if (cantidad >= 0) { // Aseguramos que la recarga no sea negativa
            mana += cantidad;
            System.out.println(getNombre() + " ha recargado " + cantidad + " de mana. Ahora tiene " + mana + " de mana.");
        } else {
            System.out.println("La cantidad de mana a recargar no puede ser negativa.");
        }
    }

    // Mostrar información del mago
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Mana: " + mana);
    }
}
