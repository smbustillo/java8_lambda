package org.smbustillo.java8.lambda;

import org.smbustillo.java8.lambda.interfaces.SomeTest;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        //determina si un entero es factor de otro
        SomeTest<Integer> isFactor = (n,d) -> (n % d) == 0;

        if(isFactor.test(10,2)){
            System.out.println("2 is factor of 10");
        }
        System.out.println();

        //determina si un valor double es factor de otro
        SomeTest<Double> isFactorDouble = (n,d) -> (n % d) == 0;

        if(isFactorDouble.test(212.0,4.0)){
            System.out.println("4 is factor of 212");
        }
        System.out.println();

        //determina si una cadena forma parte de otra
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Functional Interface";
        if(isIn.test(str,"face")){
            System.out.println("'face' is found ");
        }else {
            System.out.println("'face' isn't found");
        }
    }
}
