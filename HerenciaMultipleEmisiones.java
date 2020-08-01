/*
Realice un algoritmo que le permita desarollar lo que desarrollar la mezcla Biodiesel-Motor.
Mediante una herencia multiple.
 */
package herenciamultipleemisiones;

/**
 *
 * @author Anita Pico Solis
 */
interface Motor{
    default String Caracteristica(String funcion){
         return "Una carga del motor más la mezcla de Biodiesel emanan gases a la atmósfera "+funcion+".";
    }
} 
     interface Biodiesel{
         default String Caracteristica(String funcion){
         return "Un porcentaje de Biodiesel más una carga de motor emanan gases a las atmósfera "+funcion;
         }
        
     }

public class HerenciaMultipleEmisiones implements Motor, Biodiesel {

      @Override
    public String Caracteristica(String funcion){
        return Motor.super.Caracteristica(funcion);
    }
/*
       @Override
       public String Caracteristica(String funcion){
         return Biodiesel.super.Caracteristica(funcion);
                }
*/
    public static void main(String[] args) {
        
        System.out.println("    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("             INGENIERIA AUTOMOTRIZ");
        System.out.println("Nombre: Pico Solis Ana Graciela");
        System.out.println("Materia: Programación ");
        System.out.println("NRC: 7450");    
        System.out.println("***************************************************"); 
        System.out.println("            Herencia Multiple Emisiones ");   
        System.out.println("***************************************************");
        
        HerenciaMultipleEmisiones hme=new HerenciaMultipleEmisiones();
        System.out.println(hme.Caracteristica("\n Gases como Monóxido de Oxígeno, Hidrocarburos, "
                + "Monóxido de Nitrógeno, ademas de opacidad."));
        
 
        
        
    }
    
}
