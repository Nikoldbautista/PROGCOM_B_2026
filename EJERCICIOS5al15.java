/******************************************************************************
EJERCICIOS DEl 5 AL 15

*******************************************************************************/

import java.util.Scanner;

public class EJERCICIOS5al15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// EJERCICIO 5 
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

//IF SIMPLE
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Dos soluciones: " + x1 + " y " + x2);
        }
        if (d == 0) {
            double x = -b / (2*a);
            System.out.println("Una solución: " + x);
        }
        if (d < 0) {
            System.out.println("No tiene soluciones reales");
        }

//IF ELIF
        if (d > 0) {
            System.out.println("Dos soluciones reales");
        } else if (d == 0) {
            System.out.println("Una solución real");
        } else {
            System.out.println("No tiene soluciones reales");
        }

//IF TERNARIO
        String resultado5 = (d > 0) ? "Dos soluciones"
                          : (d == 0) ? "Una solución"
                          : "No tiene soluciones reales";
        System.out.println(resultado5);

// EJERCICIO 6 - NÚMERO PAR O IMPAR
        System.out.print("\nIngrese un número: ");
        int num = sc.nextInt();

//IF SIMPLE
        if (num % 2 == 0)
            System.out.println("Es par");
        if (num % 2 != 0)
            System.out.println("Es impar");

//IF ELIF
        if (num % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");

//IF TERNARIO
        System.out.println((num % 2 == 0) ? "Es par" : "Es impar");

// EJERCICIO 7 
        System.out.print("\nIngrese un año: ");
        int anio = sc.nextInt();

        boolean cond = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

//IF SIMPLE
        if (cond)
            System.out.println("Es bisiesto");
        if (!cond)
            System.out.println("No es bisiesto");

//IF ELIF
        if (cond)
            System.out.println("Es bisiesto");
        else
            System.out.println("No es bisiesto");

//IF TERNARIO
        System.out.println(cond ? "Es bisiesto" : "No es bisiesto");

// EJERCICIO 8 
        sc.nextLine(); // limpiar buffer
        System.out.print("\nIngrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

//IF SIMPLE
        if (edad >= 70)
            System.out.println(nombre + " tiene prioridad");
        if (edad < 70)
            System.out.println(nombre + " no tiene prioridad");

//IF ELIF
        if (edad >= 70)
            System.out.println(nombre + " tiene prioridad");
        else
            System.out.println(nombre + " no tiene prioridad");

//IF TERNARIO
       System.out.println((edad >= 70) 
    ? nombre + " tiene prioridad"
    : nombre + " no tiene prioridad");

// EJERCICIO 9 
        System.out.print("\nNúmero 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Número 3: ");
        double n3 = sc.nextDouble();

//IF SIMPLE
        if (n1 > n2 && n1 > n3)
            System.out.println("Mayor: " + n1);
        if (n2 > n1 && n2 > n3)
            System.out.println("Mayor: " + n2);
        if (n3 > n1 && n3 > n2)
            System.out.println("Mayor: " + n3);

//IF ELIF
        if (n1 >= n2 && n1 >= n3)
            System.out.println("Mayor: " + n1);
        else if (n2 >= n3)
            System.out.println("Mayor: " + n2);
        else
            System.out.println("Mayor: " + n3);

//IF TERNARIO
        double mayor = (n1 > n2 && n1 > n3) ? n1
                      : (n2 > n3) ? n2
                      : n3;
        System.out.println("Mayor: " + mayor);

// EJERCICIO 10 
        System.out.print("\nLado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = sc.nextDouble();

//IF SIMPLE
        if (l1 == l2 && l2 == l3)
            System.out.println("Equilátero");
        if (l1 == l2 || l1 == l3 || l2 == l3)
            System.out.println("Isósceles");
        if (l1 != l2 && l2 != l3 && l1 != l3)
            System.out.println("Escaleno");

//IF ELIF
        if (l1 == l2 && l2 == l3)
            System.out.println("Equilátero");
        else if (l1 == l2 || l1 == l3 || l2 == l3)
            System.out.println("Isósceles");
        else
            System.out.println("Escaleno");

//IF TERNARIO
        String tipo = (l1 == l2 && l2 == l3) ? "Equilátero"
                     : (l1 == l2 || l1 == l3 || l2 == l3) ? "Isósceles"
                     : "Escaleno";
        System.out.println(tipo);


//EJERCICIO 11
//IF SIMPLE
        System.out.print("Ingrese su nombre: ");
        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        String categoria = "";
        String descripcion = "";

        if (imc < 18.5) {
            categoria = "Bajo peso";
            descripcion = "Se recomienda mejorar la alimentación y consultar un especialista.";
        }
        if (imc >= 18.5 && imc < 25) {
            categoria = "Normal";
            descripcion = "Mantenga hábitos saludables.";
        }
        if (imc >= 25 && imc < 30) {
            categoria = "Sobrepeso";
            descripcion = "Se recomienda realizar actividad física y mejorar la dieta.";
        }
        if (imc >= 30) {
            categoria = "Obesidad";
            descripcion = "Es importante consultar un profesional de la salud.";
        }

        System.out.println("\nNombre: " + nombre);
        System.out.println("IMC: " + Math.round(imc * 100.0) / 100.0);
        System.out.println("Categoría: " + categoria);
        System.out.println("Recomendación: " + descripcion);
//IF ELIF
if (imc < 18.5) {
            categoria = "Bajo peso";
            descripcion = "Se recomienda mejorar la alimentación y consultar un especialista.";
        } else if (imc < 25) {
            categoria = "Normal";
            descripcion = "Mantenga hábitos saludables.";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
            descripcion = "Se recomienda realizar actividad física y mejorar la dieta.";
        } else {
            categoria = "Obesidad";
            descripcion = "Es importante consultar un profesional de la salud.";
        }

        System.out.println("\nNombre: " + nombre);
        System.out.println("IMC: " + Math.round(imc * 100.0) / 100.0);
        System.out.println("Categoría: " + categoria);
        System.out.println("Recomendación: " + descripcion);
//IF TERNARIO
        categoria = (imc < 18.5) ? "Bajo peso" : 
                    (imc < 25)   ? "Normal" : 
                    (imc < 30)   ? "Sobrepeso" : "Obesidad";

        descripcion = (imc < 18.5) ? "Se recomienda mejorar la alimentación y consultar un especialista." : 
                      (imc < 25)   ? "Mantenga hábitos saludables." : 
                      (imc < 30)   ? "Se recomienda realizar actividad física y mejorar la dieta." : 
                                     "Es importante consultar un profesional de la salud.";

        System.out.println("\nNombre: " + nombre);
        System.out.println("IMC: " + Math.round(imc * 100.0) / 100.0);
        System.out.println("Categoría: " + categoria);
        System.out.println("Recomendación: " + descripcion);
//EJERCICIO 12
//IF SIMPLE 
System.out.print("Num 1: "); 
        System.out.print("Num 2: "); 
        System.out.print("Operación (+, -, *, /): "); String op = sc.next();
String calculadora = "Operación no válida";

        if (op.equals("+")) calculadora = String.valueOf(n1 + n2);
        if (op.equals("-")) calculadora = String.valueOf(n1 - n2);
        if (op.equals("*")) calculadora = String.valueOf(n1 * n2);
        if (op.equals("/")) {
            if (n2 != 0) calculadora = String.valueOf(n1 / n2);
            else calculadora = "Error: Div por 0";
        }
        System.out.println("Resultado: " + calculadora);
//IF ELIF
if (op.equals("+")) {
            calculadora = String.valueOf(n1 + n2);
        } else if (op.equals("-")) {
            calculadora = String.valueOf(n1 - n2);
        } else if (op.equals("*")) {
            calculadora = String.valueOf(n1 * n2);
        } else if (op.equals("/")) {
            calculadora = (n2 != 0) ? String.valueOf(n1 / n2) : "Error: Div por 0";
        } else {
            calculadora = "Operación no válida";
        }

        System.out.println("Resultado: " + calculadora);
//IF TERNARIO
calculadora = op.equals("+") ? String.valueOf(n1 + n2) :
                             op.equals("-") ? String.valueOf(n1 - n2) :
                             op.equals("*") ? String.valueOf(n1 * n2) :
                             op.equals("/") ? (n2 != 0 ? String.valueOf(n1 / n2) : "Error: Div por 0") : 
                             "Operación no válida";

        System.out.println("Resultado: " + calculadora);
//EJERCICIO 13 
//IF SIMPLE 
System.out.print("Ingrese su nota (0-100): ");
        double nota2 = sc.nextDouble();
        
        String calificacion2 = "F"; 
        if (nota2 >= 60 && nota2 < 70) calificacion2 = "D";
        if (nota2 >= 70 && nota2 < 80) calificacion2 = "C";
        if (nota2 >= 80 && nota2 < 90) calificacion2 = "B";
        if (nota2 >= 90)               calificacion2 = "A";

        System.out.println("Resultado: " + calificacion2);
//IF ELIF 
System.out.print("Ingrese su nota (0-100): ");
double notaA = sc.nextDouble(); // Usamos notaA
String calificacionA; 

if (notaA >= 90) {
    calificacionA = "A";
} else if (notaA >= 80) {
    calificacionA = "B";
} else if (notaA >= 70) {
    calificacionA = "C";
} else if (notaA >= 60) {
    calificacionA = "D";
} else {
    calificacionA = "F";
}
System.out.println("Resultado: " + calificacionA);

//IF TERNARIO
System.out.print("Ingrese su nota (0-100): ");
double notaB = sc.nextDouble(); // Usamos notaB para que no choque con notaA

String calificacionB = (notaB >= 90) ? "A" :
                       (notaB >= 80) ? "B" :
                       (notaB >= 70) ? "C" :
                       (notaB >= 60) ? "D" : "F";

System.out.println("Resultado: " + calificacionB);
//EJERCICIO 14
//IF SIMPLE
System.out.print("Ingrese un número (1-7): ");
        int d2 = sc.nextInt();
        String res2 = "Día no válido";

        if (d2 == 1) res2 = "Lunes";
        if (d2 == 2) res2 = "Martes";
        if (d2 == 3) res2 = "Miércoles";
        if (d2 == 4) res2 = "Jueves";
        if (d2 == 5) res2 = "Viernes";
        if (d2 == 6) res2 = "Sábado";
        if (d2 == 7) res2 = "Domingo";

        System.out.println("Resultado: " + res2);
//IF ELIF 
System.out.print("Ingrese un número (1-7): ");
        int d1 = sc.nextInt();
        String res1;

        if (d1 == 1) {
            res1 = "Lunes";
        } else if (d1 == 2) {
            res1 = "Martes";
        } else if (d1 == 3) {
            res1 = "Miércoles";
        } else if (d1 == 4) {
            res1 = "Jueves";
        } else if (d1 == 5) {
            res1 = "Viernes";
        } else if (d1 == 6) {
            res1 = "Sábado";
        } else if (d1 == 7) {
            res1 = "Domingo";
        } else {
            res1 = "Día no válido";
        }
        System.out.println("Resultado: " + res1);
//IF TERNARIO 
System.out.print("Ingrese un número (1-7): ");
        int d3 = sc.nextInt();

        String res3 = (d3 == 1) ? "Lunes" :
                      (d3 == 2) ? "Martes" :
                      (d3 == 3) ? "Miércoles" :
                      (d3 == 4) ? "Jueves" :
                      (d3 == 5) ? "Viernes" :
                      (d3 == 6) ? "Sábado" :
                      (d3 == 7) ? "Domingo" : "Día no válido";

        System.out.println("Resultado: " + res3);
//EJERCICIO 15
System.out.print("Ingrese Lado 1: ");
double L1 = sc.nextDouble();
System.out.print("Ingrese Lado 2: ");
double L2 = sc.nextDouble();
System.out.print("Ingrese Lado 3: ");
double L3 = sc.nextDouble();


boolean esTriangulo = (L1 + L2 > L3 && L1 + L3 > L2 && L2 + L3 > L1);
//IF SIMPLE 
String resSimple = "No es un triángulo";
if (esTriangulo && L1 == L2 && L2 == L3) resSimple = "Equilátero";
if (esTriangulo && (L1 == L2 || L1 == L3 || L2 == L3) && !(L1 == L2 && L2 == L3)) resSimple = "Isósceles";
if (esTriangulo && L1 != L2 && L1 != L3 && L2 != L3) resSimple = "Escaleno";
//IF ELIF 
if (esTriangulo) {
    if (L1 == L2 && L2 == L3) {
        System.out.println("Resultado: Equilátero");
    } else if (L1 == L2 || L1 == L3 || L2 == L3) {
        System.out.println("Resultado: Isósceles");
    } else {
        System.out.println("Resultado: Escaleno");
    }
} else {
    System.out.println("Resultado: No es un triángulo válido");
}



System.out.println("Resultado: " + resSimple);

//C. IF TERNARIO
String resTernario = (L1 == L2 && L2 == L3) ? "Equilátero" : 
                     (L1 == L2 || L1 == L3 || L2 == L3) ? "Isósceles" : "Escaleno";

String finalRes = (esTriangulo) ? resTernario : "No es un triángulo";

System.out.println("Resultado: " + finalRes);
    }
}