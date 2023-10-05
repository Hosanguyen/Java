import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> mp = new LinkedHashMap<>();
        while(t-->0)
        {
            String s = sc.nextLine();
            s = s.trim().toLowerCase().replaceAll("\\s+", " ");
            String[] st = s.split(" ");
            s = st[st.length-1];
            for(int i = 0; i<st.length-1; i++)
            {
                s += String.valueOf(st[i].charAt(0));
            }
            if(mp.containsKey(s))
            {
                int cnt = mp.get(s);
                cnt++;
                System.out.println(s + cnt + "@ptit.edu.vn");
                mp.put(s, cnt);
            }
            else
            {
                System.out.println(s + "@ptit.edu.vn");
                mp.put(s, 1);
            }
        }
        sc.close();
    }
}
