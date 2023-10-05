import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            System.out.println(chuan_hoa(s));
        }
        sc.close();
    }
    static String chuan_hoa(String s)
    {
        s = s.trim().toLowerCase().replaceAll("\\s++", " ");
        String[] tmp = s.split(" ");
        s = "";
        for(int i = 1; i<tmp.length; i++)
        {
            s += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
            s += " ";
        }
        s = s.trim();
        s += ", " + tmp[0].toUpperCase();
        return s;
    }
}
