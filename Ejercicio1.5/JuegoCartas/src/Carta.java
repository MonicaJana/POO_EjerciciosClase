import java.util.Scanner;

public class Carta {
    private String nombre;

    public Carta(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int jugar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Carta Especial");
        System.out.println("2. Carta Numerica");
        System.out.print("Ingrese un numero: ");
        int num=sc.nextInt();
        return num;
    }
    public void mostrarDescricion(){
        System.out.println("E l nombre de la carta es: "+nombre);

    }
}
