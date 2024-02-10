package org.smbustillo.java8.lambda;

import org.smbustillo.java8.lambda.interfaces.MyParamValue;
import org.smbustillo.java8.lambda.interfaces.MyValue;

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;  //declarar una referencia de interfaz

        //La expresión lambda es una expresión constante.
        //Se crea una instancia de clase y se implementa getValue()
        myVal = () -> 98.6; //una sencilla expresión lambda

        //Invocar el getValue()
        System.out.println("A constant value: " + myVal.getValue());

        //Esta expresión  lambda devuelve el recíproco del parámetro
        MyParamValue myPval = (n) -> 1.0 / n;  // expresión lambda con un parámetro

        //Invocar getValue(v) a través de la referencia a myPval
        System.out.println("Reciprocal of 4 is: " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is: " + myPval.getValue(8.0));


    }
}
