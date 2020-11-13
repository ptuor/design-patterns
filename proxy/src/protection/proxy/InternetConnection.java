package protection.proxy;

public final class InternetConnection {
    private InternetConnection() {
    }

    static RealInternet create() {
        return new RealInternet();
    }
}
