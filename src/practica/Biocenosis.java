package practica;

public class Biocenosis extends Ecosistema {

    public String nombre;
    public String tipo;

    public Biocenosis(String nombre,String tipo){

        this.nombre=nombre;
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Biocenosis{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
