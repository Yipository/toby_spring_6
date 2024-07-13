package spring.toby_spring_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(6, 1, 7, 8);
        System.out.println(scores);
        Collections.sort(scores);

        scores.forEach(System.out::println);
    }
}
