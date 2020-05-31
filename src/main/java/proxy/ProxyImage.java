package proxy;

/**
 * @fileName: ProxyImage
 * @author: Cloud
 * @create: 2020-05-29
 * @description:
 **/
public class ProxyImage implements Image {

    public RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
