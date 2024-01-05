public class Futbol {
    public  String nombreEquipo;

    public int numJugadores;

    public Futbol(String nombreEquipo, int numJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.numJugadores = numJugadores;
    }
    public static void correr(){

        System.out.println("\nRecorrido 200 metros");
    }

    public static void main(String[] args) {

        correr();
    }
}
