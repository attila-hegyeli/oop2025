package Rofelmero2;

public class Point {
    private int x,y;
    private static final Point ORIGIN = new Point(0,0);

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public static double distance(Point a, Point b)
    {
        return Math.sqrt((b.x-a.x)*(b.x-a.x) + (b.y-a.y)*(b.y-a.y));
    }
    public double distanceFromOrigin()
    {
        return distance(this, ORIGIN);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
