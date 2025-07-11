package org.example.java.lambdas;

import java.util.Iterator;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<String> listLoc = List.of("osman","ali","veli","osman","ayşe","fatma","ali");

        for (int i = 0; i < listLoc.size(); i++) {
            String stringLoc = listLoc.get(i);
            System.out.println("Index : " + i + " data : " + stringLoc );
        }

        System.out.println("-----------------------------");

        Iterator<String> iteratorLoc = listLoc.iterator();
        while (iteratorLoc.hasNext()){
            String nextLoc = iteratorLoc.next();
            System.out.println("Data : " + nextLoc);
        }

        System.out.println("-----------------------------");

        for (String stringLoc : listLoc) {
            System.out.println("Foreach data : " + stringLoc);
        }

        System.out.println("-----------------------------");

        listLoc.forEach(s -> System.out.println("Lambda Foreach : " + s));

    }

}
