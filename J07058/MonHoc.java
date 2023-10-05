package J07058;

public class MonHoc{
    private String ma, mon, hinhthucthi;
    public MonHoc(String ma, String mon, String hinhthucthi)
    {
        this.ma = ma;
        this.mon = mon;
        this.hinhthucthi = hinhthucthi;
    }
    public String getMa()
    {
        return ma;
    }
    public String toString()
    {
        return ma + " " + mon + " " + hinhthucthi;
    }
}
