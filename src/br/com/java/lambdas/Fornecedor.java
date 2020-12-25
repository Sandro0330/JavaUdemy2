package br.com.java.lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier< List<String> > umaLista = () -> Arrays.asList("Sandro", "Regina", "Uilson", "Monaliza");
        System.out.println(umaLista.get());
    }
}
