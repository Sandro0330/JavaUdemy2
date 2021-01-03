package br.com.java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
        Aluno2 a1 = new Aluno2("Sandro", 5.4);
        Aluno2 a2 = new Aluno2("Lucia", 3.8);
        Aluno2 a3 = new Aluno2("Maria", 4.8);
        Aluno2 a4 = new Aluno2("Uilson", 2.8);

        List<Aluno2> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno2> aprovado = a -> a.nota >= 7;
        Predicate<Aluno2> reprovado = aprovado.negate(); //outra forma de uasr o negate ex: linha 25


        System.out.println(alunos.stream().allMatch(aprovado));//Todos aprovados ?
        System.out.println(alunos.stream().anyMatch(aprovado));//Algun aprovado ?
        System.out.println(alunos.stream().noneMatch(aprovado));//Nenhum aprovado ?
        System.out.println(alunos.stream().allMatch(aprovado.negate())); //negando (aprovado)
        System.out.println(alunos.stream().noneMatch(reprovado));


    }
}
