package J04004;

import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a, b;
        a = new PhanSo(sc.nextLong(), sc.nextLong());
        b = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo c = PhanSo.sum(a, b);
        System.out.println(c.toString());
        sc.close();
    }
}
