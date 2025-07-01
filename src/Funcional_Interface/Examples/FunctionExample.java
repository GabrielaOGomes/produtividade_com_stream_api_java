package Funcional_Interface.Examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    /* Representa uma função que aceita um argumento do tipo T e retorna
     um resultado do tipo T (resultado).
     É utilizada para transformar ou mapear os elementos do Stream em
      outros valores ou tipos. */

    public static void main(String[] args) {

//    cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//    Usa a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

//    Usa a função para dobrar todos os números no Stream e armazená-la em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2 )
                .toList();

//    Imprime a lista de números dobrados
//        usando método de referência
        numerosDobrados.forEach(System.out::println);

    }
}
