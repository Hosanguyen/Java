package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> list = new ArrayList<>();
        for(int i = 0; i<n; i++)
        {
            MatHang tmp = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            list.add(tmp);
        }
        Collections.sort(list, new Comparator<MatHang>() {
           @Override
           public int compare(MatHang o1, MatHang o2)
           {
            if(o1.getLoiNhuan()>o2.getLoiNhuan())
            {
                return -1;
            }
            else
            {
                if(o1.getLoiNhuan()<o2.getLoiNhuan())
                {
                    return 1;
                }
                else
                {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
           } 
        });
        for(MatHang x:list)
        {
            System.out.println(x.toString());
        }
        sc.close();
    }
}
