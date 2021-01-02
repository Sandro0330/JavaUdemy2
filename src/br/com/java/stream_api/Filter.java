package br.com.java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Sandro", 6.8);
        Aluno a2 = new Aluno("Regina", 7.8);
        Aluno a3 = new Aluno("Uilson", 7.8);
        Aluno a4 = new Aluno("Alessandro", 7.8);
        Aluno a5 = new Aluno("Maria", 4.8);
        Aluno a6 = new Aluno("Joao", 5.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

//        Predicate<Aluno> aprovado = a -> a.nota >= 7;
//        Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + " você foi aprovado(a) !!"
//        alunos.stream()
//                .filter(aprovado)
//                .map(saudacao)
//                .forEach(System.out::println);
//
        alunos.stream()
                .filter( a -> a.nota >= 7)
                .map(a -> "Parabéns " + a.nome + " você foi aprovado(a) !!")
                .forEach(System.out::println);
    }
}
