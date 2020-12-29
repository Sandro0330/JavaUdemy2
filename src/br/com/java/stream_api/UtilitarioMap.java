package br.com.java.stream_api;

import java.util.function.UnaryOperator;

public class UtilitarioMap {
    public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; //primeira letra de cada palavra
    public static final String grito (String n) {
        return n + "!!! "; //Iterando com o sinal
    }

}
