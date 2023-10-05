import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> mp = new HashMap<>();
        while(sc.hasNextInt())
        {
            int x = sc.nextInt();
            if(mp.containsKey(x))
            {
                int y = mp.get(x);
                y++;
                mp.put(x, y);
            }
            else
            {
                mp.put(x, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: mp.entrySet() )
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
