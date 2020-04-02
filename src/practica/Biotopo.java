package practica;

public class Biotopo extends Ecosistema {

    public String nombre;
    public String tipo;

    public Biotopo(String nombre,String tipo){
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
        return "Biotopo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
