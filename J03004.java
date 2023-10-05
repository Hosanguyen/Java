import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            //String res = chuan_hoa(s);
            System.out.println(chuan_hoa(s));
        }
        sc.close();
    }
    static String chuan_hoa(String s)
    {
        String st = s.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] tmp = st.split(" ");
        st = "";
        for(String x:tmp)
        {
            st += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1);
            st += " ";
        }
        return st;
    }
}
