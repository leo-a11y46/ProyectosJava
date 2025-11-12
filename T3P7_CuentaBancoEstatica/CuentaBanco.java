package T3P7_CuentaBancoEstatica;
public class CuentaBanco {
   //Propiedades
    private String numero, 
                    titular;

   private double saldo;

   private boolean bloqueada;

   private static int numeroTotalCuentas=0, SaldoTotalCuentas=0;
   
   /*
    *Además vamos a sobrecargar el constructor de forma que ahora
    recibamos como parámetros de entrada: el número de la cuenta a
    crear, el nombre del titular, el saldo inicial y su estado de bloqueo.
    */

   //Constructor
    CuentaBanco(int numC, String titularC){
        String numCString=Integer.toString(numC);
        this.numero=numCString;
        this.titular=titularC;
        this.bloqueada=false;
        this.saldo=0.0;
        numeroTotalCuentas++;
    }

    CuentaBanco(int numC,
                String titularC,
                double saldoInicial,
                boolean bloqueo){
        
        this.numero=numC+"";
        this.titular=titularC+"";
        this.saldo=saldoInicial;
        this.bloqueada=bloqueo;
        numeroTotalCuentas++;
    }
    
    //Metodos
        //Se puede estando bloqueado
        double ConsultarSaldo(){
            return this.saldo;
        }
        
        void ingresarDinero(double cantidad){
            if (bloqueada==true){
                System.out.println("Cuenta bloqueada");
            }else {
                saldo += cantidad;
                SaldoTotalCuentas+=cantidad;
                System.out.println("Se ha ingreado "+cantidad+" euros, a la cuenta "+numero);
            }
            
        }
        
        void retirarDinero(double cantidad){
            if (bloqueada==true){
                System.out.println("Cuenta bloqueada");
            }
            else if (cantidad>this.saldo || cantidad<=0){
                System.out.println("Mensaje error");
            } else{
                saldo-=cantidad;
                System.out.println("Se han retirado "+cantidad+" euros, de la cuenta "+numero);
                SaldoTotalCuentas-=cantidad;
            }
        }
        
        void cambioTitular(String nuevoTitular){
            int longitud=nuevoTitular.length();
            if (bloqueada==true){
                System.out.println("Cuenta bloqueada");
            }
            else if (longitud<1){
                System.out.println("El nombre del nuevo titular no puede estar vacio");
            }else {
                this.titular=nuevoTitular;
            }
        }
        
        void bloquear(){
            if (bloqueada==true){
                System.out.println("Ya esta bloqueada");
            }else {
                this.bloqueada = true;
            }
            
        }
        
        //Se puede estando bloqueado
        void desbloquear(){
            this.bloqueada=false;
        }
        
        //Se puede estando bloqueado
        void imprimirDatos(){
            System.out.println("El numero de esta cuenta es: "+this.numero);
            System.out.println("El titular de esta cuenta es: "+this.titular);
            System.out.println("Esta cuenta tiene de saldo: "+this.saldo);
            System.out.println("Esta esta cuenta bloqueada? "+this.bloqueada);
        
        }

        public static int getNumeroTotalCuentas(){
            return numeroTotalCuentas;
        }

        public static int getSaldoTotalCuentas(){
            return SaldoTotalCuentas;
        }
}