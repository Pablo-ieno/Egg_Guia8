/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gt_ejerc1;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author iptal
 */
public class Gt_Ejerc1 {

    public static void main(String[] args) {
    /*Crea un método void que reciba un objeto tipo persona como parámetro y 
    utilice el get para mostrar sus atributos. Llama ese método desde el main.*/   
    
        PersonaService pers1 = new PersonaService();
        
        Persona a1 = pers1.crearPersona();
        a1.getNombre();
        a1.getApellido();
        a1.getEdad();
        
        System.out.println(pers1);
        
        
    
        
    }
}
