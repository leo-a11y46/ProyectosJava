package T3P7_CuentaBancoEstatica;
import java.util.*;
/**
 *
 * @author AluDAM
 */
public class PruebaCuentaBanco {

    public static void main(String[] args) {
        int numC=5;
        String titularC="Jose";
        CuentaBanco cb=new CuentaBanco(numC, titularC);
        
        double saldoIngresado=200; //Cambiar esta variable para ingresar mas o menos saldo
        cb.ingresarDinero(saldoIngresado);
        System.out.println("He ingresado "+saldoIngresado);

        double cbSaldo=cb.ConsultarSaldo(); 
        System.out.println("Mi cuenta tiene de saldo: "+cbSaldo);
        
        double saldoRetirado=50; //Cambiar esta variable para retirar mas o menos saldo
        cb.retirarDinero(saldoRetirado);
        System.out.println("He retirado "+saldoRetirado);
        
        cbSaldo=cb.ConsultarSaldo();
        System.out.println(cbSaldo);
        
        cb.imprimirDatos();

        int resultadoTotalCuentas=CuentaBanco.getNumeroTotalCuentas();
        System.out.println("Se ha/n creado: "+resultadoTotalCuentas+" cuenta/s");
    }
}