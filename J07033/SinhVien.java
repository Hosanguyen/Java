package J07033;

public class SinhVien {
    private String ma, name, lop, email;
    public SinhVien(String ma, String name, String lop, String email)
    {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    private void chuanHoaName()
    {
        String[] s = this.name.trim().replaceAll("\\s+", " ").toLowerCase().split(" ");
        String res = "";
        for(String x:s)
        {
            res += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
        }
        this.name = res.trim();
    }
    public String getMa()
    {
        return this.ma;
    }
    public String toString()
    {
        chuanHoaName();
        return ma + " " + name + " " + lop + " " + email;
    }
}
