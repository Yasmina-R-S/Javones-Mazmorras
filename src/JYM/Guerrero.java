package JYM;

public class Guerrero extends Personaje {
    private boolean protegiendo;
    private Personaje companeroProtegido;

    public Guerrero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.protegiendo = false;
        this.companeroProtegido = null;
    }

    // Setters y Getters
    public boolean isProtegiendo() {
        return protegiendo;
    }

    public void setProtegiendo(boolean protegiendo) {
        this.protegiendo = protegiendo;
    }

    public Personaje getCompaneroProtegidoSetter() {
        return companeroProtegido;
    }

    public void setCompaneroProtegido(Personaje companeroProtegido) {
        this.companeroProtegido = companeroProtegido;
    }
    
    // Métodos específicos de Guerrero
    public void proteger(Personaje companero) {
        if (!protegiendo) {
            this.protegiendo = true;
            this.companeroProtegido = companero;
            System.out.println(getNombre() + " está protegiendo a " + companero.getNombre());
        } else {
            System.out.println(getNombre() + " ya está protegiendo a alguien.");
        }
    }

    public void dejarDeProteger() {
        if (protegiendo) {
            System.out.println(getNombre() + " ha dejado de proteger a " + companeroProtegido.getNombre());
            this.protegiendo = false;
            this.companeroProtegido = null;
        }
    }

    @Override
    public void bajarVida(int vida) {
        if (protegiendo && companeroProtegido != null) {
            int danoReducido = vida / 2;
            companeroProtegido.bajarVida(danoReducido);
            System.out.println("El daño a " + companeroProtegido.getNombre() + " fue reducido a la mitad gracias a la protección de " + getNombre());
        } else {
            super.bajarVida(vida);
        }
    }

    public boolean estaProtegiendo() {
        return protegiendo;
    }

    public Personaje getCompaneroProtegido() {
        return companeroProtegido;
    }

}
