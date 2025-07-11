package org.example.java.exp;

public class MyException extends Exception {
    private String nedeni;

    public MyException(final String nedeniParam) {
        super(nedeniParam);
        nedeni = nedeniParam;
    }

    public String getNedeni() {
        return nedeni;
    }
}
