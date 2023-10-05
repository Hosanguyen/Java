package J01025;

// toa do diem nguyen

public class Point {
    private int x, y;
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public static int getXmin(Point a, Point b)
    {
        return Math.min(a.getX(), b.getX());
    }
    public static int getYmin(Point a, Point b)
    {
        return Math.min(a.getY(), b.getY());
    }
    public static int getXmax(Point a, Point b)
    {
        return Math.max(a.getX(), b.getX());
    }
    public static int getYmax(Point a, Point b)
    {
        return Math.max(a.getY(), b.getY());
    }
}
