package first;

import second.ProxyPicture;

public class App {
    public static void main(String[] args) {

        /**
         * Instanziierung von RealPicture ist nicht möglich, da die Klasse protected ist und wir diese nicht editieren oder verschieben dürfen.
         * Auch die Klasse App muss im aktuellen Package bleiben.
         * Um RealPicture zu nutzen hat ein Kollege einen Proxy gebaut (ProxyPicture), leider hat er das Pattern nicht so ganz verstanden und dadurch den Proxy nicht optimal gestaltet.
         * Verbessere den Proxy
         */
        ProxyPicture image = new ProxyPicture("largePicture.jpg");

        //picture will be loaded from server
        image.draw();
        System.out.println("now read from cache");

        //cached picture (do not download picture again)
        image.draw();
    }
}
