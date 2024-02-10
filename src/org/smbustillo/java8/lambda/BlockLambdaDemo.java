package org.smbustillo.java8.lambda;

import org.smbustillo.java8.lambda.interfaces.NumericFunc;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        //Devuelve el factor positivo más pequeño
        NumericFunc smallestF = n -> {
            int result = 1;

            //obtener valor absoluto
            n = n < 0 ? -n : n;

            for(int i = 2; i <= n/i; i++ ){
                if((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        System.out.println("Smallest factor of 7 is " + smallestF.func(7));
        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
    }
}
