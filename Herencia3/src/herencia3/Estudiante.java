/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;


/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {



    // Atributos Globales

    private double matricula;



    // Metodos Publicos

    // Constructor de clase

    public Estudiante(String n, String a, int e, double mat) {

        super(n, a, e);

        setMatricula(mat);

    }



    // Metodos Agregar valores

    // Metodo que sobreescribe el metodo padre setNombre

    @Override

    public void setNombre(String n) {

        nombre = n.toUpperCase();

    }



    // Mestodos propios de la Clase Estudiante

    public void setMatricula(double mat) {

        matricula = mat;

    }



    public double getMatricula() {

        return matricula;

    }



    // Metodo que sobreescribe el metodo padre toString agregando matricula

    @Override

    public String toString() {



        return String.format("%s - Matricula: %.2f", super.toString(), getMatricula());

    }

}