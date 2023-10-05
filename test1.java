import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class KhachHang {
    String maKhachHang;
    String hoTen;
    String maPhong;
    Date ngayDen;
    Date ngayDi;
    int soNgayLuutru;

    public KhachHang(String hoTen, String maPhong, Date ngayDen, Date ngayDi) {
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.soNgayLuutru = (int) ((ngayDi.getTime() - ngayDen.getTime()) / (1000 * 60 * 60 * 24));
    }
}

public class test1 {
    public static void main(String[] args) {
        List<KhachHang> danhSachKhachHang = new ArrayList<>();

        try {
            File file = new File("KHACH.in");
            Scanner scanner = new Scanner(file);

            int soLuongKhachHang = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < soLuongKhachHang; i++) {
                String hoTen = scanner.nextLine();
                String maPhong = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date ngayDen = sdf.parse(scanner.nextLine());
                Date ngayDi = sdf.parse(scanner.nextLine());

                KhachHang khachHang = new KhachHang(hoTen, maPhong, ngayDen, ngayDi);
                danhSachKhachHang.add(khachHang);
            }

            scanner.close();

            // Sắp xếp danh sách khách hàng theo số ngày lưu trú giảm dần
            Collections.sort(danhSachKhachHang, new Comparator<KhachHang>() {
                @Override
                public int compare(KhachHang kh1, KhachHang kh2) {
                    return kh2.soNgayLuutru - kh1.soNgayLuutru;
                }
            });

            // In ra danh sách đã sắp xếp
            for (int i = 0; i < danhSachKhachHang.size(); i++) {
                KhachHang khachHang = danhSachKhachHang.get(i);
                System.out.println("Mã khách hàng: KH" + (i + 1));
                System.out.println("Họ tên: " + khachHang.hoTen);
                System.out.println("Mã phòng: " + khachHang.maPhong);
                System.out.println("Số ngày lưu trú: " + khachHang.soNgayLuutru);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
