package J04015;

public class GiaoVien {
    private String ma, name;
    private long baseWage, wage;
    private int heso;
    private long phucap;
    public GiaoVien(String ma, String name, long baseWage)
    {
        this.ma = ma;
        this.name = name;
        this.baseWage = baseWage;
        String pc = ma.substring(0, 2);
        this.heso = Integer.parseInt(ma.substring(2));
        if(pc.compareTo("HT")==0)
        {
            this.phucap = 2000000;
        }
        else
        if(pc.compareTo("HP")==0)
        {
            this.phucap = 900000;
        }
        else
        {
            this.phucap = 500000;
        }
        this.wage = this.baseWage*heso + phucap;
    }
    public String toString()
    {
        return ma + " " + name + " " + heso + " " + phucap + " " + wage;
    }
}
