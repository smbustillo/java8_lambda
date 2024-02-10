package org.smbustillo.java8.lambda;

import org.smbustillo.java8.lambda.interfaces.StringTest;

public class LambdaDemo3 {
    public static void main(String[] args) {
        //Determina si una cadena forma parte de otra
        StringTest isIn = (a,b) -> a.indexOf(b) != -1;

        String str = "This is a test";
        System.out.println("Testing string: " + str);

        if(isIn.test(str,"is")){
            System.out.println("'Is' is found");
        }else {
            System.out.println("'Is' is not found");
        }

        if(isIn.test(str,"xyz")){
            System.out.println("'xyz' is found");
        }else {
            System.out.println("'xyz' is not found");
        }

    }
}
