package first;

import second.Picture;
import second.ProxyPicture;

public class App {
    public static void main(String[] args) {
        Picture image = new ProxyPicture("largePicture.jpg");

        //picture will be loaded from server
        image.display();
        System.out.println("now read from cache");

        //cached picture
        image.display();
    }
}
