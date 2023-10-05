import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String a, b;
            a = sc.next();
            b = sc.next();
            System.out.println(sub(a, b));
        }
        sc.close();
    }
    public static String sub(String a, String b)
    {
        int sz = Math.max(a.length(), b.length());
        while(a.length()<b.length())
        {
            a = "0" + a;
        }
        while(b.length()<a.length())
        {
            b = "0" + b;
        }
        for(int i = 0; i<a.length(); i++)
        {
            if(a.charAt(i) < b.charAt(i))
            {
                String tmp = a;
                a = b;
                b = tmp;
                break;
            }
            else
            {
                if(a.charAt(i)>b.charAt(i))
                {
                    break;
                }
            }
        }
        int memo = 0;
        String res = "";
        for(int i = a.length()-1; i>=0; i--)
        {
            int ofa = a.charAt(i) - '0' - memo;
            int ofb = b.charAt(i) - '0';
            if(ofa<ofb)
            {
                ofa += 10;
                memo = 1;
            }
            else
            {
                memo = 0;
            }
            res = String.valueOf(ofa - ofb) + res;
        }
        res = res.substring(a.length() - sz);
        return res;
    }
}
