package Ejercicios03.Ejercicios304;

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

     static

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
