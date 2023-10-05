import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("JAVA\\DATA.in"));
        long sum = 0;
        while(true)
        {
            while(sc.hasNextInt())
            {
                sum += sc.nextInt();
            }
            if(!sc.hasNext())
            {
                break;
            }
            else
            {
                sc.next();
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
