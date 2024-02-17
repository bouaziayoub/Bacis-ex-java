package com.company;

import java.util.Scanner;

// Este programa sirve como una herramienta básica para recopilar información sobre la edad de los alumnos,
// realizar cálculos estadísticos simples y ofrecer funciones adicionales para analizar la distribución de edades en el aula.
public class Alumnos {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int numAlumnos;
            int[] edadesAlumnos, edadesDiferentes;
            float mediaEdad = 0f;
            boolean valorCorrecto = false;

            System.out.println("Bienvenido/a");
            System.out.print("¿Cuántos alumnos hay en el aula? ");
            numAlumnos = leer.nextInt();
            leer.nextLine();

            edadesAlumnos = new int[numAlumnos];

            for (int i = 0; i < edadesAlumnos.length; i++) {
                do {
                    System.out.println("Introduce la edad del alumno " + (i + 1));
                    valorCorrecto = leer.hasNextInt();

                    if (!valorCorrecto) {
                        System.out.println("¡No has escrito un valor entero!");
                        leer.nextLine();
                    } else {
                        edadesAlumnos[i] = leer.nextInt();
                        leer.nextLine();

                        if (edadesAlumnos[i] < 17 || edadesAlumnos[i] > 50) {
                            System.out.println("Has escrito una edad no válida");
                            valorCorrecto = false;
                        }
                    }
                } while (!valorCorrecto);
            }

            for (int i = 0; i < edadesAlumnos.length; i++) {
                System.out.println("La edad del alumno " + (i + 1) + " es " + edadesAlumnos[i]);
            }

            for (int i = 0; i < edadesAlumnos.length; i++) {
                mediaEdad += edadesAlumnos[i];
            }

            System.out.println("La suma de las edades de la clase es: " + mediaEdad);
            System.out.println("La media de edad es: " + mediaEdad / edadesAlumnos.length);

            System.out.println("*************EXTRAS*************");

            edadesDiferentes = new int[edadesAlumnos.length];
            edadesDiferentes[0] = edadesAlumnos[0];

            int posicionEdades = 1;
            boolean encontrado = false;

            for (int i = 1; i < edadesAlumnos.length; i++) {
                encontrado = false;
                for (int j = 0; j < edadesDiferentes.length; j++) {
                    if (edadesAlumnos[i] == edadesDiferentes[j]) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    edadesDiferentes[posicionEdades] = edadesAlumnos[i];
                    posicionEdades++;
                }
            }

            for (int i = 0; i < posicionEdades; i++) {
                System.out.println(edadesDiferentes[i]);
            }

            int alumnoEdadConcreta = 0;

            for (int i = 0; i < posicionEdades; i++) {
                alumnoEdadConcreta = 0;

                for (int j = 0; j < edadesAlumnos.length; j++) {
                    if (edadesDiferentes[i] == edadesAlumnos[j]) {
                        alumnoEdadConcreta++;
                    }
                }
                System.out
                        .println("Hay " + alumnoEdadConcreta + " alumnos que tienen " + edadesDiferentes[i] + " años.");
            }
        }
    }
}
