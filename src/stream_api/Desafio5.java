package stream_api;

import Funcional_Interface.Examples.BinaryOperatorExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio5 {
//      Fazer um programa para cálcular a média dos números maiores que 5

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> mediaNumeros = (n1, n2) -> (n1 + n2) / 2;
        int resultado = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, mediaNumeros);

        System.out.println("A média dos números é: " + resultado);
    }
}
