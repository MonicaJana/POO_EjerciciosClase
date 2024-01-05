import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carta c=new Carta();
        Scanner sc =new Scanner(System.in);
        int op= 1;
        do {
            String nombre="";
            System.out.println("Bienvenido al juego!");
            int jug=c.jugar();
            if (jug==1){
                CartaEspecial es=new CartaEspecial();
                es.activarEfectoEspecial();

            } else if (jug==2) {
                CartaNumerica cm= new CartaNumerica();
                System.out.print("Ingrese el número de la carta: ");
                int num=sc.nextInt();
                cm.setNumero(num);


            }else{
                System.out.println("No hay la opcion!");
            }

            System.out.println("\nDesea ingresar otra carta?");
            System.out.print("Ingrese 1.si o 2.no: ");
            op= sc.nextInt();

        }while(op==1);


    }
}