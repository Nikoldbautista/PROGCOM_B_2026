/******************************************************************************
EJERCICIOS DE 11 AL 15

*******************************************************************************/

import java.util.Scanner;

public class EJERCICIOS11al15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//EJERCICIO 11
//IF SIMPLE
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
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
System.out.print("Num 1: "); double n1 = sc.nextDouble();
        System.out.print("Num 2: "); double n2 = sc.nextDouble();
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
    

