package J04002;

public class Rectange {
    private double width, height;
    private String color;
    public Rectange()
    {
        this.width = 1;
        this.height = 1;
        color = "white";
    }
    public Rectange(double width, double height, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public double findArea()
    {
        return width*height;
    }
    public double findPerimeter()
    {
        return width*2 + height*2;
    }
    public void chuanHoaColor()
    {
        color = color.toLowerCase();
        color = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
    }
}
