/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Victoria
 */
public class Trabajador {

    // Atributos Globales o de Clase
    private String nombres;

    private double sueldo_mensual;

    private String apellidos;

    // Mtodos Agregar con sobrecarga
    public void agregar_nombres(String n) {

        nombres = n;

    }

    public void agregar_nombres(String n1, String n2) {

        nombres = String.format("%s-%s", n1, n2);

    }

    public void agregar_sueldo(double s) {

        sueldo_mensual = s;

    }

    public void agregar_sueldo(double[] sueldos) {

        double sueldo_total = 0;

        for (int i = 0; i < sueldos.length; i++) {

            sueldo_total += sueldos[i];

        }

        sueldo_mensual = sueldo_total;

    }

    public void agregar_apellidos(String n) {

        apellidos = n;

    }

    // Metodos Obtener
    public String obtener_nombres() {

        return nombres;

    }

    public String obtener_apellidos() {

        return apellidos;

    }

    public double obtener_sueldo_mensual() {

        return sueldo_mensual;

    }

    // Metodo que sobreescribe el metodo toString
    @Override

    public String toString() {

        return String.format("\n\tNombres: %s\n\tApellidos: %s\n\tSueldo: %.2f", obtener_nombres(), obtener_apellidos(), obtener_sueldo_mensual());

    }

}
