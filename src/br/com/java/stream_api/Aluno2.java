package br.com.java.stream_api;

public class Aluno2 {
    final String nome;
    final double nota;
    final boolean bomComportamento;

    public Aluno2(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno2(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return "Aluno2{" +
                "nome = '" + nome + '\'' +
                ", nota = " + nota +
                '}';
    }
}
