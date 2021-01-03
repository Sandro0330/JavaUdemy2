package br.com.java.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Aluno2 a1 = new Aluno2("Sandro", 5.4);
        Aluno2 a2 = new Aluno2("Lucia", 3.8);
        Aluno2 a3 = new Aluno2("Maria", 4.8);
        Aluno2 a4 = new Aluno2("Uilson", 2.8);

        List<Aluno2> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno2> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<Aluno2> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno1.nota < aluno2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());//Maior nota
        System.out.println(alunos.stream().min(piorNota).get());//Menor nota
        System.out.println();
        System.out.println(alunos.stream().min(melhorNota).get());//Aluno com a menor nota
        System.out.println(alunos.stream().max(piorNota).get());//Aluno com pior nota
    }
}
