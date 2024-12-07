package org.example.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {

        List<String> wordsList = List.of("Апельсин", "Береза", "Автомобиль","Атмосфера","Арбуз", "Азбука", "Аквариум", "Аметист", "Вода", "Гитара", "Дерево", "Кот");

        wordsList.stream()
                .filter(word -> word.startsWith("А"))
                .forEach(System.out::println);

    }
}

