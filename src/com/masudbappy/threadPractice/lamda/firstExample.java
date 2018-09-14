package com.masudbappy.threadPractice.lamda;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class firstExample {
    public static void main(String[] args) throws InterruptedException{
        FileFilter fileFilter = (file) -> file.getName().endsWith(".java");

    /*FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().endsWith(".java");
        }
    };*/
        /*File dir = new File("/home/masudbappy/IdeaProjects/test/src/main/java/day23");
        File[] files = dir.listFiles(fileFilter);
        for (File f : files){
            System.out.println(f);
        }*/
        /*Runnable runnable = () ->{
          for (int i =0; i<3 ; i++){
              System.out.println("Hello thread "+Thread.currentThread().getName());
          }
        };
        Thread t = new Thread(runnable);
        t.start();*/

        /*List<String> strings = Arrays.asList("one","two","three");
        Consumer<String > c1 = System.out::println;
        strings.forEach(c1); */
        List<String > list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

//        Consumer<String> c1 = System.out::println;
//        list.forEach(c1);
//        Consumer<String> c1 = list::add;
//        Consumer<String> c2 = System.out::println;

    }


}
