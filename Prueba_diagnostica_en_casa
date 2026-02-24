import java.util.Scanner;

public class prueba_encasa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== EJERCICIO 8 =====
        System.out.println("=== EJERCICIO 8 ===");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad >= 70) {
            System.out.println(nombre + " tiene prioridad en la fila.");
        } else {
            System.out.println(nombre + " no tiene prioridad en la fila.");
        }

        // ===== EJERCICIO 9 =====
        System.out.println("\n=== EJERCICIO 9 ===");
        System.out.print("Número 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Número 3: ");
        double n3 = sc.nextDouble();

        double mayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El mayor es: " + mayor);

        // ===== EJERCICIO 10 =====
        System.out.println("\n=== EJERCICIO 10 ===");
        System.out.print("Lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Lado 3: ");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Triángulo Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triángulo Isósceles");
        } else {
            System.out.println("Triángulo Escaleno");
        }

        // ===== EJERCICIO 11 =====
        System.out.println("\n=== EJERCICIO 11 ===");
        sc.nextLine(); // limpiar buffer

        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25) {
            categoria = "Normal";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.println("IMC: " + imc);
        System.out.println("Categoría: " + categoria);

        // ===== EJERCICIO 12 =====
        System.out.println("\n=== EJERCICIO 12 ===");
        System.out.print("Número 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Operador (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Número 2: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;
            default:
                System.out.println("Operador inválido");
        }

        // ===== EJERCICIO 13 =====
        System.out.println("\n=== EJERCICIO 13 ===");
        System.out.print("Nota (0-100): ");
        double nota = sc.nextDouble();

        if (nota >= 90)
            System.out.println("A");
        else if (nota >= 80)
            System.out.println("B");
        else if (nota >= 70)
            System.out.println("C");
        else if (nota >= 60)
            System.out.println("D");
        else
            System.out.println("F");

        // ===== EJERCICIO 14 =====
        System.out.println("\n=== EJERCICIO 14 ===");
        System.out.print("Número (1-7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido");
        }

        // ===== EJERCICIO 15 =====
        System.out.println("\n=== EJERCICIO 15 ===");
        System.out.print("Lado 1: ");
        double t1 = sc.nextDouble();

        System.out.print("Lado 2: ");
        double t2 = sc.nextDouble();

        System.out.print("Lado 3: ");
        double t3 = sc.nextDouble();

        if (t1 + t2 > t3 && t1 + t3 > t2 && t2 + t3 > t1) {
            System.out.println("Forman un triángulo");

            if (t1 == t2 && t2 == t3)
                System.out.println("Equilátero");
            else if (t1 == t2 || t1 == t3 || t2 == t3)
                System.out.println("Isósceles");
            else
                System.out.println("Escaleno");
        } else {
            System.out.println("No forman un triángulo");
        }

        sc.close();
    }
}
