import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String[] s = sc.nextLine().split(" ");
            String res = "";
            for(String x:s)
            {
                StringBuilder st = new StringBuilder(x);
                res += st.reverse().toString() + " ";
            }
            System.out.println(res);
        }
        sc.close();
    }
}
