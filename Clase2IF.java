/******************************************************************************

edad=int(input("Cual es tu edad?"))
if edad>=18:
  print("Usted es mayor de edad.")
else:
  print("Usted es menor de edad.")

*******************************************************************************/
import java.util.Scanner;

public class Clase2IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cambié el nombre a 'scanner' para no confundir
        System.out.print("Cual es tu edad? ");
        int age = scanner.nextInt(); // Guardamos el número en 'age'

        // 1. IF SIMPLE 
        System.out.println("\n--- If Simple ---");
        if (age < 10) { System.out.println("Aun eres un niño"); }
        if (age >= 10 && age < 14) { System.out.println("Eres un preadolescente"); }
        if (age >= 14 && age < 18) { System.out.println("Eres un adolescente"); }
        if (age >= 18 && age < 30) { System.out.println("Eres un adulto joven"); }
        if (age >= 30) { System.out.println("Eres un adulto"); }

        // 2. IF / ELSE IF
        System.out.println("\n--- If / Else If ---");
        if (age >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        if (age < 10) {
            System.out.println("Aún eres un niño");
        } else if (age >= 10 && age < 14) {
            System.out.println("Eres un preadolescente");
        } else if (age >= 14 && age < 18) {
            System.out.println("Eres un adolescente");
        } else if (age >= 18 && age < 30) {
            System.out.println("Eres un adulto joven");
        } else {
            System.out.println("Eres un adulto");
        }

        // 3. IF TERNARIO 
        System.out.println("\n--- If Ternario ---");
        String categoria = (age < 10) ? "Aun eres un niño" :
                           (age < 14) ? "Eres un preadolescente" :
                           (age < 18) ? "Eres un adolescente" :
                           (age < 30) ? "Eres un adulto joven" : "Eres un adulto";

        System.out.println("Resultado Ternario: " + categoria);

        scanner.close();
    }
}
