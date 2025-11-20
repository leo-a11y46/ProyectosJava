package Ejercicios03.Ejercicio307;

import java.util.*;

public class PruebaLineaAutobus{
    public static void main(String[] args) {
        //Declarados en el main    
            Random rand= new Random();

            String numLinea1, numLinea2, numLinea3, numLinea4;

            int frecuencia1, frecuencia2, frecuencia3, frecuencia4;

            int[] paradas1, paradas2, paradas3, paradas4;


        //Introducir valores Autobus1
            numLinea1=""+rand.nextInt(50);

            frecuencia1=rand.nextInt(0,30);
            
            paradas1=new int[7];

            //Bucle para rellenar array paradas
            for (int x=0;x<paradas1.length;x++){
                    paradas1[x]=rand.nextInt(200);
            }
            
        //Introducir valores Autobus2
            numLinea2=""+rand.nextInt(50);

            frecuencia2=rand.nextInt(0,30);
            
            paradas2=new int[7];

            //Bucle para rellenar array paradas
            for (int x=0;x<paradas2.length;x++){
                    paradas2[x]=rand.nextInt(200);
            }

              

        //Introducir valores Autobus3
            numLinea3=""+rand.nextInt(50);

            frecuencia3=rand.nextInt(0,30);
            
            paradas3=new int[7];

            //Bucle para rellenar array paradas
            for (int x=0;x<paradas3.length;x++){
                    paradas3[x]=rand.nextInt(200);
            }

            

        //Introducir valores Autobus4
            numLinea4=""+rand.nextInt(50);

            frecuencia4=rand.nextInt(0,30);
            
            paradas4=new int[7];

            //Bucle para rellenar array paradas
            for (int x=0;x<paradas4.length;x++){
                    paradas4[x]=rand.nextInt(200);
            }

        //Crear los objetos
            LineaAutobus lb=new LineaAutobus(numLinea1, frecuencia1, paradas1);
            LineaAutobus lb2=new LineaAutobus(numLinea2, frecuencia2, paradas2);
            LineaAutobus lb3=new LineaAutobus(numLinea3, frecuencia3, paradas3);
            LineaAutobus lb4=new LineaAutobus(numLinea4, frecuencia4, paradas4);


        //Imprimir toString
            System.out.print(lb); //si tienes un toString y imprimes el objeto, imprime lb.toString() automaticamente
            lb.imprimirArray(paradas1);
            System.out.println(""+"\n-------------------------------------------");

            System.out.print(lb2);
            lb.imprimirArray(paradas2);
            System.out.println(""+"\n-------------------------------------------");

            System.out.print(lb3);
            lb.imprimirArray(paradas3);
            System.out.println(""+"\n-------------------------------------------");

            System.out.print(lb4);
            lb.imprimirArray(paradas4);
            System.out.println(""+"\n-------------------------------------------");

    }
}
