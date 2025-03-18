package JYM;

import java.util.ArrayList;

public class Inventario {

	public class inventario {
		private ArrayList<Equipamiento> equipamiento = new ArrayList<>();

	    // Constructor
	    public inventario() {
	        this.equipamiento = new ArrayList<>();
	    }

	 // Método para agregar equipamiento
	    public void agregarEquipamiento(Equipamiento item) {
	        equipamiento.add(item);
	    }

	    // Método para mostrar el inventario
	    public void mostrarInventario() {
	        System.out.println("Inventario:");
	        for (Equipamiento item : equipamiento) {
	            System.out.println("- " + item.getNombre() + " (" + item.getTipo() + ")");
	        }
	    }

	    // Método para obtener la lista de equipamiento

		public ArrayList<Equipamiento> getEquipamiento() {
			return equipamiento;
		}

		public void setEquipamiento(ArrayList<Equipamiento> equipamiento) {
			this.equipamiento = equipamiento;
		}
	}
}