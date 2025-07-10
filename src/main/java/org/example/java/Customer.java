package org.example.java;

// Camel   customerProcess
// Pascal  CustomerProcess
// Snake  customer_process
// kebap  customer-process


public class Customer {
    private final String name;

    public Customer(final String nameParam) {
        name = nameParam;
    }

    public void sayHello(){


        System.out.println("My name is : " + name);

    }

    public void say(final String name){
        // name = "osman";
        System.out.println("My name is : " + name);
    }

    public String getName() {
        return name;
    }


}
