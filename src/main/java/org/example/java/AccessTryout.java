package org.example.java;

public class AccessTryout {
    public static String staticField1;

    private String field1;


    public static void staticTest(){
        staticField1 = "osman";
    }

    public static void main(String[] args) {
        Person personLoc = new Person();
        personLoc.surname = "yay";
        personLoc.address = "test";
        personLoc.age = 100;

        personLoc.weight = 100;
        personLoc.height = 200;
        personLoc.stepCount = 1004L;

        AccessTryout accessTryoutLoc1 = new AccessTryout();
        accessTryoutLoc1.setField1("deneme");
        AccessTryout.staticField1 = "1";
        accessTryoutLoc1.setField1("poker");


        AccessTryout accessTryoutLoc2 = new AccessTryout();
        accessTryoutLoc2.setField1("test");
        AccessTryout.staticField1 = "2";

        Person personLoc2 = personLoc;

        Person personLoc3 = personLoc2;

        personLoc = null;

    }

    public String getField1() {
        return field1;
    }

    public void setField1(final String field1Param) {
        field1 = field1Param;
    }
}
