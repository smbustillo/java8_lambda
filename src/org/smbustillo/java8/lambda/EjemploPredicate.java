package org.smbustillo.java8.lambda;

import model.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> t1 = num -> num > 10;
        boolean resultado = t1.test(6);
        System.out.println("resultado = " + resultado);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals;
        System.out.println(t3.test("susan","susan"));

        BiPredicate<Integer,Integer> t4 = (i,j) -> j > i;
        boolean r2 = t4.test(5,10);
        System.out.println(r2);

        Usuario a1 = new Usuario();
        Usuario b1 = new Usuario();
        a1.setNombre("lola");
        b1.setNombre("susana");
        BiPredicate<Usuario,Usuario> t5 = (a,b) -> a.getNombre().equals(b.getNombre());
        System.out.println(t5.test(a1,b1));
    }
}
