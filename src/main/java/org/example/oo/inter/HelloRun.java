package org.example.oo.inter;

import java.util.Arrays;

public class HelloRun {

    public static void main(String[] args) {
        System.out.println("args : " + Arrays.toString(args));

        IHello helloLoc = HelloFactory.createHello(args[0]);


        System.out.println(helloLoc.sayHello("osman",
                                             "yaycıoğlu"));
        System.out.println(helloLoc.sayGoodbye("osman",
                                               "yaycıoğlu"));
    }
}
