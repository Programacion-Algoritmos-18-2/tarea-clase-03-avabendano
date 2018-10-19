/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instaciamos la clase Trabajador
        Trabajador t = new Trabajador();

        // PEdimos al usuario que decida si quiere ingresar un nombre o 2
        System.out.println("Numero de nombres del trabajador 1 o 2");

        int numero_nombres = scanner.nextInt();

        scanner.nextLine();

        if (numero_nombres == 1) {

            // Agregamos nombre al objeto de trabajador
            System.out.println("Ingrese el nombre del trabajador");

            String nombre = scanner.nextLine();

            t.agregar_nombres(nombre);

        } else {

            // Agregamos 2 nombres al objeto trabajador
            System.out.println("Ingrese el nombre uno del trabajador");

            String nombre1 = scanner.nextLine();

            System.out.println("Ingrese el nombre dos del trabajador");

            String nombre2 = scanner.nextLine();

            t.agregar_nombres(nombre1, nombre2);

        }

        // Pedimos al usuario que ingrese el apellido
        System.out.println("Ingrese el apellido del trabajador");

        String apellidos = scanner.nextLine();

        t.agregar_apellidos(apellidos);

        // Pedimos al usuario que decida si quiere ingresar un sueldo mensual o  en sueldos semanales
        System.out.println("1 - Sueldo por mes\t2 - Sueldo por semanas");

        int numero_sueldos = scanner.nextInt();

        if (numero_sueldos == 1) {

            // Agregamos un sueldo al trabajador
            System.out.println("Ingrese el sueldo del trabajador");

            double sueldo = scanner.nextDouble();

            t.agregar_sueldo(sueldo);

        } else {

            // Agregamos una lista de sueldos semanales al trabajador
            double[] sueldo_semanales = new double[4];

            for (int i = 0; i < sueldo_semanales.length; i++) {

                System.out.printf("Ingrese el sueldo de la semana %s\n", i + 1);

                sueldo_semanales[i] = scanner.nextDouble();

            }

            t.agregar_sueldo(sueldo_semanales);

        }

        // Imprimimos los datos del trabajador usando el metood toString sobreescrito
        System.out.printf("Los datos del trabajador son: %s\n", t);

    }

}
