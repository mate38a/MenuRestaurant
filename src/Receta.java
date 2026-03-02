public class Receta {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Receta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Mostrar la receta formateada
    @Override
    public String toString() {
        return nombre + " - $" + String.format("%.2f", precio);
    }
}
