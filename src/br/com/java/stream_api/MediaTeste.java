package br.com.java.stream_api;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media().adicionar(7.8).adicionar(6.5);
        Media m2 = new Media().adicionar(5.6).adicionar(7.3);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
