package Ejercicios03.Ejercicio301;

public class Tamagotchi {
    //propiedades
    private String nombre;

    private int cantidadVida, maxVida;

    //Constructor
    public Tamagotchi(String nombre1, int maxVida1){
        this.nombre=nombre1;
        this.maxVida=maxVida1;
        this.cantidadVida=0;
    }

    //metodos
    void visualiza(){
        System.out.println("--------Estadisticas--------");
        System.out.println("El tamagotchi se llama: "+this.nombre);
        System.out.println(this.nombre+" tiene de vida maxima: "+this.maxVida);
        System.out.println(this.nombre+" tiene como vida actual "+this.cantidadVida);
    }

    void juega(){
        /*
         * Sólo puede jugar si cantidadVida>=1, 
         * esta acción restará 1 de cantidadVida y mostrará por pantalla 5 veces Estoy jugando.
         */

         if (this.cantidadVida<1){
            System.out.println(this.nombre+" no puede jugar porque no tiene vida.");
         }
         else {
            cantidadVida--;
            for (int i=1;i<=1;i++){ //el i<= tiene que ser i<=5
                System.out.println(this.nombre+" esta jugando:"+i);
            }
         }
    }

    void come(){
        /*
         * Sólo puede comer si cantidadVida<maxVida, 
         * esta acción sumará 1 de cantidadVida y mostrará por pantalla 5 veces Estoy comiendo
         */

         if (this.cantidadVida<this.maxVida){
            cantidadVida++;
            for (int i=1;i<=1;i++){ //el i<= tiene que ser i<=5
                System.out.println(this.nombre+" esta comiendo:");
            }
         }
         else {
            System.out.println(this.nombre+" no puede comer, esta demasiado lleno");
            
         }
    }

    //getter-setter
}
