package J07051;

import java.util.Date;

public class KhachHang {
    private String ma, name, soPhong;
    private Date ngayNhan, ngayTra;
    private int phiDichVu;
    private int soNgay;
    private int thanhTien;
    private static int solg = 0;
    public KhachHang(String name, String soPhong, Date ngayNhan, Date ngayTra, int phiDichVu)
    {
        solg++;
        if(solg<10)
        {
            ma = "KH0" + String.valueOf(solg);
        }
        else
        {
            ma = "KH" + String.valueOf(solg);
        }

        this.name = name;
        chuanHoaName();

        this.soPhong = soPhong;

        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.soNgay = (int) ((this.ngayTra.getTime() - this.ngayNhan.getTime())/(24*3600*1000)) + 1;

        this.phiDichVu = phiDichVu;
    }
    private void chuanHoaName()
    {
        String res = "";
        this.name = this.name.trim().replaceAll("\\s+", " ").toLowerCase();
        for(String x:this.name.split(" "))
        {
            res += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1);
            res += " ";
        }
        this.name = res.trim();
    }

    public String getSoPhong()
    {
        return soPhong;
    }

    public int getTienPhong()
    {
        return thanhTien;
    }

    public void setThanhTien(int tienPhong)
    {
        this.thanhTien = this.soNgay*tienPhong + this.phiDichVu;
    }

    @Override
    public String toString()
    {
        return ma + " " + name + " " + soPhong + " " + soNgay + " " + thanhTien;
    }
}
