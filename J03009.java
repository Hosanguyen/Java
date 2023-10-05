import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String[] s1 = sc.nextLine().split(" ");
            String[] s2 = sc.nextLine().split(" ");
            Set<String> set1 = new HashSet<String>();
            Set<String> set2 = new HashSet<String>();
            for(String x:s1)
            {
                set1.add(x);
            }
            for(String x:s2)
            {
                set2.add(x);
            }
            set1.removeAll(set2);
            Iterator<String> it = set1.iterator();
            while(it.hasNext())
            {
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }       
        sc.close();
    }    
}