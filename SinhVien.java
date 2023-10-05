import java.io.Serializable;

public class SinhVien implements Serializable {
    private String ma, name, lop;
    public SinhVien(String ma, String name, String lop)
    {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + lop;
    }
}