/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gp8_ejerc1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp8_Ejerc1 {

    public static void main(String[] args) {
        
        CuentaBancariaService cuenta1=new CuentaBancariaService();
        
        CuentaBancaria cuentaGold = cuenta1.crearCuenta();
        Scanner sc = new Scanner(System.in);
        int opc;
        
        
       do {
            
        
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Deposito");
        System.out.println("2. Extraccion");
        System.out.println("3. Extraccion Rapida");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Consultar Datos");
        System.out.println("6. Salir");
        opc = sc.nextInt();
        
        
        switch (opc) {
            case 1:
                    cuenta1.ingresarDinero(cuentaGold);
                break;
            case 2:
                    cuenta1.retirarDinero(cuentaGold);
                break;
            case 3:
                    cuenta1.extraccionRapida(cuentaGold);
                break;
            case 4:
                    cuenta1.consultarSaldo(cuentaGold);
                break;
            case 5:
                    cuenta1.consultarDatos(cuentaGold);
                break;
            case 6:
                    System.out.println("Buenas Tardes");
                break;

        }
        } while (opc != 6);
        
        
    }
}
