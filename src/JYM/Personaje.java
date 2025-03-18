package JYM;

public class Personaje {
	// Atributos
	private String Nombre;
	private int Nivel;
	private int PuntosVida;
	private Inventario Inventario;
	
	 // Constructor
		public Personaje(String nombre, int nivel, int puntosVida) {
		    this.Nombre = nombre;
		    this.Nivel = nivel;
		    this.PuntosVida = puntosVida;
		    this.Inventario = new Inventario();
		}	
		
		// Método para reducir los puntos de vida
	    public void bajarVida(int vida) {
	        if (vida > 0) {
	            this.PuntosVida -= vida;
	            if (this.PuntosVida < 0) {
	                this.PuntosVida = 0;
	            }
	        }
	    }
	    // Getters y Setters
	    public String getNombre() {
	        return Nombre;
	    }

	    public void setNombre(String nombre) {
	        this.Nombre = nombre;
	    }

	    public int getNivel() {
	        return Nivel;
	    }

	    public void setNivel(int nivel) {
	        this.Nivel = nivel;
	    }

	    public int getPuntosVida() {
	        return PuntosVida;
	    }

	    public void setPuntosVida(int puntosVida) {
	        this.PuntosVida = puntosVida;
	    }

	    public Inventario getInventario() {
	        return Inventario;
	    }

	    public void setInventario(Inventario inventario) {
	        this.Inventario = inventario;
	    }

	    // Agregar equipamiento al inventario
	    public void agregarEquipamiento(Equipamiento equipamiento) {
	    	this.Inventario.agregarEquipamiento(equipamiento);
	    }
	}