import java.util.Scanner ;

public class Autos {
    public static void main(String[] args) {

        Autos2 auto1;
        Autos2 auto2;
        Autos2 auto3;

        auto1 = new Autos2("Chevrolet");
        auto2 = new Autos2("Nissan");
        auto3 = new Autos2("Toyota");

        auto1.setAnios(2010);
        auto2.setAnios(2023);
        auto3.setAnios(2004);

        auto1.setAgencia("ProAuto");
        auto2.setAgencia("Nissan");
        auto3.setAgencia("Casabaca");

        auto1.setColor("Negro");
        auto2.setColor("Gris");
        auto3.setColor("Blanco");

        auto1.setCosto(114000);
        auto2.setCosto(379900);
        auto3.setCosto(44663);

        auto1.setModelo("All New Tahoe");
        auto2.setModelo("Altima");
        auto3.setModelo("Fortuner");

        auto1.setKilometrage(1000);
        auto2.setKilometrage(2000);
        auto3.setKilometrage(1100);

        auto1.setVelocidad(230);
        auto2.setVelocidad(200);
        auto3.setVelocidad(250);


        System.out.println("------------------------");

        System.out.println("Marca:"+auto1.getMarca());
        System.out.println("Años:"+auto1.getAnios());
        System.out.println("Agencia:"+auto1.getAgencia());
        System.out.println("Costo:"+auto1.getCosto());
        System.out.println("Color:"+auto1.getColor());
        System.out.println("Modelo:"+auto1.getModelo());
        System.out.println("Velocida:"+auto1.getVelocidad());
        System.out.println("Kilometraje:"+auto1.getKilometrage());
        System.out.println("------------------------");
        System.out.println("Marca:"+auto2.getMarca());
        System.out.println("Años:"+auto2.getAnios());
        System.out.println("Agencia:"+auto2.getAgencia());
        System.out.println("Costo:"+auto2.getCosto());
        System.out.println("Color:"+auto2.getColor());
        System.out.println("Modelo:"+auto2.getModelo());
        System.out.println("Velocida:"+auto2.getVelocidad());
        System.out.println("Kilometraje:"+auto2.getKilometrage());
        System.out.println("------------------------");
        System.out.println("Marca:"+auto3.getMarca());
        System.out.println("Años:"+auto3.getAnios());
        System.out.println("Agencia:"+auto3.getAgencia());
        System.out.println("Costo:"+auto3.getCosto());
        System.out.println("Color:"+auto3.getColor());
        System.out.println("Modelo:"+auto3.getModelo());
        System.out.println("Velocida:"+auto3.getVelocidad());
        System.out.println("Kilometraje:"+auto3.getKilometrage());
        System.out.println("------------------------");
        System.out.println("Suma de los años: ");
        int suma = auto1.getAnios() + auto2.getAnios() + auto3.getAnios();

        System.out.printf("La suma de los años de los autos es de: %d", suma);

        auto1.setAnios(2000);
        auto2.setAnios(2005);

        auto1.setModelo("Nissan");
        auto1.setModelo("Autocab");
        System.out.println("------------------------");
        System.out.println("Valores nuevos");


        System.out.println("Ingrese el modelo del auto ");
        Scanner leer=new Scanner(System.in);

        String newauto2=leer.next();
        auto1.setModelo(newauto2);
        System.out.println("Nuevo Modelo: "+auto1.getModelo());

    }
}