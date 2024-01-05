public class CartaNumerica extends Carta{

    private int numero;

    public CartaNumerica(){};

    public double sumarCartas(){
        int suma=0;
        suma+=numero;
        double conversion= (double) (suma);
        return conversion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
