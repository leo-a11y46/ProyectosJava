package Ejercicios03.Ejercicio307;

public class LineaAutobus {
    //Propiedades Objeto
        private String numLinea;

        private int frecuencia;

        private int[] paradas;

    //Constructor
        public LineaAutobus (String numLinea, int frecuencia, int[] paradas ) {
            this.numLinea=numLinea;
            this.frecuencia=frecuencia;
            this.paradas=paradas; //Aqui puede dar error porque no se si al ser un array hay que poner un []   
            
        }

    //Metodos
        public String toString(){
            /*Ejemplo:
                Línea: 34  Frecuencia: 15 minutos
                Paradas 152 – 14 – 178 – 195 – 45 – 66 – 39
            */
            return "Linea: "+this.numLinea+" Frecuencia: "+
                    this.frecuencia+" minutos"+
                    "\nParadas: ";
        }

        //Bucle para imprimir contenido array
        void imprimirArray(int[] array){
            for (int i=0;i<array.length;i++){
                System.out.print(array[i]+"--");
            }
        }
        

        
        

    //Setters


    //Getters
        public int[] getParadas(){
        return this.paradas;
    }

    //Metodos objeto
 }