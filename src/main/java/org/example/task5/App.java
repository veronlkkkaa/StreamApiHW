package org.example.task5;
package org.example.task5;

import java.util.List;

public class App {

    public class App {
        public static void main(String[] args) {
            List<Integer> numberList = List.of(1, 13, 24, 46, 56, 76, 97, 47, 454,60, 2,6);
            numberList.stream()
                    .skip(3)
                    .toList()
                    .forEach(System.out::println);
        }
    }

}
