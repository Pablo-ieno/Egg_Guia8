/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Raices;
import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class RaicesServicio {

    //Declaración de Scanner.-
    Scanner leer = new Scanner(System.in);

    //Instanciado de Objeto.-
    Raices r1 = new Raices();

    public Raices cargarValores() {

        System.out.println("Ingrese los valores para cada coeficiente");
        System.out.println("a:");
        r1.setA(leer.nextDouble());
        System.out.println("b:");
        r1.setB(leer.nextDouble());
        System.out.println("c:");
        r1.setC(leer.nextDouble());
        return r1;

    }
//Método para obtener el Discriminante.-

    public double getDiscriminante() {

        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();

        return discriminante;

    }
//Método para saber si tiene dos soluciones.- 

    public boolean tieneRaices() {
        boolean tRs = true;

        if (getDiscriminante() > 0) {
        } else if (getDiscriminante() == 0) {

        } else {
            tRs = false;
        }

        return tRs;
    }
//Método para saber si tiene una sola solución.-

    public boolean tieneRaiz() {
        boolean tR = true;

        if (getDiscriminante() == 0) {

        } else {
            tR = false;
        }

        return tR;
    }
//Método para imprimir si tiene dos soluciones.-

    public void obtenerRaices() {
        double solucionSuma = ((-r1.getB() + Math.sqrt(getDiscriminante())) / (2 * r1.getA()));
        double solucionResta = ((-r1.getB() - Math.sqrt(getDiscriminante())) / (2 * r1.getA()));


        if (tieneRaices()) {
            System.out.println("El Discriminante tiene raices, las soluciones son: ");
            System.out.println(solucionSuma + " y " + solucionResta);
        } else {
            System.out.println(" ");
        }


    }
//Método para imprimir si tiene una sola solución.-

    public void obtenerRaiz() {
        double solucionUnica = ((-r1.getB()) / (2 * r1.getA()));

        if (tieneRaiz()) {
            System.out.println("El Discriminante tiene raiz, la soluciones es: ");
            System.out.println(solucionUnica);
        } else {
            System.out.println(" ");
        }


    }
//Método para imprimir las posibles soluciones.-    

    public void calcular() {



        String sinResultado = "No Tiene solución posible";

        if (tieneRaices()) {
            obtenerRaices();

        } else if (tieneRaiz()) {
            obtenerRaiz();

        } else {
            System.out.println(sinResultado);

        }

    }
    

}
