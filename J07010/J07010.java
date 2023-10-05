package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine()) ;
        ArrayList<SinhVien> list = new ArrayList<>();
        while(t-->0)
        {
            SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            list.add(tmp);
        }
        for(SinhVien x:list)
        {
            System.out.println(x.toString());
        }
        sc.close();
    }
}
