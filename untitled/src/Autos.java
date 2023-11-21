// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Autos {
    public static void main(String[] args) {

        Autos2 auto1;
        Autos2 auto2;
        Autos2 auto3;

        auto1 = new Autos2("Chevrolet");
        auto2 = new Autos2("Nissan");
        auto3 = new Autos2("Toyota");

        auto1.setAños(2010);
        auto2.setAños(2023);
        auto3.setAños(2004);

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

        System.out.println(auto1.getMarca());
        System.out.println(auto2.getMarca());
        System.out.println(auto3.getMarca());

        System.out.println(auto1.getAños());
        System.out.println(auto2.getAños());
        System.out.println(auto3.getAños());

        System.out.println(auto1.getAgencia());
        System.out.println(auto2.getAgencia());
        System.out.println(auto3.getAgencia());

        System.out.println(auto1.getCosto());
        System.out.println(auto2.getCosto());
        System.out.println(auto3.getCosto());

        System.out.println(auto1.getColor());
        System.out.println(auto2.getColor());
        System.out.println(auto3.getColor());

        System.out.println(auto1.getModelo());
        System.out.println(auto2.getModelo());
        System.out.println(auto3.getModelo());

        System.out.println(auto1.getVelocidad());
        System.out.println(auto2.getVelocidad());
        System.out.println(auto3.getVelocidad());

        System.out.println(auto1.getKilometrage());
        System.out.println(auto2.getKilometrage());
        System.out.println(auto3.getKilometrage());


    }
}