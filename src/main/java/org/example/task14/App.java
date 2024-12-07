package org.example.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        People p1 = new People("Olya", 22, "female");
        People p2 = new People("Bob", 23, "male");
        People p3 = new People("Dasha", 24, "female");
        People p4 = new People("Jack", 25, "male");
        People p5 = new People("John", 36, "male");
        People p6 = new People("Mary", 27, "female");
        People p7 = new People("Sasha", 28, "female");
        People p8 = new People("Masha", 36, "female");

        List<People> humanList = new ArrayList<People>();
        humanList.add(p1);
        humanList.add(p2);
        humanList.add(p3);
        humanList.add(p4);
        humanList.add(p5);
        humanList.add(p6);
        humanList.add(p7);
        humanList.add(p8);

        Double middleage = humanList.stream()
                .filter(p -> p.getGender().equals("female") && p.getAge() > 25)
                .collect(Collectors.averagingDouble(People::getAge));
        System.out.println(middleage);

        Map<Integer, List<People>> humanMap = humanList.stream()
                .collect(Collectors.groupingBy(People::getAge));
        System.out.println(humanMap);

    }

}
