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
public class Policia extends Persona {

    // Atributos Globales
    private String rango;

    // Metodos Publicos
    // Constructor de clase
    public Policia(String n, String a, int e, String rango) {

        super(n, a, e);

        setRango(rango);

    }

    // Metodos Agregar valores
    // Metodo que sobreescribe el metodo padre setNombre
    @Override

    public void setNombre(String n) {

        nombre = n.toUpperCase();

    }

    // Mestodos propios de la Clase Policia
    public void setRango(String rango) {

        this.rango = rango;

    }

    public String getRango() {

        return rango;

    }

    // Metodo que sobreescribe el metodo padre toString agregando rango
    @Override

    public String toString() {

        return String.format("%s - Rango: %s", super.toString(), getRango());

    }

}

