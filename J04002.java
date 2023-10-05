import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height;
        String color;
        width = sc.nextDouble();
        height = sc.nextDouble();
        color = sc.next();
        Rectange hcn = new Rectange(width, height, color);
        int x = (int)(hcn.getWidth()*10);
        int y = (int)(hcn.getHeight()*10);
        if(x%10==0 && y%10==0)
        {
            System.out.println((int)hcn.findPerimeter() + " " + (int)hcn.findArea() + " " + chuan_hoa(hcn.getColor()));
        }
        else
        {
            System.out.println("INVALID");
        }
        sc.close();
    }
    public static String chuan_hoa(String s)
    {
        String st = s.toLowerCase();
        st = String.valueOf(st.charAt(0)).toUpperCase() + st.substring(1);
        return st;
    }
}

class Rectange{
    private double width, height;
    private String color;
    public Rectange()
    {
        this.width = 1;
        this.height = 1;
    }
    public Rectange(double width, double height, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public double findArea()
    {
        return this.width*this.height;
    }
    public double findPerimeter()
    {
        return this.width*2 + this.height*2;
    }
}
