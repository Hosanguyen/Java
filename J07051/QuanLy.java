package J07051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLy {
    private ArrayList<KhachHang> dsKhachHang;
    private static int[] giaPhong = new int[5];

    public static void setGiaPhong()
    {
        giaPhong[1] = 25;
        giaPhong[2] = 34;
        giaPhong[3] = 50;
        giaPhong[4] = 80;
    }

    public QuanLy(ArrayList<KhachHang> dsKhachHang)
    {
        this.dsKhachHang = dsKhachHang;
        setGiaPhong();
    }

    public void setTienPhong()
    {
        for(KhachHang x:dsKhachHang)
        {
            x.setThanhTien( giaPhong[Integer.parseInt(String.valueOf(x.getSoPhong().charAt(0)))]);
        }
    }

    public void sort()
    {
        Collections.sort(dsKhachHang, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2)
            {
                return - (o1.getTienPhong() - o2.getTienPhong());
            }
        });
    }

    @Override
    public String toString()
    {
        String res = "";
        for(KhachHang x:dsKhachHang)
        {
            res += x.toString() + "\n";
        }
        return res.trim();
    }
}
