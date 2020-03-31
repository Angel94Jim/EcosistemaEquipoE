package practica;

public class Biotopo extends Ecosistema {

    public String nombre;
    public String tipo;

    public Biotopo(String nombre,String tipo){

        Bosque bosque=new Bosque("Bosque","Templado");
        Desierto desierto=new Desierto("Desierto","Llanuras");
        Oceano oceano=new Oceano("Oceano","Pacifico");
        Polar polar=new Polar("Polo","norte");


        System.out.println("BIOTOPO");
        System.out.println(bosque.toString());
        System.out.println(desierto.toString());
        System.out.println(oceano.toString());
        System.out.println(polar.toString());
        System.out.println("\n");

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
}
