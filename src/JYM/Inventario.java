package JYM;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipamiento> equipamiento;

    // Constructor
    public Inventario() {
        this.equipamiento = new ArrayList<>();
    }

    // Método para agregar equipamiento
    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.equipamiento.add(equipamiento);
        System.out.println(equipamiento.getNombre() + " ha sido añadido al inventario.");
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        if (equipamiento.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Equipamiento e : equipamiento) {
                System.out.println("- " + e.getNombre() + " (" + e.getTipo() + ")");
            }
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