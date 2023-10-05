package J04008;

import java.util.Scanner;

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            Triangle a = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));
            if(!a.checkTriangle())
            {
                System.out.println("INVALID");
            }
            else
            {
                System.out.println(String.format("%.3f", a.findPerimeter()));
            }
        }
        sc.close();
    }
}
