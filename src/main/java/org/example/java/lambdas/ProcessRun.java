package org.example.java.lambdas;

import org.example.java.Customer;

public class ProcessRun {
    public static void main(String[] args) {

        Customer customerLoc = new Customer("osman");

        final int intVal = 100;

        IProcess processLoc = new MyProcess();

        IProcess processLoc1 = pr -> "Executed : " + pr + " " + intVal + " " + customerLoc.getName();

        IProcess processLoc2 = new IProcess() {

            @Override
            public String execute(final String pName) {
                return "Executed " + pName + " " + intVal + " " + customerLoc.getName();
            }
        };
        customerLoc.setName("xyz");

        IExecution executionLoc = (a,b) -> "execution : " + a + " " + b;

        IExecution executionLoc2 = (a,b) -> {
            System.out.println("Job starting : " + a);
            return "execution : " + a + " " + b;
        };

    }
}
