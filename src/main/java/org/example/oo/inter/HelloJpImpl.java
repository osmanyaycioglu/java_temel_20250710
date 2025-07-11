package org.example.oo.inter;

public class HelloJpImpl implements IHello {

    private String prefix;


    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Ha " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Ho " + name + " " + surname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefixParam) {
        prefix = prefixParam;
    }
}
