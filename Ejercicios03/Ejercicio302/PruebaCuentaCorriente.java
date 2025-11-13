package Ejercicios03.Ejercicio302;
import java.util.*;

public class PruebaCuentaCorriente {
    //Inicializacion main
    static Random rand = new Random();

    Scanner input=new Scanner(System.in);

    //metodos main
    static String numAleatorioMetodo(){
        int numAleatorio = rand.nextInt(100) + 1;
        String numAleatorioString = "" + numAleatorio;
        return numAleatorioString;
    }

    //Codigo main
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(numAleatorioMetodo());
        CuentaCorriente cc2 = new CuentaCorriente(numAleatorioMetodo());
        
        do {

            System.out.println("Selecciona operacion que deseas realizar: ");
            System.out.println("1-Ingresar en la cuenta "+cc.getnumCuenta());
            System.out.println("2-Ingresar en la cuenta "+cc2.getnumCuenta());

            System.out.println("3-Retirar en la cuenta "+cc.getnumCuenta());
            System.out.println("4-Retirar en la cuenta "+cc2.getnumCuenta());

            System.out.println("5-Visualizar datos ambas cuentas");
            System.out.println("6-Fin"); 
            
            int opcion=input.nextInt();
            input.nextline();


        } while();
        
    }
}
