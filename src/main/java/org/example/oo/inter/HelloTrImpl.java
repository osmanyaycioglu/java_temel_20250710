package org.example.oo.inter;

public class HelloTrImpl implements IHello {

    private String prefix;


    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Merhaba " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Güle güle " + name + " " + surname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefixParam) {
        prefix = prefixParam;
    }
}
