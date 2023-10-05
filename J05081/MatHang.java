package J05081;

public class MatHang {
    private String ma, name, donvi;
    private int giamua, giaban, loinhuan;
    private static int solg = 0;
    public MatHang(String name, String donvi, int giamua, int giaban)
    {
        solg++;
        if(solg<10)
        {
            ma = "MH00" + String.valueOf(solg);
        }
        else
        {
            ma = "MH0" + String.valueOf(solg);
        }
        this.name = name;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }
    public String getMa()
    {
        return ma;
    }
    public int getLoiNhuan()
    {
        return loinhuan;
    }
    public String toString()
    {
        return ma + " " + name + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan;
    }
}
