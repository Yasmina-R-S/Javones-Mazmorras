package JYM;

public class Ladron extends Personaje {
	 private boolean invisible;

	 public Ladron(String nombre, int nivel, int puntosVida) {
	     super(nombre, nivel, puntosVida);
	     this.invisible = false;
	 }

	 // Métodos específicos de Ladron
	 public void robar() {
	     if (invisible) {
	         System.out.println(getNombre() + " roba sin ser visto!");
	     } else {
	         System.out.println(getNombre() + " intenta robar, pero todos pueden verlo!");
	     }
	 }

	 public void hacerseInvisible() {
	     this.invisible = !this.invisible;
	     if (invisible) {
	         System.out.println(getNombre() + " invisible.");
	     } else {
	         System.out.println(getNombre() + " no invisible.");
	     }
	 }

	 public boolean estaInvisible() {
	     return invisible;
	 }

	 // Setters y Getters
	 public boolean isInvisible() {
	     return invisible;
	 }

	 public void setInvisible(boolean invisible) {
	     this.invisible = invisible;
	 }
}
