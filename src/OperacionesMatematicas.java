public class OperacionesMatematicas {

    public int num1;
    public int num2;

    public OperacionesMatematicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma(){
        return num1+num2;
    }
    public double suma(int num1, int num2, int num3){
        return(num1+num2+num3)+5;
    }

    public double suma(double num1, double num2){
        return(num1+num2)+2;
    }

    public static void main(String[] args) {

        OperacionesMatematicas op=new OperacionesMatematicas(5,7);
        System.out.println("Suma1: "+op.suma());
        System.out.println("\nSuma2: "+op.suma(8,5,9));
        System.out.println("\nSuma3: "+op.suma(2.2,8.7));
    }

}
