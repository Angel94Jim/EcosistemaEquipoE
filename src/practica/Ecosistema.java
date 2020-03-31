package practica;

public class Ecosistema {
    public static void main(String [] args)
    {
        String nombre=null,tipo=null;

        System.out.println("ECOSISTEMA\n");
        Biotopo biotopo=new Biotopo(nombre,tipo);
        Biocenosis biocenosis=new Biocenosis(nombre,tipo);
    }

}
