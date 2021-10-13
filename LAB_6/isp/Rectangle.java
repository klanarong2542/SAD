// Change package location
package lsp;

// Implements Area
public class Rectangle implements Area {
    // DO NOT EDIT THE FILE FROM THIS LINE ONWARD!!
    private int width;
    private int height;

    Rectangle(int width, int height) {
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

    public int getArea() {
        return width * height;
    }
}