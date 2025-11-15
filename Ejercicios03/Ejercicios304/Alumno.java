package Ejercicios03.Ejercicios304;

import javax.sound.sampled.spi.AudioFileWriter;

public class Alumno {
//propiedades
        private String nombre;

        private float nota;

        private int edad;

    
//Constructor
    public Alumno(String n){
        this.nombre=n;

    }


//Metodos
    void ponNota(int n){
        this.nota=n;

    }

    static float notaMedia(Alumno[] array){
          //Declarados metodo
          float media=0f;
          int i=0;
          


          for (i=0;i<array.length;i++){
               media+=array[i].getNota();
          }
          return media/i;
     }

    static void ordenarArray(Alumno[] array){
        //Variables declaradas metodo
        Alumno[] temp=new Alumno[1];
        

        for (int i=0;i<array.length;i++){

            for (int x=i+1;x<array.length;x++){

                if ((array[x].getNota())>(array[i].getNota())){ //Ordena nota mayor a menor

                    temp[0]=array[x];
                    array[x]=array[i];
                    array[i]=temp[0];

                }
            }
        }
     }

     
    static void imprimirArray(Alumno[] array){
    /*
    * Los array que tienen objetos, hay que tratarlos como static, ya que al contener objetos no puedes manejar solo 1, sino todos los objetos a la vez, osea static=clase
    */
        for (int i=0;i<array.length;i++){
            System.out.println(array[i].getNombre());
        }
     }

     static void imprimirArrayConNota(Alumno[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i].getNombre()+": "+array[i].getNota());
        }
     }

    
    static void peorNota(Alumno[] array){
        //Variables declaradas metodo
        Alumno[] temp=new Alumno[1];
        int ultimaPosicionArray=(array.length)-1;
        

        for (int i=0;i<array.length;i++){

            for (int x=i+1;x<array.length;x++){

                if ((array[x].getNota())>(array[i].getNota())){ //Ordena nota mayor a menor

                    temp[0]=array[x];
                    array[x]=array[i];
                    array[i]=temp[0];

                }
            }
        }
        
        System.out.println(array[ultimaPosicionArray].getNombre()+" "+array[ultimaPosicionArray].getNota());
    }

//Getter
    public String getNombre(){
        return nombre;
    }

    public float getNota(){
        return nota;
    }

    public int getEdad(){
        return edad;
    }

//setter
    public void setNota(float nota){
        this.nota=nota;
    }
}
