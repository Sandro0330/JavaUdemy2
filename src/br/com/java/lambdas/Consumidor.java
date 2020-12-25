package br.com.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + " !!! ");

        Produto p1 = new Produto("Tv", 2000.50, 0.09);
        imprimir.accept(p1);

        Produto p2 = new Produto("Mini-System", 100.00, 0.05);
        Produto p3 = new Produto("DVD", 200.50, 0.5);
        Produto p4 = new Produto("Celular", 900.99, 0.10);
        Produto p5 = new Produto("Tv", 1000.99, 0.6);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);

        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
