package second;

public class ProxyPicture {
    private String fileName;

    public ProxyPicture(String fileName) {
        this.fileName = fileName;
    }

    public void draw() {
        new RealPicture(fileName).display();
    }
}
