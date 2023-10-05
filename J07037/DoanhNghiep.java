package J07037;

public class DoanhNghiep {
    private String ma, name;
    private int solgSV;
    public DoanhNghiep(String ma, String name, int solgSV)
    {
        this.ma = ma;
        this.name = name;
        this.solgSV = solgSV;
    }
    public String getMa()
    {
        return this.ma;
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + solgSV;
    }
}
