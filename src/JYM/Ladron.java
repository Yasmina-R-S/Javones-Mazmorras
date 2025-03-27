package JYM;

public class Ladron extends Personaje {
	  private int invisible; // 0 significa no invisible, 1 significa invisible

	    public Ladron(String nombre, int nivel, int puntosVida) {
	        super(nombre, nivel, puntosVida);
	        this.invisible = 0; // No está invisible por defecto
	    }

	    // Getter y Setter para invisible
	    public int getInvisible() {
	        return invisible;
	    }

	    public void setInvisible(int invisible) {
	        if (invisible == 0 || invisible == 1) { // Solo se permiten valores 0 o 1
	            this.invisible = invisible;
	        }
	    }

	    // Métodos específicos de Ladrón
	    public void robar() {
	        if (invisible == 1) { // Si está invisible, puede robar sin ser visto
	            System.out.println(getNombre() + " roba sin ser visto!");
	        } else {
	            System.out.println(getNombre() + " intenta robar, pero todos pueden verlo!");
	        }
	    }
}