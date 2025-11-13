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
         System.out.println("Se han ingresado "+cantidad+"$ a la cuenta "+this.numCuenta);
        
    }

    boolean retiraEfectivo(double cantidad){
        /*
         * Pedirá por teclado el importe que queremos retirar y comprobará que hay saldo suficiente.
         * Si hay saldo, restará el importe, y devolverá true, en caso contrario devolverá false y retirará el dinero.
         */

        if (cantidad>this.saldo){
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

    public double getsaldo(){
        return this.saldo;
    }
}
