package J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for(int i = 0; i<n; i++)
        {
            Time tmp = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            list.add(tmp);
        }
        Collections.sort(list, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2)
            {
                if(o1.getHour()<o2.getHour())
                {
                    return -1;
                }
                else
                {
                    if(o1.getHour()>o2.getHour())
                    {
                        return 1;
                    }
                    else
                    {
                        if(o1.getMin()<o2.getMin())
                        {
                            return -1;
                        }
                        else
                        {
                            if(o1.getMin()>o2.getMin())
                            {
                                return 1;
                            }
                            else
                            {
                                if(o1.getSec()<=o2.getSec())
                                {
                                    return -1;
                                }
                                else
                                {
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
        });
        for(Time x:list)
        {
            System.out.println(x.toString());
        }
        sc.close();
    }
}
