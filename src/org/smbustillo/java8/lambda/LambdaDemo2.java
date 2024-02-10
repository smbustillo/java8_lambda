package org.smbustillo.java8.lambda;

import org.smbustillo.java8.lambda.interfaces.NumericTest;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //Determinar si un número es factor de otro número
        NumericTest isFactor = (n,d) -> (n % d) == 0;

        if(isFactor.test(10,2)){
            System.out.println("2 is a factor of 10");
        }
        if(!isFactor.test(10,3)){
            System.out.println("3 is not a factor of 10");
        }
        System.out.println();

        //Determina si el primer argumento es menor que el segundo
        NumericTest lessThan = (n,m) -> (n < m);

        if(lessThan.test(2,10)){
            System.out.println("2 is less than 10");
        }
        if(!lessThan.test(10,2)){
            System.out.println("10 is not less than 2");
        }
        System.out.println();

        //Devuelve true si los valores absolutos son iguales
        NumericTest absEqual = (n,m) -> (n < 0 ? -n  : n ) == (m < 0 ? -m : m);

        if(absEqual.test(4,-4)){
            System.out.println("Absolute values 4 and -4 are equal");
        }
        if(!absEqual.test(4,-5)){
            System.out.println("Absolute values 4 and -5 are NOT equal");
        }
    }
}
