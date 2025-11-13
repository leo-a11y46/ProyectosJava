package Ejercicios03.Ejercicio302;
import java.util.*;

public class CuentaCorriente {
    //Propiedades
    private String numCuenta;

    private double saldo;

    Scanner input=new Scanner(System.in);

    //Constructor
    public CuentaCorriente(String numCuenta){
        this.numCuenta=numCuenta;

    }

    //metodos
    void ingresaEfectivo(double cantidad){
        /*
         * Pedirá por teclado el importe que queremos ingresar y se lo sumará al saldo
         */

         this.saldo+=cantidad;
         System.out.println("Se han ingresado "+cantidad+"$ a tu cuenta");
        
    }

    boolean retiraEfectivo(double cantidad){
        /*
         * Pedirá por teclado el importe que queremos retirar y comprobará que hay saldo suficiente.
         * Si hay saldo, restará el importe, y devolverá true, en caso contrario no retirará el dinero y devolverá false.
         */

        if (cantidad>this.saldo){
            System.out.println("No es posible realizar esa operacion, no tienes suficiente saldo");
            return false;
         }
        else if (cantidad<0){
            saldo--;
            return true;
         }
        return false;
    }

    void visualiza(){
        System.out.println("Tu numero de cuenta es: "+this.numCuenta);
        System.out.println("La cuenta "+this.numCuenta+" dispone de "+this.saldo+"$");
    }

    //getter-setter
    public String getnumCuenta(){
        return this.numCuenta;
    }
}
