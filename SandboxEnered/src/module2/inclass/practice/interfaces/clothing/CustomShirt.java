package module2.practice.interfaces.clothing;

public class CustomShirt extends Shirt {
    private int width;
    private int height;

    public CustomShirt(int id, double price, char colorCode, char sizeCode, String fit,
                       int width, int height) {
        super(id, price, colorCode, sizeCode, fit);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
