package Ropfelmero;

import java.awt.geom.Area;

public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int Area() {
        return this.height * this.width;
    }
    public static int Areak(Rectangle r1,Rectangle r2)
    {
        return r1.Area()-r2.Area();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
