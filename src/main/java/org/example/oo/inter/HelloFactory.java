package org.example.oo.inter;

public class HelloFactory {

    public static IHello createHello(String index){
        switch (index) {
            case "1":
                return new HelloImpl();
            case "2":
                return new HelloTrImpl();
            case "3":
                return new HelloEspImpl();
            case "4":
                return new HelloJpImpl();
            default:
                return new HelloImpl();
        }
    }

}
