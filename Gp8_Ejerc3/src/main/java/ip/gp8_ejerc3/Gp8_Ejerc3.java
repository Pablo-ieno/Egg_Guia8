/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp8_ejerc3;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp8_Ejerc3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        PersonaService servicio1 = new PersonaService();

        Persona p1 = servicio1.crearPersona();
        servicio1.esMayorDeEdad(p1);
        servicio1.pesoIdeal(p1);
        
        Persona p2 = new Persona("Gabriela", 16, "f", 50, 1.6);
        Persona p3 = new Persona("German", 50, "m", 100, 1.5);
        Persona p4 = new Persona("Andrea", 35, "f", 80.0, 1.6);

//        System.out.println(servicio1.esMayorDeEdad(p1));
//        System.out.println(servicio1.esMayorDeEdad(p2));
//        System.out.println(servicio1.esMayorDeEdad(p3));
//        System.out.println(servicio1.esMayorDeEdad(p4));
//
//        System.out.println(servicio1.pesoIdeal(p1));
//        System.out.println(servicio1.pesoIdeal(p2));
//        System.out.println(servicio1.pesoIdeal(p3));
//        System.out.println(servicio1.pesoIdeal(p4));

        boolean mayorEdad[] = new boolean[1];
        int contMayor = 0;
        int contMenor = 0;

//        mayorEdad[0] = servicio1.esMayorDeEdad(p1);
//        mayorEdad[1] = servicio1.esMayorDeEdad(p2);
//        mayorEdad[2] = servicio1.esMayorDeEdad(p3);
//        mayorEdad[3] = servicio1.esMayorDeEdad(p4);

        for (int i = 0; i < 1; i++) {
            if (mayorEdad[i]) {
                contMayor = +1;
            } else {
                contMenor = +1;
            }

        }
        System.out.println("El porcentaje de mayores de edad es: " + (contMayor / 4) * 100);
        System.out.println("El porcentaje de menores de edad es: " + (contMenor / 4) * 100);

        double IMC[] = new double[1];
        int bajoPeso = -1;
        int pesoIdeal = 0;
        int sobrePeso = 1;

//        IMC[0] = servicio1.pesoIdeal(p1);
//        IMC[1] = servicio1.pesoIdeal(p2);
//        IMC[2] = servicio1.pesoIdeal(p3);
//        IMC[3] = servicio1.pesoIdeal(p4);

        for (int i = 0; i < 1; i++) {
            if (IMC[i] == -1) {
                bajoPeso = +1;

            } else if (IMC[i] == 0) {
                pesoIdeal = +1;

            } else {
                sobrePeso = +1;
            }
        }
        System.out.println("El porcentaje de personas con bajo peso es: " + (bajoPeso  / 1) * 100);
        System.out.println("El porcentaje de personas con peso ideal es: " + (pesoIdeal  / 1) * 100);
        System.out.println("El porcentaje de personas con sobre peso es: " + (sobrePeso  / 1) * 100);

    }

}
