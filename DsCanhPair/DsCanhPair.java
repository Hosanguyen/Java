package DsCanhPair;

import java.util.ArrayList;
import java.util.Scanner;

public class DsCanhPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                int x = sc.nextInt();
                if(j>i && x==1)
                {
                    Pair<Integer, Integer> tmp = new Pair<>(i+1, j+1);
                    list.add(tmp);
                }
            }
        }
        for(Pair<Integer, Integer> x:list)
        {
            System.out.println(x);
        }
        sc.close();
    }
}
