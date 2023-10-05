package J04003;
import java.util.Scanner;

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        PhanSo ps = new PhanSo(a, b);
        System.out.println(ps.toString());
        sc.close();        
    }
}