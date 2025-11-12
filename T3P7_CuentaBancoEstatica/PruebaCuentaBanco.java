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
        CuentaBanco cb2=new CuentaBanco(numC, titularC);
        CuentaBanco cb3=new CuentaBanco(numC, titularC);
        
        //Ingresar dinero a cada cuenta
        cb.ingresarDinero(500);
        cb2.ingresarDinero(555);
        cb3.ingresarDinero(500);

        int resultadoTotalCuentas=CuentaBanco.getNumeroTotalCuentas();
        System.out.println("Se ha/n creado: "+resultadoTotalCuentas+" cuenta/s");

        int resultadoTotalSaldo=CuentaBanco.getSaldoTotalCuentas();
        System.out.println("El saldo total de todas las cuentas es: "+resultadoTotalSaldo);
    }
}