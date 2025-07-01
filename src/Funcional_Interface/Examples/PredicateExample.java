package Funcional_Interface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

//    Predicate representa uma função que aceita um argumento do tipo T
//    e retorna um valor booleano (true or false).
//    É comumente usada para filtrar os elementos do Stream com base em
//    alguma condição.
    public static void main(String[] args) {

//        criando uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

//        cria um predicate para verificar se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

//        Uso da Stream para filtrar as palavras que tem mais de 5 caracteres e
//         imprimir cada palavra que passou no filtro.

        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
