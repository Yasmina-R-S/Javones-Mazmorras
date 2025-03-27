package JYM;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipamiento> equipamiento; // Lista donde guardaremos los objetos del inventario.

    // Constructor: se ejecuta cuando creamos un Inventario.
    public Inventario() {
        this.equipamiento = new ArrayList<>(); // Inicializamos la lista vacía.
    }

    // Método para agregar un objeto al inventario.
    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.equipamiento.add(equipamiento); // Añadimos el objeto a la lista.
        System.out.println(equipamiento.getNombre() + " ha sido añadido al inventario.");
    }

    // Método para mostrar los objetos en el inventario.
    public void mostrarInventario() {
        System.out.println("Inventario:");
        if (equipamiento.size() == 0) {  // Si la lista está vacía, avisamos al usuario.
            System.out.println("El inventario está vacío.");
        } else {
            for (Equipamiento e : equipamiento) { // Recorremos la lista y mostramos cada objeto.
                System.out.println("- " + e.getNombre() + " (" + e.getTipo() + ")");
            }
        }
    }

    // Métodos para obtener y cambiar la lista de equipamiento.
    public ArrayList<Equipamiento> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(ArrayList<Equipamiento> equipamiento) {
        this.equipamiento = equipamiento;
    }
}