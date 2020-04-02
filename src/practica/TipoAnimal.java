package practica;

public class TipoAnimal extends Zoocenosis {

    public TipoAnimal(String nombre,String tipo){
        super(nombre,tipo);
        this.tipo=tipo;
        this.nombre=nombre;

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
        return "TipoAnimal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
