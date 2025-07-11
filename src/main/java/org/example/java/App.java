package org.example.java;


import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Customer customerLoc = new Customer("osman");

        final Customer customerLoc2 = new Customer("osman2");

        // customerLoc2 = customerLoc;
        // String nameLoc = customerLoc.getName();

        String stringLoc = "osman";
        stringLoc = stringLoc + " yaycıoğlu";
        String concatLoc = stringLoc.concat(" deneme");
        System.out.println("After concat : " + stringLoc);
        Integer integerLoc = 100;
        BigDecimal bigDecimalLoc = new BigDecimal(100);
        LocalDateTime localDateTimeLoc = LocalDateTime.now();

    }
}
