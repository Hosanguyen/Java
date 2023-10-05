import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Set<String> set = new TreeSet<>();
        while(sc.hasNext())
        {
            String s = sc.next().toLowerCase();
            set.add(s);
        }
        for(String x:set)
        {
            System.out.println(x);
        }
    }
}
