package stream_api;

import Funcional_Interface.Examples.ConsumerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio1 {
//      Primeiro desafio: Ordenar uma lista de números em ordem crescente e exibir no console.
    public static void main(String[] args) {

        //criando a lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //para percorrer e organizar a lista
        numeros.stream()//transforma a lista em um fluxo de dados
                .sorted() //ordena em ordem crescente
                .forEach(System.out::print); //imprime cada número
    }
}
