package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        while(t-->0)
        {
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list.add(dn);
        }
        Collections.sort(list, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2)
            {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(DoanhNghiep x:list)
        {
            System.out.println(x);
        }
    }
}
