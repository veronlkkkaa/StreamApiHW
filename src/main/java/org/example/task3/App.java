package org.example.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<List<String>> threeList = new ArrayList<>(List.of(
                List.of("a", "b", "c"),
                List.of("a", "d", "c"),
                List.of("b", "a", "o")
        ));
        threeList.stream()
                .flatMap(Collection::stream)
                .distinct()
                .forEach(System.out::println);
    }


}
