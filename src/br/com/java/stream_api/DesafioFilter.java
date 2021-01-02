package br.com.java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {
        Produto p1 = new Produto("Dvd", 279.00, 0.22, 30);
        Produto p2 = new Produto("TV", 1279.00, 0.25, 60);
        Produto p3 = new Produto("Liquidificador", 159.00, 0.10, 20);
        Produto p4 = new Produto("Batedeira", 220.00, 0.11, 25);
        Produto p5 = new Produto("Microondas", 450.00, 0.14, 50);
        Produto p6 = new Produto("Cafeteira", 142.00, 0.10, 25);
        Produto p7 = new Produto("Mini-System", 1220.00, 0.27, 34);
        Produto p8 = new Produto("Notebook", 2450.00, 0.22, 120);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

        //Filter e Map
        Predicate<Produto> superPromocao = p -> p.desconto >= 0.14;
        Predicate<Produto> freteGratis = p -> p.valorFrete >= 20;
        Predicate<Produto> produtoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;

        produtos.stream().filter(superPromocao).filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional)
                .forEach(System.out::println);
    }
}
