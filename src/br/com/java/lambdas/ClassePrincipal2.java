package br.com.java.lambdas;

public class ClassePrincipal2 {
    public static void main(String[] args) {
        //Usando expressões Lambdas
        Calculo soma = (x , y) -> {
          return x + y;
        };
        System.out.println(soma.executar(2, 4));

        Calculo mult = (x, y) -> { // precisa de retorno por causa das chaves
            return x * y;
        };
        System.out.println(mult.executar(4, 5));

        soma = (x, y) -> x / y; //Não precisa de retorno pois não tem chaves, pode até fazer uma nova operação
        System.out.println(soma.executar(8, 2)); // o return já esta implicito

        System.out.println(soma.saudacao());


        System.out.println(Calculo.aviso());
    }
}
