package br.com.java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {


        Aluno2 a1 = new Aluno2("Sandro", 5.8);
        Aluno2 a2 = new Aluno2("Lucia", 7.8);
        Aluno2 a3 = new Aluno2("Maria", 7.8);
        Aluno2 a4 = new Aluno2("Uilson", 4.8);

        List<Aluno2> alunos = Arrays.asList(a1, a2, a3, a4);

        //Média dos alunos com nota maior que 7
        Predicate<Aluno2> aprovado = a -> a.nota >= 7;
        Function<Aluno2, Double> apenasNota = a -> a.nota;
        BiFunction<Media, Double, Media> calculadoraMedia = (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calculadoraMedia, combinarMedia);

        System.out.println("A média do aluno é " + media.getValor());

    }



}
