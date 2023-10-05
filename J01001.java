import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        if (x <= 0 || y <= 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println((x+y)*2 + " " + x*y);
        }   
        sc.close(); 
    }
}
