package org.example.oo.inter;

public class HelloEspImpl implements IHello {

    private String prefix;


    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Ola " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Adios " + name + " " + surname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefixParam) {
        prefix = prefixParam;
    }
}
