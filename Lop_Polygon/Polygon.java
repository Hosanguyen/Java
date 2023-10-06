package Lop_Polygon;

public class Polygon {
    private Point[] list;

    public Polygon(Point[] list)
    {
        this.list = list;
    }
    public static double getAreaTriagle(Point a, Point b, Point c)
    {
        double x = Math.sqrt( (a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()) );
        double y = Math.sqrt( (c.getX() - b.getX())*(c.getX() - b.getX()) + (c.getY() - b.getY())*(c.getY() - b.getY()) );
        double z = Math.sqrt( (a.getX() - c.getX())*(a.getX() - c.getX()) + (a.getY() - c.getY())*(a.getY() - c.getY()) );

        double p = (double)(x+y+z)/2;
        double s = (double)Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return s;
    }
    public String getArea()
    {
        double area = 0;
        for(int i = 1; i<list.length-1; i++)
        {
            area += getAreaTriagle(list[0], list[i], list[i+1]);
        }
        return String.format("%.3f", area);
    }
}
