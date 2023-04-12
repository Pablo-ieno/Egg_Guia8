/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona per1 = new Persona();

        System.out.println("Ingrese los datos de la Persona:");
        System.out.print("Nombre: ");
        per1.setNombre(leer.next());
        System.out.print("Edad: ");
        per1.setEdad(leer.nextInt());

        do {
            System.out.print("Sexo F: femenino - M: masculino O: otro : ");
            per1.setSexo(leer.nextLine());
        } while (!"m".equalsIgnoreCase(per1.getSexo()) && (!"f".equalsIgnoreCase(per1.getSexo())) && (!"o".equalsIgnoreCase(per1.getSexo())));

        System.out.print("Peso: ");
        per1.setPeso(leer.nextDouble());
        System.out.print("Altura: ");
        per1.setAltura(leer.nextDouble());
        return per1;

    }

    public void esMayorDeEdad(Persona per1) {
        boolean mayorDeEdad = true;

        if (per1.getEdad() >= 18) {
            System.out.println("La persona es mayor de edad");

        } else {
            System.out.println("La persona es menor de edad.");
            mayorDeEdad = false;

        }

    }

    public void pesoIdeal(Persona per1) {
        double pesoIdeal = 0;
        double IMC = (per1.getPeso() / Math.pow(per1.getAltura(), 2));
        if (IMC < 20) {
            pesoIdeal = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            pesoIdeal = 0;
        } else {
            pesoIdeal = 1;

        }

    }

}
