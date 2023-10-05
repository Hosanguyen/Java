package J07046;

import java.util.Date;

public class KhachHang {
    private String maKH, name, maPhong;
    private Date ngayDen, ngayDi;
    private int ngayLuuTru;
    private static int solg = 0;

    public KhachHang(String name, String maPhong, Date ngayDen, Date ngayDi)
    {
        solg++;
        if(solg<10)
        {
            this.maKH = "KH0" + String.valueOf(solg);
        }
        else
        {
            this.maKH = "KH" + String.valueOf(solg);
        }
        this.name = name;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        // int dd = Integer.parseInt(this.ngayDi.substring(0, 2)) - Integer.parseInt(this.ngayDen.substring(0, 2)) ;
        // int mm = Integer.parseInt(this.ngayDi.substring(3 , 5)) - Integer.parseInt(this.ngayDen.substring(3, 5)) ;
        // int yy = Integer.parseInt(this.ngayDi.substring(6)) - Integer.parseInt(this.ngayDen.substring(6));
        // this.ngayLuuTru = yy*365 + mm*30 + dd;
        this.ngayLuuTru = (int) ((this.ngayDi.getTime() - this.ngayDen.getTime()) / (1000*3600*24));
    }
    public int getNgayLuuTru()
    {
        return this.ngayLuuTru;
    }
    @Override
    public String toString()
    {
        return maKH + " " + name + " " + maPhong + " " + ngayLuuTru;
    }
}
