package org.smbustillo.java8.lambda;

import model.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(formato.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String,Integer> bc = (nombre,edad) -> System.out.println(nombre + " tiene " + edad + " años!");
        bc.accept("Susana",48);

        //Referencias de métodos en expresiones lambda
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola mundo!");

        List<String> nombres = Arrays.asList("susana", "lola","uxia");
        nombres.forEach(consumer2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario user = creaUsuario.get();

        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(user,"susana");
        System.out.println("Nombre user: " + user.getNombre());

        Supplier<String> proveedor = () -> "Hola Supplier";

        System.out.println(proveedor.get());
    }
}