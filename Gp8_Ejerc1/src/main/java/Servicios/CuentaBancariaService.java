/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class CuentaBancariaService {

    private final Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        int numeroCuenta = (int) (Math.random() * 10000 + 1);
        cuenta1.setNumeroCuenta(numeroCuenta);

        System.out.println("Ingrese el nombre del Titular de la cuenta: ");
        cuenta1.setNombreTitular(leer.nextLine());
        System.out.println("Ingrese el DNI del titular de la cuenta; ");
        cuenta1.setDniCliente(leer.nextLong());
        System.out.println("Su número de cuenta es " + numeroCuenta);

        return cuenta1;

    }

    public double ingresarDinero(CuentaBancaria cuenta1) {

        double ingreso;
        double saldo = cuenta1.getSaldoActual();

        System.out.println("Ingrese el monto a depositar: ");
        ingreso = leer.nextDouble();
        cuenta1.setSaldoActual(ingreso + saldo);
        System.out.println("Su saldo actual es " + cuenta1.getSaldoActual());
        return cuenta1.getSaldoActual();

    }

    public double retirarDinero(CuentaBancaria cuenta1) {

        double egreso;
        double saldo = cuenta1.getSaldoActual();

        System.out.println("Ingrese el monto a retirar: ");
        egreso = leer.nextDouble();
        if (egreso > saldo) {
            System.out.println("Retiro " + saldo);
            cuenta1.setSaldoActual(0);
            

        } else {
            System.out.println("Retiro " + egreso);
            cuenta1.setSaldoActual(saldo - egreso);
            
        }
        return cuenta1.getSaldoActual();

    }
    
    public double extraccionRapida (CuentaBancaria cuenta1) {

        double egreso;
        double saldo = cuenta1.getSaldoActual();

        System.out.println("El saldo disponible por extracción Rapida es: "+saldo*.2);
        cuenta1.setSaldoActual(saldo-saldo*.2);
        
        return cuenta1.getSaldoActual();
        
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){
        
        System.out.println("Su saldo queda en "+cuenta1.getSaldoActual());
        
    }
    
    public void consultarDatos(CuentaBancaria cuenta1){
        System.out.println("Nombre del Titular es: "+cuenta1.getNombreTitular());
        System.out.println("El DNI del Titular es: "+cuenta1.getDniCliente());
        System.out.println("El Número de cuenta del Titular es: "+cuenta1.getNumeroCuenta());
    }
    

}
