package stream_api;

import javax.print.attribute.standard.PrintQuality;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio4 {
    //Remover todos os valores ímpares

    public static void main(String[] args) {

        //List de números Inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //usando predicate para fazer a Stream dos pares
        Predicate<Integer> numerosImpares = numero -> numero % 2 == 0;

        numeros.stream()
                //o filter filtra os impares para exibir somente os números pares
                .filter(numerosImpares)
                .forEach(System.out::print);

    }
}
