package practica;

public class Zoocenosis extends Biocenosis {

    public String nombre;
    public String tipo;

    public Zoocenosis(String nombre, String tipo) {
        super(nombre,tipo);
        this.nombre=nombre;
        this.tipo=tipo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Zoocenosis{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
