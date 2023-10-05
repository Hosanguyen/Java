package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> set = new TreeSet<>();
    public WordSet(String file) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext())
        {
            set.add(sc.next().toLowerCase());
        }
        sc.close();
    }
    @Override
    public String toString()
    {
        String res = "";
        for(String x:set)
        {
            res += x + '\n';
        }
        res = res.trim();
        return res;
    }
}
