package org.smbustillo.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    public double calcular (double a, double b, Aritmetica lambda){
        return lambda.operacion(a,b);
    }

    public double computar(double a, double b, BiFunction<Double,Double,Double>lambda ) {
        return lambda.apply(a,b);
    }
}
