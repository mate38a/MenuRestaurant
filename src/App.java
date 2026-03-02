import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Crear el menú del restaurante
        Menu menu = new Menu("La Cocina de Mateo");

        // 1. Añadir 5 recetas al menú
        menu.agregarReceta(new Receta("Bandeja Paisa", 25000));
        menu.agregarReceta(new Receta("Ajiaco Santafereño", 18000));
        menu.agregarReceta(new Receta("Carne Asada con Papas", 22000));
        menu.agregarReceta(new Receta("Sancocho de Gallina", 16000));
        menu.agregarReceta(new Receta("Arroz con Pollo", 15000));

        System.out.println("\n¡Bienvenido al restaurante " + menu.getNombreRestaurante() + "!");

        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Menú interactivo con while loop
        while (continuar) {
            System.out.println("===== ¿Qué desea hacer? =====");
            System.out.println("1. Ver menú completo (nombres y precios)");
            System.out.println("2. Ver solo los precios");
            System.out.println("3. Reemplazar la 3ra receta por opción vegana");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // 4. Imprimir el menú completo
                    menu.imprimirMenu();
                    break;

                case 2:
                    // 3. Imprimir los precios de las recetas
                    menu.imprimirPrecios();
                    break;

                case 3:
                    // 2. Reemplazar la 3ra receta por una opción vegana
                    Receta recetaVegana = new Receta("Ensalada Vegana de Quinoa", 14000);
                    menu.reemplazarReceta(3, recetaVegana);
                    break;

                case 4:
                    System.out.println("\n¡Gracias por visitar " + menu.getNombreRestaurante() + "! ¡Hasta pronto!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor seleccione entre 1 y 4.");
                    break;
            }
        }

        scanner.close();
    }
}
