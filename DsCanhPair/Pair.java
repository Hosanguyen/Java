package DsCanhPair;

public class Pair<K, V> {

    private K key;
    private V value;
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "(" +  String.valueOf(key) + "," + String.valueOf(value) + ")";
    }
}
