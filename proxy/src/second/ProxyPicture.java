package second;

public class ProxyPicture implements Picture {
    private RealPicture realImage;
    private String fileName;

    public ProxyPicture(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealPicture(fileName);
        }
        realImage.display();
    }
}
