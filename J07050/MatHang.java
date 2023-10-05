package J07050;

public class MatHang {
    private String ma, name, nhom;
    private double giaMua, giaBan;
    private double loiNhuan;
    private static int solg = 0;
    public MatHang(String name, String nhom, double giaMua, double giaBan)
    {
        solg++;
        if(solg<10)
        {
            ma = "MH0" + String.valueOf(solg);
        }
        else
        {
            ma = "MH" + String.valueOf(solg);
        }
        this.name = name;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }
    public double getLoiNhuan()
    {
        return this.loiNhuan;
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
