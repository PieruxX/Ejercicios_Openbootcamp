public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Cliente
        Cliente cliente = new Cliente();
        // Crear un objeto de la clase Trabajador
        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(20);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("6679756");
        trabajador.setSalario("1200€");
        cliente.setEdad(25);
        cliente.setNombre("Piera");
        cliente.setTelefono("633987673");
        cliente.setCredito("X");

        // Imprimir clase Cliente y Clase trabajador
        System.out.println("--------- Clase Cliente ---------");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("El credito de Piera es " + cliente.getCredito());
        System.out.println("--------- Clase trabajador ---------");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("El salario de Juan es "+ trabajador.getSalario());





    }
}

class Persona{
    private int edad;
    private String telefono;
    private String nombre;


    public int getEdad(){

        return edad;
    }
    public void setEdad(int edad){

        this.edad=edad;
    }
    public String getTelefono(){
        return telefono;

    }
    public void setTelefono(String telefono){

        this.telefono=telefono;
    }
    public String getNombre(){
        return nombre;

    }
    public void setNombre(String nombre){

        this.nombre=nombre;
    }

}
// Clase Cliente que hereda de Persona
class Cliente extends Persona{

    private String credito;

    public String getCredito(){

        return credito;
    }
    public void setCredito(String credito){
        this.credito=credito;

    }
}

// Clase Trabajador que hereda de Persona
class Trabajador extends Persona{

    private String salario;

    public String getSalario(){

        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;



    }
}

