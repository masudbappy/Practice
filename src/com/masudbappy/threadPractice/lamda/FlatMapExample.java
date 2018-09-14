package com.masudbappy.threadPractice.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8);
        List<Integer> list3 = Arrays.asList(9,10,11,12);

        List<List<Integer>> lists = Arrays.asList(list1,list2,list3);
        System.out.println(lists);

        Function<List<?>, Integer> size = List::size;
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();

        lists.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);
    }
}
