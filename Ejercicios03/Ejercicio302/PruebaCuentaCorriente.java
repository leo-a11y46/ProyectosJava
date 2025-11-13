package Ejercicios03.Ejercicio302;
import java.util.*;

public class PruebaCuentaCorriente {
    //metodos main
    static String numAleatorioMetodo(){
        //Variables declaradas metodo
        Random rand = new Random();
        
        int numAleatorio = rand.nextInt(100) + 1;
        String numAleatorioString = "" + numAleatorio;
        return numAleatorioString;
    }


    public static void main(String[] args) {
        //Declarar variables de main

        Scanner input=new Scanner(System.in);
    
        int opcion=0;

        double cantidad=0;

        boolean esTrue=false;


        CuentaCorriente cc = new CuentaCorriente(numAleatorioMetodo());
        CuentaCorriente cc2 = new CuentaCorriente(numAleatorioMetodo());
        
        do {
            System.out.println("--------------------");
            System.out.println("Selecciona operacion que deseas realizar: ");
            System.out.println("1-Ingresar en la cuenta "+cc.getnumCuenta());
            System.out.println("2-Ingresar en la cuenta "+cc2.getnumCuenta());

            System.out.println("3-Retirar en la cuenta "+cc.getnumCuenta());
            System.out.println("4-Retirar en la cuenta "+cc2.getnumCuenta());

            System.out.println("5-Visualizar datos ambas cuentas");
            System.out.println("6-Fin"); 

            System.out.print("Opcion a elegir: ");
            opcion=input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    cantidad=input.nextDouble();
                    input.nextLine();

                    cc.ingresaEfectivo(cantidad);
                    break;

                case 2:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    cantidad=input.nextDouble();
                    input.nextLine();

                    cc2.ingresaEfectivo(cantidad);
                    break;

                case 3:
                    System.out.print("Introduce la cantidad a retirar: ");
                    cantidad=input.nextDouble();
                    input.nextLine();

                    
                    esTrue=cc.retiraEfectivo(cantidad);

                    if (esTrue){
                        cc.getsaldo();
                    }
                    else{
                        System.out.println("No es posible realizar esa operacion, no tienes suficiente saldo, actualmente tienes "+cc2.getsaldo());
                    }
                    break;

                case 4:
                    System.out.print("Introduce la cantidad a retirar: ");
                    cantidad=input.nextDouble();
                    input.nextLine();

                    
                    esTrue=cc2.retiraEfectivo(cantidad);

                    if (esTrue){
                        cc2.getsaldo();
                    }
                    else{
                        System.out.println("No es posible realizar esa operacion, no tienes suficiente saldo, actualmente tienes "+cc2.getsaldo());
                    }
                    break;

                case 5:
                    cc.visualiza();
                    cc2.visualiza();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Error, introduce un numero del 1 al 6");
                    break;
            }


        } while(opcion!=6);
        
    }
}
