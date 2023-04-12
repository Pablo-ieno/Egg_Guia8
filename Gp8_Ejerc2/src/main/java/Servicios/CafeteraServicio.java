/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cafetera;
<<<<<<< HEAD

/**
 *
 * @author iptal
 */
public class CafeteraServicio {

    public void llenarCafetera(Cafetera c1) {
        int capacidad = c1.getCapacidadMaxima();
        c1.setCapacidadActual(capacidad);
    }

    public void servirTaza(Cafetera c1, int taza) {
        int capacidad = c1.getCapacidadActual();
        System.out.println("Sirviendo taza");
        if (capacidad > taza) {
            System.out.println("La taza se llenó totalmente");
            c1.setCapacidadActual(capacidad - taza);
            System.out.println("Cantidad actual " + c1.getCapacidadActual());

        } else {
            int llenado = ((capacidad - taza) * 100) / taza;
            System.out.println("La taza se llenó " + llenado + " % ");
            c1.setCapacidadActual(capacidad - taza);
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCapacidadActual(0);
    }

    public void agregarCafe(Cafetera c1, int cafe) {
        c1.setCapacidadActual(cafe);
=======
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
>>>>>>> 3332cf9fadbb7146ffece93a470cd236f97659e9

    }

}
