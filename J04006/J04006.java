package J04006;

import java.util.Scanner;

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen, lop, dob;
        double gpa;
        hoTen = sc.nextLine();
        lop = sc.nextLine();
        dob = sc.nextLine();
        gpa = sc.nextFloat();
        SinhVien sv = new SinhVien(hoTen, lop, dob, gpa);
        System.out.println(sv.toString());
        sc.close();
    }

}
