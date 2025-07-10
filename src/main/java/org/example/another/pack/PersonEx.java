package org.example.another.pack;

import org.example.java.Customer;
import org.example.java.Person;

public class PersonEx extends Person {


    public void newMethod1(){
        age = 100;
    }

    @Override
    public String sayHello() {
        return "Helllooooo " + getName() + " " + surname;
    }

    public static void main(String[] args) {
        Person personLoc = new Person();
        personLoc.surname = "yay";

    }
}
