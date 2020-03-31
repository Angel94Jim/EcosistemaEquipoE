package practica;

public class Biocenosis extends Ecosistema {

    public String nombre;
    public String tipo;

    public Biocenosis(String nombre,String tipo){


        Zoocenosis zoocenosis=new Zoocenosis("Tigre","Bengala");
        Fitocenosis fitocenosis= new Fitocenosis("Seta","Champ");

        System.out.println("BIOCENOSIS");
        System.out.println(zoocenosis.toString());
        System.out.println(fitocenosis.toString());
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
