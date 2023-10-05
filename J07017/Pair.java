package J07017;

public class Pair<K, V> {

    private K key;
    private V value;
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    private boolean nt(Integer n)
    {
        if(n==2)
        {
            return true;
        }
        if(n%2==0 || n<2)
        {
            return false;
        }
        for(int i = 3; i<= Math.sqrt(n); i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime()
    {
        Integer Key = Integer.valueOf( String.valueOf(key));
        Integer Value = Integer.valueOf(String.valueOf(value));
        if(nt(Key) && nt(Value))
        {
            return true;
        }
        return false;
    }    

    @Override
    public String toString()
    {
        return String.valueOf(key) + " " + String.valueOf(value);
    }
}
