package J07051;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class J07051 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyy");
        while(t-->0)
        {
            KhachHang x = new KhachHang(sc.nextLine(), sc.nextLine(), form.parse(sc.nextLine()) , form.parse(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            list.add(x);
        }
        QuanLy manager = new QuanLy(list);
        manager.setTienPhong();
        manager.sort();
        System.out.println(manager);
    }
}
