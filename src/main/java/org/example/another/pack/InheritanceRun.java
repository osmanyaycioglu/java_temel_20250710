package org.example.another.pack;

import org.example.java.Person;

public class InheritanceRun {
    public static void main(String[] args) {
        Person personLoc = new Person();
        personLoc.sayHello();

        PersonEx personExLoc = new PersonEx();
        String   stringLoc   = personExLoc.sayHello();

        personExLoc.newMethod1();

        Person personLoc1 = new PersonEx();
        personLoc1.sayHello();

        PersonEx personExLoc1 = (PersonEx) personLoc1;

        Object personObj = new PersonEx();

        Object strObj = new String("deneme");



    }
}
