/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ip.gp8_ejerc2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class Gp8_Ejerc2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CafeteraServicio cs1 = new CafeteraServicio();

        Cafetera c1 = new Cafetera();

        int opc;

        do {

            System.out.println("Seleccione una opcion:");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cs1.llenarCafetera(c1);
                    break;
                case 2:
                    System.out.println("Tamaño de taza: ");
                    int taza = leer.nextInt();
                    cs1.servirTaza(c1, taza);
                    break;
                case 3:
                    cs1.vaciarCafetera(c1);
                    break;
                case 4:
                    System.out.println("Cantidad de cafe: ");

                    break;
                case 5:
                    System.out.println("Buenas Tardes");
                    break;

            }
        } while (opc != 5);

    }

}
