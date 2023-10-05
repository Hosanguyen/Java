import java.util.Scanner;
import java.lang.String;

public class Solocphat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       while(t-->0)
       {
        String s = sc.nextLine();
        if(s.endsWith("86"))
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
