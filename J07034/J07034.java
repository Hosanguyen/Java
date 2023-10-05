package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Java\\DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        while(t-->0)
        {
            MonHoc mon = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list.add(mon);
        }
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });   
        for(MonHoc x:list)
        {
            System.out.println(x);
        }
        sc.close();
    }
}
