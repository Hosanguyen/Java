package J05005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        for(int i = 0; i<t; i++)
        {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sc.nextLine();
            list.add(sv);
        }
        Collections.sort(list, new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien o1, SinhVien o2)
           {
            if(o1.getGPA()>=o2.getGPA())
            {
                return -1;
            }    
            else
            {
                return 1;
            }
           } 
        });
        for(SinhVien x:list)
        {
            System.out.println(x.toString());
        }
        sc.close();
    }
}
