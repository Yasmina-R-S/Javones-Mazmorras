package JYM;

public class Mago extends Personaje {
	
	private int mana; // El maná del mago, básicamente su "gasolina" para lanzar hechizos

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        // Llamamos al constructor de la clase padre (Personaje) para inicializar nombre, nivel y vida
        super(nombre, nivel, puntosVida);
        this.mana = mana; // Guardamos el maná inicial del mago
    }

    // Getter y Setter para el maná
    public int getMana() {
        return mana; // Simplemente devuelve cuánta "gasolina mágica" tiene el mago
    }

    public void setMana(int mana) {
        if (mana >= 0) { // Nos aseguramos de que el maná no sea negativo, porque eso no tendría sentido
            this.mana = mana;
        } else {
            System.out.println("El mana no puede ser negativo."); // Avisamos si intentan poner un valor ilógico
        }
    }

    // Método para lanzar hechizos, gastando maná
    public void lanzarHechizo(int costoMana) {
        if (mana >= costoMana) { // Si tiene suficiente maná, puede lanzar el hechizo
            mana -= costoMana; // Restamos el maná gastado
            System.out.println(getNombre() + " ha lanzado un hechizo y ha gastado " + costoMana + " de mana.");
        } else {
            System.out.println(getNombre() + " no tiene suficiente mana para lanzar el hechizo."); // Aviso si no le alcanza el maná
        }
    }

    // Método para recargar maná
    public void recargarMana(int cantidad) {
        if (cantidad >= 0) { // No podemos recargar maná con números negativos, eso no tendría sentido
            mana += cantidad; // Sumamos el maná recargado
            System.out.println(getNombre() + " ha recargado " + cantidad + " de mana. Ahora tiene " + mana + " de mana.");
        } else {
            System.out.println("La cantidad de mana a recargar no puede ser negativa."); // Avisamos si intentan algo raro
        }
    }

    // Método para mostrar la información del mago
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase padre para mostrar la info general
        System.out.println("Mana: " + mana); // Y agregamos el maná del mago
    }
}
