/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author iptal
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        Persona p1 = new Persona();
        System.out.println("Ingrese nombre de la Persona: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la Persona: ");
        p1.setApellido(leer.next());
        System.out.println("Ingrese la edad de la Persona: ");
        p1.setEdad(leer.nextInt());
        return p1;
        
    }
}
