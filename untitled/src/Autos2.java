public class Autos2 {
    public String marca;
    public String modelo ;
    public String Agencia ;
    public int costo;
    public int velocidad;
    public int kilometrage;

    public int anios;

    public String color;

    public Autos2(String nuevoMarca){

        marca=nuevoMarca;
    }
    public String getMarca(){
        return  marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return  velocidad;
    }
    public int getCosto(){
        return costo;
    }
    public  int getKilometrage(){
        return kilometrage;
    }

    public String getAgencia(){

        return  Agencia;
    }
    public String getColor(){

        return color;
    }
    public int getAnios(){
        return anios;
    }

    public void  setModelo(String newmodelo){
        this.modelo=newmodelo;
    }
    public void  setCosto(int newcosto){
        this.costo=newcosto;
    }
    public void  setColor(String newcolor){
        this.color=newcolor;
    }
    public void  setAgencia(String newagencia){
        this.Agencia=newagencia;
    }
    public void  setVelocidad(int newvelocida){
        this.velocidad=newvelocida;
    }
    public void  setKilometrage(int newkilometrage){
        this.kilometrage=newkilometrage;
    }
    public void  setAnios(int newanios){
        this.anios=newanios;
    }

}

