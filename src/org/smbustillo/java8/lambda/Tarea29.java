package org.smbustillo.java8.lambda;

import java.util.function.Function;

public class Tarea29 {
    public static void main(String[] args) {

        Function<String,String > f1 =
                texto -> texto.replaceAll("\\s", "").
                        replaceAll("\\.","").
                        replaceAll(",","").toUpperCase();

        System.out.println(f1.apply("hola, mundo."));


    }
}
