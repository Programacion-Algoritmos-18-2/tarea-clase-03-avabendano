/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Victoria
 */
public class Docente extends Persona {

    // Atributos Globales
    private double sueldo;

    // Metodos Publicos
    // Constructor de clase
    public Docente(String n, String a, int e, double sueldo) {

        super(n, a, e);

        setSueldo(sueldo);

    }

    // Metodos Agregar valores
    // Metodo que sobreescribe el metodo padre setNombre
    @Override

    public void setNombre(String n) {

        nombre = n.toUpperCase();

    }

    // Mestodos propios de la Clase Docente
    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;

    }

    public double getSueldo() {

        return sueldo;

    }

    // Metodo que sobreescribe el metodo padre toString agregando sueldo
    @Override

    public String toString() {

        return String.format("%s - Sueldo: %.2f", super.toString(), getSueldo());

    }

}


