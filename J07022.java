import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws IOException { 
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(true)
        {
            while(sc.hasNextInt())
            {
                sc.nextInt();
            }
            if(!sc.hasNext())
            {
                break;
            }
            while(sc.hasNext())
            {
                if(sc.hasNextInt())
                {
                    break;
                }
                list.add(sc.next());
            }
        }
        Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2)
           {
            return o1.compareTo(o2);
           } 
        });
        for(String x:list)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        sc.close();
    }
}
