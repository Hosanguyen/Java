package J07050;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        while(t-->0)
        {
            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            list.add(x);
        }
        sc.close();
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2)
            {
                if(o1.getLoiNhuan()<o2.getLoiNhuan())
                {
                    return 1;
                }
                return -1;
            }
        });
        for(MatHang x:list)
        {
            System.out.println(x);
        }
    }
}
