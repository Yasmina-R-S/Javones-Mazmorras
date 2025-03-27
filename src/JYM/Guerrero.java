package JYM;

public class Guerrero extends Personaje {
	private int protegiendo; // 0 para no proteger, 1 para proteger
    private Personaje compañeroProtegido; // Objeto vacío cuando no hay compañero protegido

    // Constructor: Se ejecuta cuando creamos un Guerrero.
    public Guerrero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida); // Llamamos al constructor de la clase padre (Personaje).
        this.protegiendo = 0; // Por defecto, el Guerrero no está protegiendo a nadie.
        this.compañeroProtegido = new Personaje("", 0, 0); // Inicializamos con un personaje "vacío".
    }

    // Métodos para obtener y cambiar el estado de "protegiendo".
    public int getProtegiendo() {
        return protegiendo;
    }

    public void setProtegiendo(int protegiendo) {
        if (protegiendo == 0 || protegiendo == 1) { // Solo aceptamos 0 o 1 para evitar errores.
            this.protegiendo = protegiendo;
        }
    }

    // Métodos para obtener y cambiar el personaje protegido.
    public Personaje getCompaneroProtegido() {
        return compañeroProtegido;
    }

    public void setCompaneroProtegido(Personaje companeroProtegido) {
        if (companeroProtegido != null) { // Si el personaje es válido, lo asignamos.
            this.compañeroProtegido = companeroProtegido;
        } else {
            this.compañeroProtegido = new Personaje("", 0, 0); // Si es nulo, lo reiniciamos a vacío.
        }
    }

    // Método para que el Guerrero empiece a proteger a otro personaje.
    public void proteger(Personaje companero) {
        if (protegiendo == 0 && companero.getPuntosVida() > 0) { // Solo protege si no está protegiendo a alguien y el otro personaje sigue vivo.
            this.protegiendo = 1; // Activamos el modo "protegiendo".
            this.compañeroProtegido = companero; // Guardamos a quién protege.
            System.out.println(getNombre() + " está protegiendo a " + companero.getNombre());
        } else {
            System.out.println(getNombre() + " ya está protegiendo a alguien o el compañero está derrotado.");
        }
    }

    // Método para dejar de proteger a un personaje.
    public void dejarDeProteger() {
        if (protegiendo == 1) { // Solo puede dejar de proteger si estaba protegiendo.
            System.out.println(getNombre() + " ha dejado de proteger a " + compañeroProtegido.getNombre());
            this.protegiendo = 0; // Ya no está protegiendo.
            this.compañeroProtegido = new Personaje("", 0, 0); // Reiniciamos el personaje protegido.
        }
    }

    // Método para bajar la vida del Guerrero o del personaje protegido.
    @Override
    public void bajarVida(int vida) {
        if (protegiendo == 1 && compañeroProtegido.getPuntosVida() > 0) { // Si está protegiendo a alguien y sigue vivo...
            int dañoReducido = vida / 2; // Se reduce el daño a la mitad.
            compañeroProtegido.bajarVida(dañoReducido); // Se le resta la mitad del daño al protegido.
            System.out.println("El daño a " + compañeroProtegido.getNombre() + " fue reducido a la mitad gracias a " + getNombre());
        } else {
            super.bajarVida(vida); // Si no está protegiendo, recibe el daño normal.
        }
    }
}