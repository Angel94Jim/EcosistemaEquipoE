package practica;

public class Ecosistema {
    public static void main(String [] args)
    {
        String nombre=null,tipo=null;
        int cant=1;

        System.out.println("ECOSISTEMA\n");
        Biotopo biotopo=new Biotopo(nombre,tipo);
        Biocenosis biocenosis=new Biocenosis(nombre,tipo);

        Terreno terreno1=new Terreno("Desierto","Llanura");
        Terreno terreno2=new Terreno("Bosque","Templado");

        System.out.println("BIOTOPO");
        System.out.println(terreno1.toString());
        System.out.println(terreno2.toString());

        TipoAnimal animal1=new TipoAnimal("Tigre","Bengala");
        TipoAnimal animal2=new TipoAnimal("Ballena","Asesina");
        TipoPlanta planta1=new TipoPlanta("Seta","Champ");
        TipoPlanta planta2=new TipoPlanta("Orquidea","Azul");

        System.out.println("\nBIOCENOSIS:");
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());

        System.out.println(planta1.toString());
        System.out.println(planta2.toString());


    }

}
