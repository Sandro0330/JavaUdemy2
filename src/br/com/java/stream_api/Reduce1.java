package br.com.java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 1, 9, 6, 8, 3, 5);
        BinaryOperator<Integer> soma = (a, b) -> a + b;
        int total = numbers.stream().reduce(soma).get();
        System.out.println(total);

        Integer total2 = numbers.parallelStream().reduce(10, soma);
        System.out.println(total2);

        //Resultado foi um Optional<Integer>
        numbers.stream()
                .filter(n -> n > 4 )
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
