package practica;

public class Microbiocenosis extends Biocenosis{

    public Microbiocenosis(String nombre, String tipo) {
        super(nombre, tipo);

        this.nombre=nombre;
        this.tipo=tipo;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public String toString() {
        return "Microbiocenosis{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
