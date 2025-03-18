package JYM;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipamiento> equipamiento;

    // Constructor
    public Inventario() {
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

    // Getters y Setters
    public ArrayList<Equipamiento> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(ArrayList<Equipamiento> equipamiento) {
        this.equipamiento = equipamiento;
    }
}