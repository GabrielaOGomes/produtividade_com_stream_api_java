package stream_api;

import Funcional_Interface.Examples.BinaryOperatorExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Desafio2 {
//    Fazer um programa que imprima a soma dos números
//    pares da lista e exiba o resultado no console.

    public static void main(String[] args) {

        //Lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Operador para somar os números pares pegando da list
        BinaryOperator<Integer> soma = Integer::sum;
        int resultado = numeros.stream()
                .filter(n -> n % 2 == 0) //filtrou somente os números pares
                .reduce(0, soma);
//        O método reduce() serve para reduzir os elementos de uma stream a um único valor
//         — como uma soma, produto, concatenação etc.

        System.out.println("A soma é: " + resultado);


    }
}
