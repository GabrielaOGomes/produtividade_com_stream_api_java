package Funcional_Interface.Examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    /*
    * Representa uma operação que não aceita nenhum argumento e retorna
     um resultado to tipo T.
    * É comumente usada para criar ou fornecer novos objetos de um
     determinado tipo*/

    public static void main(String[] args) {
//        usar supplier com expressão lambda para fornecer uma
//        saudação personalizada.

        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

//        Usar o supplier para obter uma lista com 5 saudações com
//        Lambda
        List<String> listaSaudacoes = Stream.generate(()-> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        //Imprimir as saudações geradas usando método de referencia
        listaSaudacoes.forEach(System.out::println);
    }
}
