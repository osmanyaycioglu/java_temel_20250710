package org.example.java.exp;

import java.util.Scanner;

public class ExpRun {

    public static void main(String[] args) {
        ExpRun expRunLoc = new ExpRun();

        try {
            expRunLoc.myMethod2("os");
        } catch (MyException eParam) {
            System.out.println("Problem oluştu : " + eParam.getNedeni());
        } finally {
            System.out.println("final block");
        }

        try {
            expRunLoc.myMethod("os");
        } catch (Exception eParam) {
            System.out.println("Problem oluştu ...");
        }




        int iLoc = 0;
        try(Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("giriş yapın : ");
            iLoc = scannerLoc.nextInt();
            System.out.println("Girdiğiniz sayı : " + iLoc);
        } catch (Exception eParam) {
            eParam.printStackTrace();
        }


    }

    public String myMethod(String str) {
        if (str.length() < 4){
            throw new IllegalArgumentException("String 4 den küçük olamaz");
        }
        return "güzel data : " + str;
    }

    public String myMethod2(String str) throws MyException {
        if (str.length() < 4){
            throw new MyException("String 4 den küçük olamaz");
        }
        return "güzel data : " + str;
    }

}
