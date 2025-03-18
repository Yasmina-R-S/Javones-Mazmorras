package JYM;

public class Personaje {
	// Atributos
	private String Nombre;
	private int Nivel;
	private int PuntosVida;
	private Inventario Inventario;
		
			
	// El constructor es un método especial que se llama al crear un objeto de la clase.
	// Constructor			// en vez de int se puede utilizar double para decimales.
	public Personaje (String Titular, int Cantidad) {
		this.Nombre = Nombre;
		this.Nivel = Nivel;
		this.PuntosVida = PuntosVida;
		this.Inventario = Inventario;
	}	
	 // Constructor
		public Personaje(String nombre, int nivel, int puntosVida) {
		    this.Nombre = nombre;
		    this.Nivel = nivel;
		    this.PuntosVida = puntosVida;
		    this.Inventario = new Inventario();
		}	
}