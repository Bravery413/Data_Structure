package design_pattern.structural_patterns.proxy_pattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        System.out.println("代理照片之前多做的事情");
        realImage.display();
        System.out.println("代理照片之后多做的事情");
    }
}
