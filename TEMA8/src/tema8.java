/**public class tema8 {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("coupe");
        coche.setVelocidadmaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("scotter");
        moto.setVelocidadmaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadmaxima());
        System.out.println(" ¿Es rápido? "+ coche.isRapido());
        System.out.println(moto.getTipo() + " " + moto.getVelocidadmaxima() + " ¿Es rápido? "+ moto.isRapido());

    }
}

class Vehiculo{
    private String tipo;
    private int velocidadmaxima;
    private boolean rapido;

    public void setRapido(boolean rapido){
        this.rapido = rapido;
    }
    public boolean isRapido(){
        return this.rapido;
    }


    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
} **/
public class tema8 {
    public static void main(String[] args) {

    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadmaxima;
    private String sonido;

    abstract public void setSonido(String sonido);
    abstract public String getsonido();
    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public int getVelocidadmaxima() {return velocidadmaxima;}

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}


