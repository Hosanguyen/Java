package J04002;

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange h = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(h.getHeight()>0 && h.getWidth()>0)
        {
            h.chuanHoaColor();
            System.out.println( (int)h.findPerimeter() + " " + (int)h.findArea() + " " + h.getColor());
        }
        else
        {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
