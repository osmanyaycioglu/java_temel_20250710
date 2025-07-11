package org.example.java.lambdas;

public class MyProcess implements IProcess{

    @Override
    public String execute(final String pName) {
        return "Executed : " + pName;
    }

}
