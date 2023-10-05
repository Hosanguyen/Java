package J04004;

public class PhanSo {
    private long tuSo, mauSo;
    public PhanSo(long tuSo, long mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public static PhanSo sum(PhanSo a, PhanSo b)
    {
        return new PhanSo(a.tuSo*b.mauSo + a.mauSo*b.tuSo, a.mauSo*b.mauSo);
    }
    private long ucln(long a, long b)
    {
        if(b==0)
        {
            return a;
        }
        return ucln(b, a%b);
    }
    private void rutGonPhanSo()
    {
        long x = ucln(tuSo, mauSo);
        this.tuSo/=x;
        this.mauSo/=x;
    }
    public String toString()
    {
        rutGonPhanSo();
        return tuSo + "/" + mauSo;
    }
}
