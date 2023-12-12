// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public String nombre;
    public String  apellido;

    public int edad;

    public Main(String nombre) {
        this.nombre = nombre;

    }
    public Main(  ) {
        nombre = nombre;
        edad = edad;
    }
    public Main(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public  void imprimir(){
        System.out.println("Mi nombre es "+nombre+ "El apelido es: "+apellido+" La edad es: "+edad);
    }

    public  void imprimir(String nombre, String apellido, int edad){
        System.out.println("Mi nombre es "+nombre+ "El apellido es: "+apellido+" La edad es: "+edad);
    }
    public  void imprimir(String nombre, String apellido){
        System.out.println("Mi nombre es "+nombre+ "El apellido es: "+apellido+" La edad es: "+edad);
    }


    public static void main(String[] args) {

        Main m1=new Main("Monica");
        m1.imprimir();
        m1.imprimir(" Matias ","Lopez",12);
        m1.imprimir(" Mauricio ","Suarez");
    }
}