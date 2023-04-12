/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp8_ejercex1;

import Entidades.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author iptal
 */
public class Gp8_EjercEx1 {

    public static void main(String[] args) {

        RaicesServicio rs = new RaicesServicio();
        Raices r1 = rs.cargarValores();
        System.out.println("El discriminante es: " + rs.getDiscriminante());
        System.out.println("Tiene Raices es: " + rs.tieneRaices());
        System.out.println("Tiene Raiz es: " + rs.tieneRaiz());
//        rs.obtenerRaices();
//        rs.obtenerRaiz();
        rs.calcular();

    }
}
