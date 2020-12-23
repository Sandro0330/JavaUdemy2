package br.com.java.lambdas;

public class ClassePrincipal {
    public static void main(String[] args) {

        Calculo calc = new Somar();
        System.out.println(calc.executar(2,8));


        calc = new Multiplicar();
        System.out.println(calc.executar(2, 5));
    }

}
