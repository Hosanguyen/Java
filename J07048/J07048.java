package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        while(t-->0)
        {
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            list.add(sp);
        }
        Collections.sort(list, new Comparator<SanPham>() {
           @Override
           public int compare(SanPham o1, SanPham o2)
           {
            if(o1.getGiaBan()==o2.getGiaBan())
            {
                return o1.getMa().compareTo(o2.getMa());
            }
            return -o1.getGiaBan() + (o2.getGiaBan());
           } 
        });
        for(SanPham sp:list)
        {
            System.out.println(sp);
        }
    }   
}
