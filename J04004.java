import java.util.Scanner;

public class J04004{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        PhanSo p1 = new PhanSo(a, b);
        PhanSo p2 = new PhanSo(c, d);
        PhanSo tong = PhanSo.add(p1, p2);
        tong.display();
        sc.close();
    }
}

class PhanSo{
    private int tuSo, mauSo;
    public PhanSo()
    {
        tuSo = 1;
        mauSo = 1;
    }
    public PhanSo(int tuSo, int mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public static PhanSo add(PhanSo p1, PhanSo p2)
    {
        PhanSo tong = new PhanSo();
        tong.tuSo = p1.tuSo*p2.mauSo + p1.mauSo*p2.tuSo;
        tong.mauSo = p1.mauSo*p2.mauSo;
        return tong;
    }
    private static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
    private void rutGonPhanSo()
    {
        int x = gcd(tuSo, mauSo);
        this.tuSo /=x;
        this.mauSo /=x;
    }
    public void display()
    { 
        rutGonPhanSo();
        System.out.println(tuSo + "/" + mauSo);
    }
}