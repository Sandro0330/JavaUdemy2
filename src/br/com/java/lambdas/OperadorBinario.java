package br.com.java.lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) /2;
        System.out.println(media.apply(9.8, 5.7));
        
        System.out.println("=============================================================");
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) /2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(5.1, 4.4));
                //ou

        BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado2.apply(7.1, 7.4 ));
        System.out.println("=============================================================");


        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(5.8, 5.6));
        System.out.println("=============================================================");

    }


}
