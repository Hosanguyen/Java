package J01025;

public class HCN {
    private Point leftDown;
    private Point rightUp;
    public HCN(Point lefDown, Point rightUp)
    {
        this.leftDown = lefDown;
        this.rightUp = rightUp;
    }
    //tim hinh vuong bao trum 2 hinh chu nhat
    public static HCN HinhVuong(HCN a, HCN b)
    {
        Point leftDown = new Point(Math.min(a.leftDown.getX(), b.leftDown.getX()), Math.min(a.leftDown.getY(), b.leftDown.getY()));
        Point rightUp = new Point(Math.max(a.rightUp.getX(), b.rightUp.getX()), Math.max(a.rightUp.getY(), b.rightUp.getY()));
        return new HCN(leftDown, rightUp);
    }
    public int chieuDai()
    {
        return Math.abs(leftDown.getX() - rightUp.getX());
    }
    public int chieuRong()
    {
        return Math.abs(leftDown.getY() - rightUp.getY());
    }
    public int dienTich()
    {
        return chieuDai()*chieuRong();
    }
}
