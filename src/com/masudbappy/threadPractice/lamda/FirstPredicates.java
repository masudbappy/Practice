package com.masudbappy.threadPractice.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one","two","three","four");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");


//        stream
//                .filter(p2.or(p3))
//                .forEach(s-> System.out.println(s));
        List<String> list = new ArrayList<>();

        stream
                .peek(System.out::println)
                .filter(p2.or(p3))
                .forEach(list::add);
        System.out.println("DOne");
        System.out.println("Size "+list.size());

    }
}
