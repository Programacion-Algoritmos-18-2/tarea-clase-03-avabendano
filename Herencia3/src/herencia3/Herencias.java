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
public class Herencias {

    public static void main(String[] args) {

        // Instanciamos las clases y usamos los constructores de clases para asignarles valores directamente

        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);

        System.out.println(e);



        Docente d = new Docente("Luis", "Alvarez", 33, 1000); // implementado

        System.out.println(d);



        Policia p = new Policia("ALEX", "MENDOZA", 33, "Cabo"); // implementado

        System.out.println(p);



    }



}