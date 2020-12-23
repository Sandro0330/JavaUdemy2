package br.com.java.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List <String> aprovados = Arrays.asList("Ana", "Bia", "Carol", "Deise");
        //Percorrendo o Array
        System.out.println("Forma tradicional...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nPercorrendo o Array com Lambda #01...");

        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!!!");
        });

       // aprovados.forEach((nome) -> System.out.println(nome + "!!!!")); funciona do mesmo jeito

        System.out.println("\nMethod Reference...");
        aprovados.forEach(System.out::println);

    }
}
