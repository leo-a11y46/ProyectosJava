package Ejercicios03.Ejercicio307;

import java.util.*;

public class PruebaLineaAutobus{
    public static void main(String[] args) {
        //Declarados en el main    
            Random rand= new Random();

            String numLinea;
            int frecuencia=rand.nextInt(16);
            int[] paradas=new int[7];
                int listaParadas;

            int cantidadLineaAutobuses=4; //Cambiar esta variable para crear mas o menos buses
            
        
            

        //Bucle para crear los objetos
            for (int i=0;i<=cantidadLineaAutobuses;i++){
                numLinea=""+rand.nextInt(1,34);
                frecuencia=rand.nextInt(16);
        
                //Bucle para rellenar array paradas
                for (int x=0;x<paradas.length;x++){
                    paradas[x]=rand.nextInt(200);
                }

                LineaAutobus lb=new LineaAutobus(numLinea, frecuencia, paradas);    
            }


        //Imprimir toString
            System.out.println(lb); //si tienes un toString y imprimes el objeto, imprime lb.toString() automaticamente
            System.out.println(lb2);
            System.out.println(lb3);
            System.out.println(lb4);
    }
}
