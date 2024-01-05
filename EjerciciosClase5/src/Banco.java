public class Banco {
    public String nombre;
    public int cedula;

    public Banco(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
     public void Registro_Usuario(){
         System.out.println("     Datos personales");
     }
     public void R_cuenta_bancaria(){
         System.out.println("Cuenta registrada con éxito!");
     }

    public static void main(String[] args) {
        Banco ban1= new Banco("Monica",1752366342);
        ban1.Registro_Usuario();
        System.out.println("Nombre: "+ban1.nombre);
        System.out.println("Ci: "+ban1.cedula);
        ban1.R_cuenta_bancaria();
    }
}
