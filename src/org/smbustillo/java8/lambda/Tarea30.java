package org.smbustillo.java8.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Tarea30 {
    public static void main(String[] args) {
        Map<String, Integer> resultado = new HashMap<>();

        Function<String,HashMap>  contarPalabras = texto -> {
          HashMap<String,Integer>contador = new HashMap<>();

          String[] palabras = texto.split("\\s+");

          for(String p: palabras){
              if(!contador.containsKey(p)){
                  contador.put(p,0);
              }
              int cont = contador.get(p);
              contador.put(p,cont+1);
          }

          return contador;
        };

        resultado = contarPalabras.apply("Me gusta como como lo que como");
        String palabra = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {

            if(entry.getValue()>max){
                max = entry.getValue();
                palabra = entry.getKey();
            }
        }

        System.out.println("La palabra más repetida es: " + palabra);
        System.out.println("Ha aparecido " + max + " veces");

    }
}
