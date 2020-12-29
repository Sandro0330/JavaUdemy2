package br.com.java.stream_api;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map1 {

    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Porsche ", "Honda \n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print); //Todas as letras da lista maiúscula

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; //primeira letra de cada palavra
        UnaryOperator<String> grito = n -> n + "!!! "; //Iterando com o sinal

       // System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

        System.out.println("----Usando Composição----");
        marcas.stream().map(maiuscula).forEach(print);

        System.out.println("----Usando Composição----");
        marcas.stream().map(maiuscula).map(primeiraLetra).forEach(print);

        System.out.println("\n----Usando Composição----");
        marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);

        System.out.println("\n\n--------UtilitarioMap---------");
        marcas.stream().map(UtilitarioMap.maiuscula).map(primeiraLetra).map(grito).forEach(print);


        System.out.println("----UtilitarioMap----");
        marcas.stream().map(UtilitarioMap.maiuscula) // Usando a função
                .map(primeiraLetra)
                .map(UtilitarioMap::grito) //Usando referência
                .forEach(print);

    }

}