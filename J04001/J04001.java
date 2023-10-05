package J04001;
import java.util.Scanner;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            double a, b, c, d;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            d = sc.nextDouble();
            Point p1 = new Point(a, b);
            Point p2 = new Point(c, d);
            System.out.printf("%.4f\n", Point.distance(p1, p2));    
        }
        sc.close();
    }
}

