package J01025;

import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point h1_leftDown = new Point(sc.nextInt(), sc.nextInt());
        Point h1_rightUp = new Point(sc.nextInt(), sc.nextInt());
        Point h2_leftDown = new Point(sc.nextInt(), sc.nextInt());
        Point h2_RightUp = new Point(sc.nextInt(), sc.nextInt());
        HCN h1 = new HCN(h1_leftDown, h1_rightUp);
        HCN h2 = new HCN(h2_leftDown, h2_RightUp);
        HCN hinhvuong = HCN.HinhVuong(h1, h2);
        System.out.println(hinhvuong.dienTich());
        sc.close();
    }    
}
