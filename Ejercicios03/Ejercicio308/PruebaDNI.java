package Ejercicios03.Ejercicio308;
import java.util.*;

public class PruebaDNI {
    public static void main(String[] args) {
        //Variables declaradas main
        Scanner input=new Scanner(System.in);

        /*Maneras de introducir "cadena"
        Introducir dni con scaner: System.out.print("Introduce tu DNI: ");
                                    =input.nextLine();
        */

        String cadena="12345678A";

        /*
        Ejemplo DNI: 12345678A
        Ejemplo NIF (Persona fisica): Igual que DNI: 12345678A
        Ejemplo NIF (Persona juridica): A12345678 
        Ejemplo NIE: X1234567A
        */

        //Aqui iria lo de esDNi, esNIE, etc

    }

    //Metodos del main

    static boolean esDNI(String cadena){
        //Variables declaradas esDNI
        boolean binario=false;

        comprobarLongitudDNI(cadena);
        comprobarParteNumericaDNI(cadena);
        comprobarUltimoDigitoDNI(cadena);


        if (comprobarLongitudDNI(cadena)==true && 
            comprobarParteNumericaDNI(cadena)==true && 
            comprobarUltimoDigitoDNI(cadena)==true) {

            binario=true;
        }
        
        if (binario){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean comprobarLongitudDNI(String cadena){
        if (cadena.length()!=9){
            return false;
        }
        else{
            return true;
        }
    }

    static boolean comprobarParteNumericaDNI(String cadena){ //Probablemente el caracter<'0' este mal y exista otra manera de hacerlo
        //Variables declaradas comprobarParteNumerica
        char caracter;
        
        for (int i=0;i<cadena.length();i++){
            caracter=cadena.charAt(i);

            if (caracter>'0' && caracter<'9'){
                return false;
            }
            else{
                return true;
            }
        }
    }

    static boolean comprobarUltimoDigitoDNI(String cadena){
        //variables declaradas comprobarUltimoDigitoDNI
        char caracter;
        
        caracter=cadena.charAt(cadena.length()-1);
        if (caracter<9 || caracter>=0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean esNIF(String cadena){ //me he quedado aqui, tengo que refactorizar los nombres de DNI-->NIF
        //Variables declaradas esNIF
        boolean binario=false;

        comprobarLongitudNIF(cadena);
        comprobarParteNumericaNIF(cadena);
        comprobarUltimoDigitoNIF(cadena);


        if (comprobarLongitudDNI(cadena)==true && 
            comprobarParteNumericaDNI(cadena)==true && 
            comprobarUltimoDigitoDNI(cadena)==true) {

            binario=true;
        }
        
        if (binario){
            return true;
        }
        else{
            return false;
        }
    }


}