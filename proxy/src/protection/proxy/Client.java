package protection.proxy;

public class Client {
    public static void main(String[] args) {
        // todo: ersetzen durch: Internet internet = InternetConnection.create();
        // Der Rest soll nicht angepasst werden
        RealInternet internet = InternetConnection.create();
        try {
            internet.connectTo("ibw.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
