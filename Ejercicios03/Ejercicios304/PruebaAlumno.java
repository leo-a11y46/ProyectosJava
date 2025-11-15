package Ejercicios03.Ejercicios304;
import java.util.*;
public class PruebaAlumno {
     public static void main(String[] args) {
     //Declarados en el main
          Alumno[] listaAlumnos=new Alumno[5];

          Scanner input=new Scanner(System.in);

          String nombreAlumno="";
          float notaAlumno=0.0f;



     //Bucle pide nombre 5 alumnos y los añade al array
          for (int i=0;i<listaAlumnos.length;i++){
               System.out.print("Introduce nombre de alumno "+(i+1)+":");
               nombreAlumno=input.nextLine();
               listaAlumnos[i]=new Alumno(nombreAlumno);
          }
          
     System.out.println("---------------");

     //Bucle pide 5 notas y los añade al array
          for (int i=0;i<listaAlumnos.length;i++){
               System.out.print("Introduce la nota del alumno "+listaAlumnos[i].getNombre()+":");
               notaAlumno=(float)input.nextDouble();
               input.nextLine();

               listaAlumnos[i].setNota(notaAlumno);
          }
          
     System.out.println("---------------");

     //Nota media
          System.out.println("La nota media de los alumnos es: "+Alumno.notaMedia(listaAlumnos));

     //Ordenar array
          Alumno.ordenarArray(listaAlumnos);

     //Imprimir array ordenado de mayor a menor
          System.out.println("Lista alumnos ordenador mayor a menor");
          Alumno.imprimirArrayConNota(listaAlumnos);

     //Imprimir alumno del array con peor nota
     System.out.print("Alumno con peor nota es: ");
     Alumno.peorNota(listaAlumnos);

        
     }
}
