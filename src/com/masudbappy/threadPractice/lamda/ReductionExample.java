package com.masudbappy.threadPractice.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReductionExample {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(10,20);
        Integer red =
        list.stream()
                .reduce(0,Integer::sum);
        System.out.println("reduction= "+red);*/
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//        list.forEach(System.out::println);
        System.out.println("Print all numbers:");
        eval(list, n->true);
        System.out.println("Print all even numbers:");
        eval(list,n->n%2==0);
        System.out.println("Print numbers greater than 4");
        eval(list,n->n>4);
    }
    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for (Integer n: list){
            if (predicate.test(n)){
                System.out.println(n+" ");
            }
        }
    }
}
