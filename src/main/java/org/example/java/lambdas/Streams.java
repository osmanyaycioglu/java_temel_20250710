package org.example.java.lambdas;

import java.util.Iterator;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> listLoc = List.of("osman",
                                       "ali",
                                       "veli",
                                       "osman",
                                       "ayşe",
                                       "fatma",
                                       "ali");

        listLoc.stream()
               .filter(s -> s.length() > 3)
               .filter(a -> !a.contains("e"))
               .distinct()
               .sorted()
               .forEach(s -> System.out.println("Lambda Foreach : " + s));

    }

}
