import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> list = new ArrayList<MonHoc>();
        for(int i = 0; i<n; i++)
        {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(x);
        }
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2)
            {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(int i = 0; i<n; i++)
        {
            System.out.println(list.get(i).toString());
        }
        sc.close();
    }
}

class MonHoc{
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