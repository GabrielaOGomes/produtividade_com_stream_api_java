package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
//       Verificar se todos os números da lista são positivos:

    public static void main(String[] args) {
//      Criando a lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//      Predicate para fazer a Stream da lista números
        Predicate<Integer> positivo = numero -> numero > 0;
        boolean todosPositivos = numeros.stream()  //recebe o resultado da verificação
                .allMatch(n -> n > 0); //Verifica se todos os números são maiores que 0

        numeros.stream()
                .filter(positivo) //filtra os positivos
                .forEach(System.out::print);

        System.out.println();
        System.out.println("Todos são positivos? " + todosPositivos);

    }

}
