package org.smbustillo.java8.lambda;

import org.smbustillo.java8.lambda.aritmetica.Aritmetica;
import org.smbustillo.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a,b)-> a-b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.calcular(5,4,suma));
        System.out.println(cal.calcular(8,3,resta));
        System.out.println(cal.calcular(5,10,(a,b) -> a*b));

        System.out.println(cal.computar(10,5, Double::sum));
    }
}
