import java.util.Scanner;

public class J01004 {
   public static boolean sont(int a)
   {
    if(a < 2) return false;
    if(a==2) return true;
    for(int i = 3; i<= Math.sqrt(a); i+=2)
    {
        if(a%i==0)return false;
    }
    return true;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    for(int r = 1; r<=t; r++)
    {
        int n;
        n = sc.nextInt();
        if(sont(n))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    sc.close();
   }
}

