package practica;

public class Bosque{

    public String nombre;
    public String tipo;

    public Bosque(String nombre, String tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Bosque{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
