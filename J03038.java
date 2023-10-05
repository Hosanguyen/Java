import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> set = new HashSet<String>();
        for(int i = 0; i<s.length(); i++)
        {
            set.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(set.size());
        sc.close();
    }
}
