package J07048;

public class SanPham {
    private String ma, name;
    private int giaban;
    private int baohanh;
    public SanPham(String ma, String name, int giaban, int baohanh)
    {
        this.ma = ma;
        this.name = name;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }
    public String getMa()
    {
        return this.ma;
    }

    public int getGiaBan()
    {
        return this.giaban;
    }

    @Override
    public String toString()
    {
        return ma + " " + name + " " + giaban + " " + baohanh;
    }
}
