package org.example.task7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(List.of("Cat","Dog","Cat","Dog","Cow","Hamster"));

        String[] array = stringList.stream()
                .distinct()
                .toArray(String[]::new);
    }
}
