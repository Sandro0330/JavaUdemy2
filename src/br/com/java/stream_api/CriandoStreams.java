package br.com.java.stream_api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "PHP ", "JavaScript\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "C++ ", "Go ", "Ruby\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print); // Selecionando a lista

        List<String> outraLangs = Arrays.asList("C ", "Kotlin ", "Visual Basic\n ");
        outraLangs.stream().forEach(print);
        outraLangs.parallelStream().forEach(print); //Stream paralela

       // Stream.generate(() -> "a").forEach(print); //Stream infinita

//        Consumer<Integer> teste = System.out::println;
//        Stream.iterate(0, n -> n + 1).forEach(teste); //Gerando Stream numérica

    }
}
