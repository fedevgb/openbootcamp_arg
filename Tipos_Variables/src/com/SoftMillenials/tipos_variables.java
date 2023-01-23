package com.SoftMillenials;

import jdk.swing.interop.SwingInterOpUtils;

public class tipos_variables {
    public static void main(String[] args) {

        tipoVariable tipo = new tipoVariable();
        System.out.println("===================================");
        System.out.println("=======   VARIABLES ENTERAS  ======");
        System.out.println("===================================");
        System.out.println("Variables de numeros enteros tipo byte: " + tipo.numero_1);
        System.out.println("Variables de numeros enteros tipo short: " + tipo.numeros2);
        System.out.println("Variables de numeros enteros tipo int: " + tipo.numer3);
        System.out.println("Variables de numeros enteros tipo long: " + tipo.number4);


        System.out.println("===================================");
        System.out.println("=======   VARIABLES decimales  ====");
        System.out.println("===================================");
        System.out.println("Variables de numeros decimales tipo flotantes: " + tipo.decimal);
        System.out.println("Variables de numeros enteros tipo double: " + tipo.decimal1);

        System.out.println("===================================");
        System.out.println("=======   VARIABLES texto  ====");
        System.out.println("===================================");
        System.out.println("Variables de texto tipo String: " + tipo.cadena);
        System.out.println("Variables de text  tipo Caracter: " + tipo.caracter1);

        System.out.println("===================================");
        System.out.println("=======   VARIABLES booleanos  ====");
        System.out.println("===================================");
        System.out.println("Variables booleanas true: " + tipo.verdadero);
        System.out.println("Variables booleanas: " + tipo.falso);

        System.out.println("===================================");
        System.out.println("=======   VARIABLES envolventes  ====");
        System.out.println("===================================");
        System.out.println("Variables integer: " + tipo.numero);

    }

    static class tipoVariable {
        //tipos de datos enteros

        public byte numero_1 = 1; /*capacidad de almacenamiento 1 byte*/
        public short numeros2 = 2; /*capacidad de almacenamiento 2 byte*/
        public int numer3 = 3; /*capacidad de almacenamiento 4 byte*/
        public long number4 = 4; /*capacidad de almacenamiento 8 byte*/

        //numericos con decimales
        public float decimal = 4.9f;
        public double decimal1 = 10.5d;

        //cadenas de texto
        public String cadena = "tipos de variable";

        //caracter
        char caracter1 = 'a';

        //booleanos
        public boolean verdadero = true;
        public boolean falso = false;

        //tipos envoltorios
        public Integer numero = null;

    }
}
