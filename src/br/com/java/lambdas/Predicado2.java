package br.com.java.lambdas;

import java.util.List;
import java.util.function.Predicate;
//Imprime os numeros inteiro aprtir de 5
class BiggerThanFive<E> implements Predicate<Integer> {
    @Override
    public boolean test (Integer v) {
        Integer cinco = 5;

        return v > cinco;
    }
}



public class Predicado2 {

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12 );

        BiggerThanFive<Integer> btf = new BiggerThanFive<>();
        nums.stream().filter(btf).forEach(System.out::println);
    }
}
