import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07008 {
    private static ArrayList<String> list = new ArrayList<>();
    private static ArrayList<Integer> a = new ArrayList<>();
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int x;
            x = sc.nextInt();
            a.add(x);
        }
        sinhnhiphan(1, "");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2)
            {
                return o1.compareTo(o2);
            }
        });
        for(String x:list)
        {
            System.out.println(x);
        }
        sc.close();
    }
    public static boolean check(String s)
    {
        String[] tmp = s.split(" ");
        if(tmp.length<2)
        {
            return false;
        }
        int i = 1;
        while(i<tmp.length)
        {
            if(Integer.parseInt(tmp[i]) < Integer.parseInt(tmp[i-1]))
            {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void sinhnhiphan(int i, String s)
    {
        for(int j = 0; j<=1; j++)
        {
            if(j==1)
            {
                s += String.valueOf(a.get(i-1)) + " ";
            }
            if(i==a.size())
            {
                if(check(s))
                {
                    list.add(s.trim());
                }
            }
            else
            {
                sinhnhiphan(i+1, s);
            }
        }
    }
}
