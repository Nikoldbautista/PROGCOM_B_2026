
package holamundo;
import java.util.*;
/**
 *
 * @author Nikold Bautista 
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lluvia;
      // Saludar al mundo 
     System.out.println("Hola Mundo. Bienvenido a PROGCOM-B");
     System.out.println("Esta lloviendo?");
     //Estamos definiendo un objeto de tipo Scanner 
     Scanner play = new Scanner (System.in);
     lluvia=play.nextLine();
     System.out.println("Tu respuesta fue: " +lluvia);
     if(lluvia.equals("si")){
         System.out.println("Use sombrilla. Guarde la ropa");
    }else{
         system.out.println("Salga tranquilo")
     }
    }
}