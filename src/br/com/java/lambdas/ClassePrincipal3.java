package br.com.java.lambdas;

import java.util.function.BinaryOperator;

public class ClassePrincipal3 {
    //Usando expressões Lambdas
    public static void main(String[] args) {

        BinaryOperator<Double> soma = (x , y) -> {
            return x + y;
        };
            System.out.println(soma.apply(2.0, 4.0));

        soma = (x, y) -> x * y;
        System.out.println(soma.apply(2.0, 4.0));



        BinaryOperator<Integer> soma2 = (x , y) -> {
            return x + y;
        };
        System.out.println(soma2.apply(2, 4));

        soma2 = (x, y) -> x * y;
        System.out.println(soma2.apply(2, 4));
    }
}
