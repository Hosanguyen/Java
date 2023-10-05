import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true)
        {
            String s = sc.nextLine();
            if(s.compareTo("END")==0)
            {
                break;
            }
            s = s.trim().replaceAll("\\s+", " ").toLowerCase();
            String[] st = s.split(" ");
            String res = "";
            for(String x:st)
            {
                res += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
            }
            res = res.trim();
            System.out.println(res);
        }
    }
}
