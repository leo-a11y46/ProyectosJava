package T3P7_CuentaBancoEstatica;
import java.util.*;
/**
 *
 * @author AluDAM
 */
public class PruebaCuentaBanco {

    public static void main(String[] args) {
        CuentaBanco cb=new CuentaBanco(001, "Pedro", 0, false);
        CuentaBanco cb2=new CuentaBanco(002, "Jose", 0, false);
        CuentaBanco cb3=new CuentaBanco(003, "Alberto",0, false);
        
        //Ingresar dinero a cada cuenta
        cb.ingresarDinero(1000);
        cb2.ingresarDinero(1000);
        cb3.ingresarDinero(1000);

        //Imprimir valoreshola
        int resultadoTotalCuentas=CuentaBanco.getNumeroTotalCuentas();
        System.out.println("Se ha/n creado: "+resultadoTotalCuentas+" cuenta/s");

        int resultadoTotalSaldo=CuentaBanco.getSaldoTotalCuentas();
        System.out.println("El saldo total de todas las cuentas es: "+resultadoTotalSaldo);

        //Retirar 100 euros a cada cuenta
        cb.retirarDinero(100);
        cb2.retirarDinero(100);
        cb3.retirarDinero(100);

        //Imprimir valores
        resultadoTotalCuentas=CuentaBanco.getNumeroTotalCuentas();
        System.out.println("Se ha/n creado: "+resultadoTotalCuentas+" cuenta/s");

        resultadoTotalSaldo=CuentaBanco.getSaldoTotalCuentas();
        System.out.println("El saldo total de todas las cuentas es: "+resultadoTotalSaldo);
    }
}