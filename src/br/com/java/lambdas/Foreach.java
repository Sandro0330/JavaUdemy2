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
        System.out.println("\nMethod Reference #1...");
        aprovados.forEach(System.out::println);


        // Foreach Funcional
        System.out.println("\nPercorrendo o Array com Lambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));


        System.out.println("\nMethod Reference #2...");
        aprovados.forEach(Foreach::meuImprimir);
    }
    // Foreach Funcional
    static void meuImprimir(String nome) {
        System.out.println("Oi meu nome é " + nome);
    }

}