/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author iz-living
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {

        Cafetera Nespresso = new Cafetera();
        Nespresso.setCapacidadMaxima(1000);
        System.out.println("Se llenará la Cafetera a su máxima capacidad");
        System.out.println("Presione ENTER");
        Nespresso.setCantidadActual(Nespresso.getCapacidadMaxima());
        System.out.println("La cafetera tiene "+Nespresso.getCantidadActual()+ " ml.");
        return Nespresso;

    }

}
