package org.smbustillo.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String,String> f1 = param -> "Hola, qué tal " + param;
        String resultado = f1.apply("Susana");
        System.out.println(resultado);

        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f2.apply("susanita"));

        BiFunction<String,String,String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f3.apply("susana","lola"));

        BiFunction<String,String,Integer> f4 = String::compareTo;
        System.out.println(f4.apply("susana","susana"));

        BiFunction<String,String,String> f5 = String::concat;
        System.out.println(f5.apply("susana","lola"));
    }
}
