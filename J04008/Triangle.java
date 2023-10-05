package J04008;

public class Triangle {
    private Point a, b, c;
    public Triangle(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean checkTriangle()
    {
        double x = Point.distance(a, b);
        double y = Point.distance(b, c);
        double z = Point.distance(c, a);
        if(x+y<=z || y+z<=x || z + x <=y)
        {
            return false;
        }
        return true;
    }
    public double findPerimeter()
    {
        return Point.distance(a, b) + Point.distance(b, c) + Point.distance(c, a);
    }
}
