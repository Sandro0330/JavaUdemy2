package br.com.java.stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Sandro", "Maria", "Joao", "Uilson");

        System.out.println("Usando o forEach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> iteracao = aprovados.iterator();
        while (iteracao.hasNext()) {
            System.out.println(iteracao.next());
        }

        System.out.println("\nUsando Stream...");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println); //Laço interno
    }
}
