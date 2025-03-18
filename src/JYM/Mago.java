package JYM;

public class Mago extends Personaje {
	
	private int mana;
	
	public Mago(String nombre, int nivel, int puntosVida, int mana) {
		super(nombre, nivel, puntosVida);
		this.mana = mana;
	}
	
	public void lanzarHechizo(int costoMana) {
		 if (mana >= costoMana) {
	         mana -= costoMana;
	         System.out.println(getNombre() + " ha lanzado un hechizo y ha gastado " + costoMana + " de mana.");
	     } else {
	         System.out.println(getNombre() + " no tiene suficiente mana para lanzar el hechizo.");
	     }
	}
	
	public void recargarMana(int cantidad) {
        mana += cantidad;
        System.out.println(getNombre() + " ha recargado " + cantidad + " de mana. Ahora tiene " + mana + " de mana.");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Mana: " + mana);
    }
}
