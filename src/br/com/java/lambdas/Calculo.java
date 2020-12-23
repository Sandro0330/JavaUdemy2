package br.com.java.lambdas;
@FunctionalInterface //Força a classe interface ter somente um método
public interface Calculo {

    public abstract double executar(double a, double b);

    default String saudacao() { // Método desse tipo é aceito
        return "Boa noite";
    }

    static String aviso() {
        return "Estude bastante!"; // Método desse tipo é aceito
    }
}
