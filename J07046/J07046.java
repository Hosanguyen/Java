package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0)
        {
            KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), form.parse(sc.nextLine()), form.parse(sc.nextLine()) );
            list.add(kh);
        }
        Collections.sort(list, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2)
            {
                if(o1.getNgayLuuTru()<o2.getNgayLuuTru())
                {
                    return 1;
                }
                return -1;
            }
        });
        for(KhachHang kh:list)
        {
            System.out.println(kh);
        }
    }
}
