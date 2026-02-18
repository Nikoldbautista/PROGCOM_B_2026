/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//Ejercico 1
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Base:");
        double base = sc.nextDouble();

        System.out.println("Altura:");
        double altura = sc.nextDouble();

        // Cálculo del área de un triángulo: (b * h) / 2
        double area = (base * altura) / 2;

        System.out.println("Area = " + area);
      
//Ejercicio 2 
System.out.print("Ingresa los grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Grados Fahrenheit: " + fahrenheit);
// Ejercicio 3 
        System.out.print("Número 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Número 3: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("El promedio es: " + promedio);

//Ejercicio 4
        sc.close();
         System.out.print("Ingresa el radio: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        sc.close();
//Ejericico 5
        System.out.print("Valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Valor de c: ");
        double c = sc.nextDouble();

        double discriminante = b*b - 4*a*c;

        if (discriminante >= 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("Soluciones: " + x1 + " y " + x2);
        } else {
            System.out.println("No tiene soluciones reales");
        }

        sc.close();
//Ejercicio 6 
 System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        sc.close();
//Ejercicio 7 
 System.out.print("Ingresa un año: ");
        int año = sc.nextInt();

        if ((año % 4 == 0 && anio % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
}
}