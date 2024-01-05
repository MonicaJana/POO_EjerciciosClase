import java.util.Scanner;

public class CartaEspecial extends Carta{

    public CartaEspecial(){};

public void activarEfectoEspecial(){
    Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Desea activar efecto especial? ");
            System.out.print("Ingrese 1.si o 2.no: ");
            int in= sc.nextInt();
            if(in==1){
                System.out.print("Activaste efecto especial especial!! ");
            }
        }catch(Exception e ){
            System.out.println("Solo puede ingresar si o no");
        }
};

}
