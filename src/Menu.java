import java.util.ArrayList;

public class Menu {
    // Atributos
    private String nombreRestaurante;
    private ArrayList<Receta> recetas;

    // Constructor
    public Menu(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.recetas = new ArrayList<>();
    }

    // Getter del nombre del restaurante
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    // Agregar una receta al menú
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
        System.out.println("Receta agregada: " + receta.getNombre());
    }

    // Reemplazar una receta en una posición específica (1-indexado para el usuario)
    public void reemplazarReceta(int posicion, Receta nuevaReceta) {
        if (posicion >= 1 && posicion <= recetas.size()) {
            Receta anterior = recetas.get(posicion - 1);
            recetas.set(posicion - 1, nuevaReceta);
            System.out.println(
                    "Receta \"" + anterior.getNombre() + "\" reemplazada por \"" + nuevaReceta.getNombre() + "\"");
        } else {
            System.out.println("Posición inválida. El menú tiene " + recetas.size() + " recetas.");
        }
    }

    // Imprimir solo los precios de cada receta
    public void imprimirPrecios() {
        System.out.println("\n===== PRECIOS DEL MENÚ - " + nombreRestaurante + " =====");
        for (int i = 0; i < recetas.size(); i++) {
            Receta r = recetas.get(i);
            System.out.println((i + 1) + ". " + r.getNombre() + " -> $" + String.format("%.2f", r.getPrecio()));
        }
        System.out.println("==========================================\n");
    }

    // Imprimir el menú completo con todos los detalles
    public void imprimirMenu() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("          MENÚ - " + nombreRestaurante);
        System.out.println("╚══════════════════════════════════════════╝");
        for (int i = 0; i < recetas.size(); i++) {
            Receta r = recetas.get(i);
            System.out.println("  " + (i + 1) + ". " + r.toString());
        }
        System.out.println("──────────────────────────────────────────\n");
    }
}
